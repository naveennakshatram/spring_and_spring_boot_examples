package com.example.example_three.Person;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



record Person(String name,long contact) {};


@Configuration
public class PersonConfiguration 
{
	
	// we can customise the bean name by passing parameter to Annotation.
   @Bean(name="Naveen")
   public Person personDetails()
   {
	   return new Person("Ravi",7467121);
   }
}
