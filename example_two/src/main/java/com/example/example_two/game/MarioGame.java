package com.example.example_two.game;

public class MarioGame implements GamingConsole
{
	public void up()
	{
		System.out.println("Jump");
	}
	
	public void down()
	{
		System.out.println("Go into Hole");
	}
	
	public void right()
	{
		System.out.println("Move right");
	}
	
	public void left()
	{
		System.out.println("Move left");
	}
}

