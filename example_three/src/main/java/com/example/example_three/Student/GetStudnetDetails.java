package com.example.example_three.Student;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GetStudnetDetails 
{
	public static void main(String np[])
	{
		
		var context = new AnnotationConfigApplicationContext(StudentConfiguration.class);
		
		var student = context.getBean("studentDetails");
		
		System.out.println(student);	
		
	}
}
