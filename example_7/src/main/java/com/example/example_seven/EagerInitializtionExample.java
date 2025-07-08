package com.example.example_seven;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
class Student
{
	Marks marks;
	
	public Student(Marks marks)
	{
		System.out.println("Component Initialized....!");
		this.marks = marks;
	}
}

@Component
class Marks
{
	public int total_marks()
	{
		return 456;
	}
}

@Configuration
@ComponentScan
public class EagerInitializtionExample 
{
	public static void main(String np[])
	{
		var context = new AnnotationConfigApplicationContext(EagerInitializtionExample.class);
		System.out.println("Component Initialization Finished....!");
		
		
	}
}
