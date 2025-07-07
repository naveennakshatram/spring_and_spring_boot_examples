package com.example.example_five.springauto.regame;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GameConsole {

	@Override
	public void up() {
		System.out.println("Mario Go Up");

	}

	@Override
	public void down() {
		System.out.println("Mario Go in hole");

	}

}
