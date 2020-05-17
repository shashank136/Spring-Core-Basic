package com.springprofile.profiles.services;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldServiceEngImpl implements HelloWorldService{

	@Override
	public void sayHello() {
		System.out.println("Hello World!!!");		
	}

}
