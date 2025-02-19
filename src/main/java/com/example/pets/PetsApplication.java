package com.example.pets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class PetsApplication {

	public static void main(String[] args) {
		System.out.println("Test It's working");
		SpringApplication.run(PetsApplication.class, args);
	}

}
