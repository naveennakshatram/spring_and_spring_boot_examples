package com.example.example_two;

import com.example.example_two.game.GameRunner;
import com.example.example_two.game.MarioGame;
import com.example.example_two.game.SuperContraGame;

public class AppGamingBasic {

	public static void main(String[] args)
	{
		var game = new MarioGame();
		
		//var game = new SuperContraGame();

	    var gamerunner = new GameRunner(game);
	    
	    gamerunner.run();
	}

}
