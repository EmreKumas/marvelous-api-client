package com.emrekumas.marvelousapiclient.proxy;

import com.emrekumas.marvelousapiclient.client.RandomJokeClient;
import com.emrekumas.marvelousapiclient.exception.MarvelousApiClientException;
import com.emrekumas.marvelousapiclient.model.MarvelousApiClientResponse;
import com.emrekumas.marvelousapiclient.model.RandomJokeResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class MarvelousApiClientProxy {
    private final RandomJokeClient randomJokeClient;

    public MarvelousApiClientResponse<RandomJokeResponse> getRandomJoke() {
        RandomJokeResponse response = randomJokeClient.getRandomJoke();

        log.info("getRandomJoke request received. Response: {}", response);

        if(response == null){
            MarvelousApiClientResponse<RandomJokeResponse> errorResponse = MarvelousApiClientResponse.<RandomJokeResponse>builder()
                    .error(true)
                    .errorDescription("RandomJokeClient returned null response!")
                    .build();
            throw new MarvelousApiClientException(errorResponse, HttpStatus.BAD_REQUEST.value());
        }

        return MarvelousApiClientResponse.<RandomJokeResponse>builder()
                .data(response)
                .build();
    }
}
