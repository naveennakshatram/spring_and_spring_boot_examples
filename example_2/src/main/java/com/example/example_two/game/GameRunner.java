package com.example.example_two.game;

import com.example.example_two.game.SuperContraGame;

public class GameRunner
{
	GamingConsole game;	

	public GameRunner(GamingConsole game)
	{
		this.game = game;
	}	
	

	public void run() 
	{
	   System.out.println("Hello Game is running"+this.game);
	   
	   game.down();
	   game.up();
	   game.right();
	   game.left();
	}
}
