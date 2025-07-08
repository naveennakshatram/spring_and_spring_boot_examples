package com.example.example_seven.lazy_example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
@Lazy
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
public class LazyInitializtionExample 
{
	public static void main(String np[])
	{
		var context = new AnnotationConfigApplicationContext(LazyInitializtionExample.class);
		System.out.println("Component Initialization Finished....!");
		
	
		// You need to understand that the Component is initialisation is done 
		// after Configuration because of Lazy Initialiser.
		
		System.out.println(context.getBean(Student.class));
		
	}
}
