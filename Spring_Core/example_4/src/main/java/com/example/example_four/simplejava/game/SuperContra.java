package com.example.example_four.simplejava.game;

public class SuperContra implements GameConsole {

	@Override
	public void down() {
		System.out.println("Bend Down");		
	}
	
	@Override
	public void left() {
		System.out.println("Go back");		
	}
	
	@Override
	public void right() {
		System.out.println("Shoot and Go forward");
	}
	
	@Override
	public void up() {
		System.out.println("Jump from building");
	}
}