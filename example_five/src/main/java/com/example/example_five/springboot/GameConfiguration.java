package com.example.example_five.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.example_five.game.GameRunner;
import com.example.example_five.game.SuperContraGame;

@Configuration
public class GameConfiguration
{
	@Bean
	public SuperContraGame game()
	{
		return new SuperContraGame();
	}
	
	
   @Bean
   public GameRunner gamerunner()
   {
	   // re- using 'game()' bean
	   return new GameRunner(game());
   }
}
