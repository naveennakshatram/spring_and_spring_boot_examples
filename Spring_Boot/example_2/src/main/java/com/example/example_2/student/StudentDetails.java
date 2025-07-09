package com.example.example_2.student;

public class StudentDetails 
{
	private long idno;
	private String name;
	private int[] marks;
	
	public StudentDetails(long idno, String name, int[] marks) 
	{
		super();
		this.idno = idno;
		this.name = name;
		this.marks = marks;
	}

	public long getIdno() {
		return idno;
	}

	public String getName() {
		return name;
	}

	public int[] getMarks() {
		return marks;
	}
	
	
}
