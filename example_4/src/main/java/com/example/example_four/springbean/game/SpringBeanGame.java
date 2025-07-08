package com.example.example_four.springbean.game;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.example_four.simplejava.game.GameRunner;
import com.example.example_four.simplejava.game.MarioGame;

public class SpringBeanGame
{
   public static void main(String np[])
   {
	   
	   
	try (var context = new AnnotationConfigApplicationContext(GameConfigration.class))
	{
		context.getBean(MarioGame.class).up();
		   
		context.getBean(GameRunner.class).run();
		
		context.getBean(GameRunner.class).game.up();
	}
   }
}
