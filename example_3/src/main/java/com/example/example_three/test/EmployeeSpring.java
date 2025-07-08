package com.example.example_three.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeSpring 
{
	public static void main(String np[])
	{
	     var context = new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
	     
	     System.out.println(context.getBean("name"));
	     
	     System.out.println(context.getBean("salary"));
		
	}	
}
