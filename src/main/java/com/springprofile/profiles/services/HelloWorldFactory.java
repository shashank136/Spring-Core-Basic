package com.springprofile.profiles.services;

public class HelloWorldFactory {
	
	public HelloWorldService createHelloWorldService(String language) {
		
		HelloWorldService service = null;
		
		switch(language){
			case "en":
				service = new HelloWorldServiceEngImpl();
				break;
			case "fr":
				service = new HelloWorldServiceFrenchImpl();
				break;
			default: new HelloWorldServiceEngImpl();
		}
		
		return service;
	}

}
