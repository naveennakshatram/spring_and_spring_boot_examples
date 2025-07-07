package com.example.example_three.Person;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonData {

	public static void main(String[] args)
	{
		var context = new AnnotationConfigApplicationContext(PersonConfiguration.class);
		
		
		System.out.println(context.getBean("Naveen"));
		
		
		//The below line will return because the bean name is modified........!
		
		//System.out.println(context.getBean("personDetails"));
		
		
		// We can use class type in getBean() method.
		System.out.println(context.getBean(Person.class));

	}

}
