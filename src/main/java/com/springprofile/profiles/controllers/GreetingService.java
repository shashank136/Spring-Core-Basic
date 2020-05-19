package com.springprofile.profiles.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.springprofile.profiles.services.HelloWorldService;

public class GreetingService {
	
	private HelloWorldService helloWorldService;
	
	private HelloWorldService helloWorldServiceSpanish;
	
	private HelloWorldService helloWorldServiceHindi;
	
	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	public void setHelloWorldServiceSpanish(HelloWorldService helloWorldServiceSpanish) {
		this.helloWorldServiceSpanish = helloWorldServiceSpanish;
	}
	
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
