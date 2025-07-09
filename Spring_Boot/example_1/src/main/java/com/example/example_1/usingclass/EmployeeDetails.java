package com.example.example_1.usingclass;

public class EmployeeDetails
{
	private int idno;
	private float salary;
	private String name;
	
	@Override
	public String toString() 
	{
		return "EmployeeDetails [idno=" + idno + ", salary=" + salary + ", name=" + name + "]";
	}

	

	public int getIdno() {
		return idno;
	}



	public float getSalary() {
		return salary;
	}



	public String getName() {
		return name;
	}



	public EmployeeDetails(int idno, float salary, String name) {
		super();
		this.idno = idno;
		this.salary = salary;
		this.name = name;
	}
}
