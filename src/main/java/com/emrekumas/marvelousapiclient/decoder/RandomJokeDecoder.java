package com.emrekumas.marvelousapiclient.decoder;

import com.emrekumas.marvelousapiclient.exception.MarvelousApiClientException;
import com.emrekumas.marvelousapiclient.model.MarvelousApiClientResponse;
import com.emrekumas.marvelousapiclient.model.RandomJokeResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.ErrorDecoder;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class RandomJokeDecoder implements ErrorDecoder {
    private final ObjectMapper objectMapper;

    public RandomJokeDecoder() {
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public Exception decode(String s, Response response) {
        MarvelousApiClientResponse<RandomJokeResponse> apiResponse;

        try (Reader reader = response.body().asReader(StandardCharsets.UTF_8)) {
            apiResponse = objectMapper.readValue(reader, objectMapper.constructType(MarvelousApiClientResponse.class));
        } catch (IOException e) {
            apiResponse = createErrorResponse(e.getMessage());
        }

        return new MarvelousApiClientException(apiResponse, response.status());
    }

    private MarvelousApiClientResponse<RandomJokeResponse> createErrorResponse(String exception) {
        return MarvelousApiClientResponse.<RandomJokeResponse>builder()
                .error(true)
                .errorDescription(exception)
                .build();
    }
}
