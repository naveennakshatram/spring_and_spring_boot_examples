package com.example.example_five.springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.example_five.game.GameRunner;
import com.example.example_five.game.SuperContraGame;

public class SpringBootRun {

	public static void main(String[] args) 
	{
		var context = new AnnotationConfigApplicationContext(GameConfiguration.class);
		
		context.getBean(SuperContraGame.class).up();
		
		context.getBean(GameRunner.class).run();
	}

}
