package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class RestServiceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceDemoApplication.class, args);
	}
}
