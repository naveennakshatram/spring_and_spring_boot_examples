package com.example.example_three.Student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Student(
		int idno,
		String name,
		float average,
		int[] marks) {};

@Configuration
public class StudentConfiguration 
{
	@Bean
	public Student studentDetails()
	{
		int[] marks = {90, 80, 85, 88, 82};
		
		var student = new Student(101,"Ravi",56.5f,marks);
			
		return student;
	}
}
