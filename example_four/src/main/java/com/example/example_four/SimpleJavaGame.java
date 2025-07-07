package com.example.example_four;

import com.example.example_four.simplejava.game.GameRunner;
import com.example.example_four.simplejava.game.MarioGame;
import com.example.example_four.simplejava.game.SuperContra;

public class SimpleJavaGame
{
	public static void main(String np[]) 
	{
			System.out.println("From Mario Game");
	    	var game = new GameRunner(new MarioGame());	    	
	    	game.run();
	    	
	    	
	    	System.out.println("From SuperContra game");
	    	new GameRunner(new SuperContra()).run();
	}
}
