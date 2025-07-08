package com.example.exapmple_three.employee;

import java.util.HashMap;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.exapmple_three.employee.EmployeeDetails;

public class GetEmploee {

	public static void main(String[] args)
	{
		var context = new AnnotationConfigApplicationContext(EmployeeDetails.class);
		
		var ob = context.getBean("empDetails");
		
		System.out.println(ob);
	}
}

// Note : the getBean("...") will return Return an instance, 
// which may be shared or independent, of the specified bean.