package com.springprofile.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springprofile.profiles.controllers.GreetingService;

@SpringBootApplication
@ComponentScan("com.springprofile")
public class ProfilesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ProfilesApplication.class, args);
		
		GreetingService greetings = (GreetingService) ctx.getBean("greetingService");
		greetings.getMessage();
	}

}
