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
	
	private HelloWorldService helloWorldServiceHindi;
	
	@Autowired
	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	@Autowired
	@Qualifier("helloWorldServiceSpanish") // Qualifiers takes the name of the method that implements the bean
	public void setHelloWorldServiceSpanish(HelloWorldService helloWorldServiceSpanish) {
		this.helloWorldServiceSpanish = helloWorldServiceSpanish;
	}
	
	@Autowired
	@Qualifier("hindi") // Qualifier also takes bean name which is more convenient then given the method name 
	public void setHelloWorldServiceHindi(HelloWorldService helloWorldServiceHindi) {
		this.helloWorldServiceHindi = helloWorldServiceHindi;
	}

	public void getMessage() {
		System.out.println("Inside GreetingService Controller");
		helloWorldService.sayHello();
		helloWorldServiceSpanish.sayHello();
		helloWorldServiceHindi.sayHello();
	}
	

}
