package com.emrekumas.marvelousapiclient.annotation;

import com.emrekumas.marvelousapiclient.configuration.MarvelousApiClientConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(MarvelousApiClientConfiguration.class)
public @interface EnableMarvelousApiClient {}
