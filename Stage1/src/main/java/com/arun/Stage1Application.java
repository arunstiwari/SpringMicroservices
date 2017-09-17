package com.arun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Stage1Application {

	public static void main(String[] args) {
		SpringApplication.run(Stage1Application.class, args);
	}
	
	
	@RestController
	class HelloWorldController {
		
		@GetMapping("/")
		public String hello() {
			return "Hello World!";
		}
	}
}
