package com.springprofile.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.springprofile.profiles.services.HelloWorldService;
import com.springprofile.profiles.services.HelloWorldServiceEngImpl;
import com.springprofile.profiles.services.HelloWorldServiceFrenchImpl;

@Configuration
public class JavaConfiguration {
	
	@Bean
	@Profile("english")
	public HelloWorldService helloWorldServiceEngImpl() {
		return new HelloWorldServiceEngImpl();
	}
	
	@Bean
	@Profile("french")
	public HelloWorldService helloWorldServiceFrenchImpl() {
		return new HelloWorldServiceFrenchImpl();
	}

}
