package com.example.example_1.usingclass;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController 
{
	@RequestMapping("/emp_details")
    public List<EmployeeDetails> getEmployeeDetails()
    {
    	return Arrays.asList(
    			new EmployeeDetails(101,10000.0f,"Ravi"),
    			new EmployeeDetails(102,15000.0f,"Kumar"),
    			new EmployeeDetails(103,8000.0f,"Mohan"),
    			new EmployeeDetails(104,19000.0f,"Krishna"),
    			new EmployeeDetails(105,12000.0f,"Prasad"),
    			new EmployeeDetails(106,10000.0f,"Murali")
    			);
    }
	
}
