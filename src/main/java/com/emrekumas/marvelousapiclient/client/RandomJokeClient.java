package com.emrekumas.marvelousapiclient.client;

import com.emrekumas.marvelousapiclient.model.RandomJokeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "randomjokeapi", url = "${randomjokeapi.url}")
public interface RandomJokeClient {
    @GetMapping
    RandomJokeResponse getRandomJoke();
}
