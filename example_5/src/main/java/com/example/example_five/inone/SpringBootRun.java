package com.example.example_five.inone;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.example_five.game.GameRunner;
import com.example.example_five.game.SuperContraGame;

// instead of writing 2 individual classes(GameConfigration and SpringBootRun) i am writing into 1 class

@Configuration
public class SpringBootRun 
{
	
	@Bean
	public SuperContraGame game()
	{
		return new SuperContraGame();
	}
	
	
	@Bean
	public GameRunner gameRunner()
	{
		return new GameRunner(game());
	}
	

	public static void main(String n[])
	{
		var context = new AnnotationConfigApplicationContext(SpringBootRun.class);
		
		context.getBean(GameRunner.class).run();
		
	}
	
}
