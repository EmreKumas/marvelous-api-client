package com.emrekumas.marvelousapiclient.configuration;

import com.emrekumas.marvelousapiclient.client.RandomJokeClient;
import com.emrekumas.marvelousapiclient.proxy.MarvelousApiClientProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@EnableFeignClients(clients = RandomJokeClient.class)
@ComponentScan(basePackageClasses = MarvelousApiClientProxy.class)
@Configuration
@PropertySource(value = "classpath:marvelousapiclient-application.yaml", factory = YamlPropertySourceFactory.class)
public class MarvelousApiClientConfiguration {
}
