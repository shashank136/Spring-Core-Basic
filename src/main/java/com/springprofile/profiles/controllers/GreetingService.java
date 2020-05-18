package com.springprofile.profiles.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.springprofile.profiles.services.HelloWorldService;
import com.springprofile.profiles.services.HelloWorldServiceSpanishImpl;

@Controller
public class GreetingService {
	
	private HelloWorldService helloWorldService;
	
	private HelloWorldService helloWorldServiceSpanish;
	
	@Autowired
	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	@Autowired
	@Qualifier("helloWorldServiceSpanish") // Qualifiers takes the name of the method that implements the bean
	public void setHelloWorldServiceSpanish(HelloWorldService helloWorldServiceSpanish) {
		this.helloWorldServiceSpanish = helloWorldServiceSpanish;
	}

	public void getMessage() {
		System.out.println("Inside GreetingService Controller");
		helloWorldService.sayHello();
		helloWorldServiceSpanish.sayHello();
	}
	

}
