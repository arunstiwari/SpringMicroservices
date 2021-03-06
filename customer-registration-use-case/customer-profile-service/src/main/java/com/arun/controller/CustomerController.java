package com.arun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arun.component.CustomerRegistrar;
import com.arun.entity.Customer;

import reactor.core.publisher.Mono;

@RestController
public class CustomerController {

	@Autowired
	CustomerRegistrar customerRegistrar;
	
	@RequestMapping(path="/register",method=RequestMethod.POST)
	Mono<Customer> register(@RequestBody Customer customer) {
		return customerRegistrar.register(customer);
	}
}
