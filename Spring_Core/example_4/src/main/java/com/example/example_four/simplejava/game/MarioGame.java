package com.example.example_four.simplejava.game;

public class MarioGame implements GameConsole 
{
	@Override
	public void down() {
		System.out.println("Go into Hole");		
	}
	
	@Override
	public void left() {
		System.out.println("Go back");		
	}
	
	@Override
	public void right() {
		System.out.println("Go forward");
	}
	
	@Override
	public void up() {
		System.out.println("Jump");
	}
}
