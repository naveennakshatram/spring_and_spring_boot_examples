package com.example.example_three.reuse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ReusingBeans {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub


	var context = new AnnotationConfigApplicationContext(PersonBeanReuse.class);
	
	
	System.out.println(context.getBean("name"));
	
	System.out.println(context.getBean("age"));
	
	System.out.println(context.getBean("person"));
	
	System.out.println(context.getBean("person2"));
	
	}

}
