package com.example.example_three.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfiguration 
{
	@Bean
	public String name()
	{
		return "Naveen Kumar Nakshatram";				
	}
	
	@Bean
	public float salary()
	{
		return 10000.25f;
	}
	
	
}
