package com.emrekumas.marvelousapiclient.proxy;

import com.emrekumas.marvelousapiclient.client.RandomJokeClient;
import com.emrekumas.marvelousapiclient.model.MarvelousApiClientResponse;
import com.emrekumas.marvelousapiclient.model.RandomJokeResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class MarvelousApiClientProxy {
    private final RandomJokeClient randomJokeClient;

    public MarvelousApiClientResponse<RandomJokeResponse> getRandomJoke() {
        RandomJokeResponse response;
        try {
            response = randomJokeClient.getRandomJoke();
        } catch (Exception exception) {
            return getErrorResponse(exception.getMessage());
        }

        if (response == null) {
            return getErrorResponse("RandomJokeClient returned null response!");
        }

        log.info("getRandomJoke request received. Response: {}", response);

        return MarvelousApiClientResponse.<RandomJokeResponse>builder()
                .data(response)
                .build();
    }

    private MarvelousApiClientResponse<RandomJokeResponse> getErrorResponse(String errorDescription) {
        log.info("getRandomJoke request received but an error occurred. Error: {}", errorDescription);

        return MarvelousApiClientResponse.<RandomJokeResponse>builder()
                .error(true)
                .errorDescription(errorDescription)
                .build();
    }
}
