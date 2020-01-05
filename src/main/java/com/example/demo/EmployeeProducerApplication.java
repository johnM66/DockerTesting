package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@ComponentScan("com.example.controller")
public class EmployeeProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeProducerApplication.class, args);
	}

}
