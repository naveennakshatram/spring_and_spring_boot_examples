package com.example.example_five.springauto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.example_five.springauto.regame.GameRunner;
import com.example.example_five.springauto.regame.SuperContraGame;

// In this example spring will create Configuration, Annotation, Beans, Object Wiring,....etc.,

// Everything is Automated.

// Note 1 : All your classes must be annotated with @Component annotation.
// Note 2 : The container class muse be annotated with @Configuration 
// Note 3 : To find your component classes by container we need to annotate container with 
//          @ComponentScan(complete package name as a string parameter).
// Note 4 : Making SuperContraGame as a @Primary

@Configuration
@ComponentScan("com.example.example_five.springauto.regame")
public class SpringAuto 
{
	public static void main(String n[])
	{
		var context = new AnnotationConfigApplicationContext(SpringAuto.class);
		
		context.getBean(SuperContraGame.class).up();
		
		context.getBean(GameRunner.class).run();
	}
}
