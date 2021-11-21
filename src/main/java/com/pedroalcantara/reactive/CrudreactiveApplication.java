package com.pedroalcantara.reactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@EnableAsync
@SpringBootApplication
public class CrudreactiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudreactiveApplication.class, args);
    }

}
