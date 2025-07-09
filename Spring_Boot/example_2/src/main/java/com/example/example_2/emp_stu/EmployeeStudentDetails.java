package com.example.example_2.emp_stu;

import com.example.example_2.employee.EmployeeDetails;
import com.example.example_2.student.StudentDetails;

public class EmployeeStudentDetails
{
	private StudentDetails student_details;
	private EmployeeDetails employee_details;
	
	
	public EmployeeStudentDetails(StudentDetails sd, EmployeeDetails ed) 
	{
		super();
		this.student_details = sd;
		this.employee_details = ed;
	}


	public StudentDetails getStudent_details() {
		return student_details;
	}


	public EmployeeDetails getEmployee_details() {
		return employee_details;
	}


	
}
