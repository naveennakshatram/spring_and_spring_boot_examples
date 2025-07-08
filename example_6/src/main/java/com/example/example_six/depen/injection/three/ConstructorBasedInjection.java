package com.example.example_six.depen.injection.three;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class Student
{
	public Marks marks;
	public Percentage per;
	
	
	@Autowired	
	public Student(Marks marks, Percentage per) {
		super();
		this.marks = marks;
		this.per = per;
	}

	public String toString()
	{
		return "Marks : "+marks+"\nPercent : "+per;
	}
	
}

@Component
class Marks
{
	
}

@Component
class Percentage
{
	
}



@Configuration
@ComponentScan
public class ConstructorBasedInjection {
	public static void main(String n[])
	{
		var context = new AnnotationConfigApplicationContext(ConstructorBasedInjection.class);
		
		String[] names = context.getBeanDefinitionNames();
		
		for(String name : names)
		{
			System.out.println(name);
		}
		
		System.out.println(context.getBean(Student.class).toString());
	}
}
