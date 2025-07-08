package com.example.example_six.depen.injection.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class Student
{
	@Autowired
	Marks marks;
	
	@Autowired
	Percentage percent;
	
	public String toSting() {
		return "Marks : "+marks+"\nPercent : "+percent;
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
@ComponentScan // 

public class FieldBasedInjection {

	public static void main(String[] args)
	{
		var context = new AnnotationConfigApplicationContext(FieldBasedInjection.class);
		
		String[] names = context.getBeanDefinitionNames();
		
		for(String name: names)
		{
			System.out.println(name);
		}
		
		System.out.println(context.getBean(Student.class).toSting());
	}

}
