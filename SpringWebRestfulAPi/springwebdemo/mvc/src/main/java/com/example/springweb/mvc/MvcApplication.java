package com.example.springweb.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class MvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcApplication.class, args);
	}

}
