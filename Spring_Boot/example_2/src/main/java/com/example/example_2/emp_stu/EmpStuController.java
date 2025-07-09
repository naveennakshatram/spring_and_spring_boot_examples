package com.example.example_2.emp_stu;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.example_2.employee.EmployeeDetails;
import com.example.example_2.student.StudentDetails;

@RestController
public class EmpStuController 
{
	@RequestMapping("/esd")
	public List<EmployeeStudentDetails> getEmpStuDetails()
	{
			return Arrays.asList(
					
					new EmployeeStudentDetails(
							new StudentDetails(101, "Ravi", new int[] {45,65,89}), 
							new EmployeeDetails(1001, "Ravi Kumar", 15000.00f)),
					new EmployeeStudentDetails(
							new StudentDetails(101, "Kumar", new int[] {45,33,78}), 
							new EmployeeDetails(1001, "Naveen Kumar", 18000.00f)),
					new EmployeeStudentDetails(
							new StudentDetails(101, "Mohan", new int[] {48,69,90}), 
							new EmployeeDetails(1001, "Mak", 12000.00f))
					
					);
			
	}
}
