package com.example.example_three.reuse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name,int age) {};


@Configuration
public class PersonBeanReuse
{
    // Creating 2 Beans 1)Name and 2)age
	
	@Bean
	public String name()
	{
		return "Naveen Kumar Nakshatram";
	}
	
	@Bean
	public int age()
	{
		return 23;
	}
	
	// using record Person class in Bean
	@Bean
	public Person person()
	{
		return new Person("NNK",23);
	}
	
	
	// reusing name and age beans
	@Bean
	public Person person2()
	{
		return new Person(name(),age());
	}
	
}
