package com.example.exapmple_three.employee;

import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeDetails
{
	@Bean
    public HashMap<String, String> empDetails()
    {
    	
    	HashMap<String,String> details = new HashMap<String, String>();
    	
    	details.put("Name", "Naveen kumar Nakshatram");
    	details.put("salary", "10500.00");
    	details.put("contact", "+447467121033");
    	
    	return details;
    }
}
