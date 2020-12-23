package com.emrekumas.marvelousapiclient.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RandomJokeResponse {
    private int id;
    private String type;
    private String setup;
    private String punchline;
}
