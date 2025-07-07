package com.example.example_one;

import com.example.example_one.game.GameRunner;
import com.example.example_one.game.MarioGame;
import com.example.example_one.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) 
	{
		
		//var mariogame = new MarioGame();
		
		var SuperContraGame = new SuperContraGame();
		
		
		//var gamerunner = new GameRunner(mariogame);
		
		var gamerunner = new GameRunner(SuperContraGame);
		
		gamerunner.run();
		
	}

}
