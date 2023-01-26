package com.example.dependency.controllers;

import org.springframework.stereotype.Controller;

import com.example.dependency.services.GreetingService;

@Controller
public class ConstructorInjectedController {
	
	
	private final GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		//super();
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	
	
	

}
