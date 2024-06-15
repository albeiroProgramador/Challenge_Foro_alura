package com.ChallengeAlura.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// Class definition
public class ApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
		System.out.println("Ejecutandose en el puerto 8080");

	}

}
