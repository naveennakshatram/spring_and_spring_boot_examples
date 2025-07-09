package com.example.example_2.employee;

public class EmployeeDetails 
{
	private long idno;
	private String name;
	private float salary;
	
	public EmployeeDetails(long idno, String name, float salary) 
	{
		super();
		this.idno = idno;
		this.name = name;
		this.salary = salary;
	}

	public long getIdno() {
		return idno;
	}

	public String getName() {
		return name;
	}

	public float getSalary() {
		return salary;
	}
}
