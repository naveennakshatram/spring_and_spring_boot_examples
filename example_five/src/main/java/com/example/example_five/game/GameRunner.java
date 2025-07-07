package com.example.example_five.game;

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
