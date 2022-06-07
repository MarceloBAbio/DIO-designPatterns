package com.patternsinspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PatternsInSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternsInSpringApplication.class, args);
	}

}
