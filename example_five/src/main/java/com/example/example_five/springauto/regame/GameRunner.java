package com.example.example_five.springauto.regame;

import org.springframework.stereotype.Component;

@Component
public class GameRunner
{
	public GameConsole game;
	
	public GameRunner(GameConsole game)
	{
		this.game = game;
	}
	
	public void run()
	{
		game.up();
		game.down();
	}
}
