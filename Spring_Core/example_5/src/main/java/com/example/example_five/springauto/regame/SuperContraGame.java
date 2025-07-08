package com.example.example_five.springauto.regame;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GameConsole {

	@Override
	public void up() {
		System.out.println("Contra make a flip");

	}

	@Override
	public void down() {
		System.out.println("Contra Shoot");

	}

}
