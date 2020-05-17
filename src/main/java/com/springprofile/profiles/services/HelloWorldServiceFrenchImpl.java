package com.springprofile.profiles.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("french")
public class HelloWorldServiceFrenchImpl implements HelloWorldService{

	@Override
	public void sayHello() {
		System.out.println("Bonjour le monde!!!");		
	}

}
