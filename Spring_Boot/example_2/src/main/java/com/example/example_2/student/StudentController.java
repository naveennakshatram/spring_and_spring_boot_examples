package com.example.example_2.student;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
	@RequestMapping("/sd")
	public List<StudentDetails> getStudentDetails()
	{
		return Arrays.asList(
				
				new StudentDetails(1001,"Ravi",new int[] {45,89,77}),
				
				new StudentDetails(1002, "Kumar", new int[] {89,99,78})
				);
	}
}
