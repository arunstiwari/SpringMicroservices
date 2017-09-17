package com.arun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@SpringBootApplication
public class ReactiveSpringMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveSpringMicroserviceApplication.class, args);
	}
	
	@RestController
	class GreetingController {
		
		@RequestMapping("/")
		public Mono<Greet> greet(){
			return Mono.just(new Greet("Hello World!"));
		}
	}
	
}
