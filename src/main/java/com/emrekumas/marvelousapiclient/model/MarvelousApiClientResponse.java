package com.emrekumas.marvelousapiclient.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MarvelousApiClientResponse<T> {
    private T data;
    private boolean error;
    private String errorDescription;
}
