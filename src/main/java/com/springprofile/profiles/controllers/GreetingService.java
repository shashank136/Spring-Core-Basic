package com.springprofile.profiles.controllers;

import org.springframework.stereotype.Controller;

import com.springprofile.profiles.services.HelloWorldService;

@Controller
public class GreetingService {
	
	private HelloWorldService helloWorldService;
	
	
	
	public GreetingService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}



	public void getMessage() {
		System.out.println("Inside GreetingService Controller");
		helloWorldService.sayHello();
	}
	

}
