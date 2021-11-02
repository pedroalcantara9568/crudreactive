package com.pedroalcantara.crudreactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.reactive.ReactiveManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveSecurityAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@EnableAsync
@SpringBootApplication(exclude = {ReactiveSecurityAutoConfiguration.class, ReactiveManagementWebSecurityAutoConfiguration.class})
public class CrudreactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudreactiveApplication.class, args);
	}

}
