package com.springprofile.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.springprofile.profiles.services.HelloWorldFactory;
import com.springprofile.profiles.services.HelloWorldService;

@Configuration
public class JavaConfiguration {
	
	@Bean
	public HelloWorldFactory helloWorldFactory() {
		return new HelloWorldFactory();
	}
	
	@Bean
	@Profile("english")
	public HelloWorldService helloWorldServiceEngImpl(HelloWorldFactory factory) {
		return factory.createHelloWorldService("en");
	}
	
	@Bean
	@Profile("french")
	public HelloWorldService helloWorldServiceFrenchImpl(HelloWorldFactory factory) {
		return factory.createHelloWorldService("fr");
	}

}
