package com.arun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SwaggerMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerMicroserviceApplication.class, args);
	}
	
	@RestController
	class HelloWorldController {
		
		@RequestMapping("/")
		public Greet greeting() {
			return new Greet("Hello World!");
		}
	}
	
	class Greet {
		private String message;
		
		public Greet(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
		
		
		
	}
}
