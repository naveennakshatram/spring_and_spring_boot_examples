package com.example.example_three;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldSpringConfigurtion 
{
	@Bean
	public String name() {
		return "Naveen Kumar Nakshatram";
	}
	
}
