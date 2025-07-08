package com.example.example_three;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpring {

	public static void main(String[] args)
	{
		
		// Step-1 : Launch a spring context		
		 
		var context = new AnnotationConfigApplicationContext(HelloWorldSpringConfigurtion.class);

	    
		// Using context reference calling configuration beans.
		// we are using getBeans method to get the bean and need to pass method name as a param.
		
		System.out.println(context.getBean("name"));
	
	}

}
