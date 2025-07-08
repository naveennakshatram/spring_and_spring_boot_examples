package com.example.example_one.game;

public class GameRunner
{
	//MarioGame game;
	
//	public GameRunner(MarioGame game)
//	{
//		this.game = game;
//	}
	
	
	SuperContraGame game;
	
	public GameRunner(SuperContraGame game)
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
