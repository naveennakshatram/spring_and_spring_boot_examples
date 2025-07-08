package com.example.example_four.springbean.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.example_four.simplejava.game.GameRunner;
import com.example.example_four.simplejava.game.MarioGame;

@Configuration
public class GameConfigration 
{
	@Bean
	public MarioGame marioGame()
	{
		return new MarioGame();
	}
	
	
	
	@Bean
	public GameRunner gamerunner()
	{
		return new GameRunner(marioGame());
	}
}
