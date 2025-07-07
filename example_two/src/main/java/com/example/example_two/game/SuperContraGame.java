package com.example.example_two.game;

public class SuperContraGame implements GamingConsole
{
	public void up()
	{
		System.out.println("Climb Wall");
	}
	
	public void down()
	{
		System.out.println("Sit down");
	}
	
	public void right()
	{
		System.out.println("Shoot and walk");
	}
	
	public void left()
	{
		System.out.println("Move left");
	}
}

