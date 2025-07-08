package com.example.example_9;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class Student
{
	Marks marks;
	
	public Student(Marks marks)
	{
		System.out.println("Student Coponent Constructor....!");
		this.marks = marks;
		System.out.println("Object initialization is finished....");
	}
	
	// this method is called after constructor is called by spring ....!
	@PostConstruct
	public void displayMarks()
	{
		System.out.println(marks.total());
	}
	
	@PreDestroy
	public void cleanup()
	{
		System.out.println("Cleanup");
	}
}

@Component
class Marks
{
	public int total()
	{
		return 456;
	}
}


@Configuration
@ComponentScan
public class PostConstructPreDestroy {

	public static void main(String[] args) 
	{
		var context = new AnnotationConfigApplicationContext(PostConstructPreDestroy.class);
		
		context.close(); // <---  This will trigger the @preDestroy
	}
}
