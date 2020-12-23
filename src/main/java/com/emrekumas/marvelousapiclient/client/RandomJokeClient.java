package com.emrekumas.marvelousapiclient.client;

import com.emrekumas.marvelousapiclient.decoder.RandomJokeDecoder;
import com.emrekumas.marvelousapiclient.model.RandomJokeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "randomjokeapi", url = "${randomjokeapi.url}", configuration = RandomJokeDecoder.class)
public interface RandomJokeClient {
    @GetMapping
    RandomJokeResponse getRandomJoke();
}
