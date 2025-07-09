package com.example.example_2.employee;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{
	@RequestMapping("/ed")
	public List<EmployeeDetails> getEmployeeDetails()
	{
		return Arrays.asList(
				new EmployeeDetails(101,"Ravi",15000.0f),
				new EmployeeDetails(102,"Kumar",25000.0f),
				new EmployeeDetails(103,"Mohan",18000.0f),
				new EmployeeDetails(104, "Krishna", 15050.0f));
	}
}
