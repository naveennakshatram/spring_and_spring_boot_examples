package com.example.example_six.depen.injection.two;

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
	
	//@Autowired
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	
	@Autowired
	public void setPer(Percentage per) {
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
public class SetterBasedInjection {
	public static void main(String n[])
	{
		var context = new AnnotationConfigApplicationContext(SetterBasedInjection.class);
		
		String[] names = context.getBeanDefinitionNames();
		
		for(String name : names)
		{
			System.out.println(name);
		}
		
		System.out.println(context.getBean(Student.class).toString());
	}
}
