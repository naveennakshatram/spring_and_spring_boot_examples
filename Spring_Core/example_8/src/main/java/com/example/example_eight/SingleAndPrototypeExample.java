package com.example.example_eight;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class Student
{
	
}

@Component
@Scope("prototype")
class Marks
{
	
}

@Configuration
@ComponentScan
public class SingleAndPrototypeExample {

	public static void main(String[] args)
	{
		var context = new AnnotationConfigApplicationContext(SingleAndPrototypeExample.class);
		
		System.out.println(context.getBean(Student.class));
		System.out.println(context.getBean(Student.class));
		System.out.println(context.getBean(Student.class));
		System.out.println(context.getBean(Student.class));
		System.out.println(context.getBean(Student.class));
		
		System.out.println(context.getBean(Marks.class));
		System.out.println(context.getBean(Marks.class));
		System.out.println(context.getBean(Marks.class));
		System.out.println(context.getBean(Marks.class));
		System.out.println(context.getBean(Marks.class));
	}
}
