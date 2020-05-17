package com.springprofile.profiles.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springprofile.profiles.services.HelloWorldService;

@Controller
public class GreetingService {
	
	private HelloWorldService helloWorldService;
	
	// Constructor based injection
	@Autowired
	public GreetingService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}



	public void getMessage() {
		System.out.println("Inside GreetingService Controller");
		helloWorldService.sayHello();
	}
	

}
