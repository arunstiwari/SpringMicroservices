package com.arun;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HateoasImplApplication {

	public static void main(String[] args) {
		SpringApplication.run(HateoasImplApplication.class, args);
	}
	
	
	@RestController
	class GreetingController{
		
		@RequestMapping("/greeting")
		@ResponseBody
		public HttpEntity<Greet> greeeting(@RequestParam(value="name", required=false, defaultValue="HATEOAS") String name){
			Greet greet = new Greet("Hello "+name);
			greet.add(linkTo(ControllerLinkBuilder.methodOn(GreetingController.class).greeeting(name)).withSelfRel());
			return new ResponseEntity<HateoasImplApplication.Greet>(greet,HttpStatus.OK);
		}
	}
	
	class Greet extends ResourceSupport {
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
