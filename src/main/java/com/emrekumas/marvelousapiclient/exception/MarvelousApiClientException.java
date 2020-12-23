package com.emrekumas.marvelousapiclient.exception;

import com.emrekumas.marvelousapiclient.model.MarvelousApiClientResponse;
import lombok.Getter;

@Getter
public class MarvelousApiClientException extends RuntimeException{

    private final MarvelousApiClientResponse<?> response;
    private final int status;

    public MarvelousApiClientException(MarvelousApiClientResponse<?> response, int status) {
        this.response = response;
        this.status = status;
    }
}
