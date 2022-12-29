package com.te.productvariation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class ProductvariationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductvariationApplication.class, args);
	}
}
