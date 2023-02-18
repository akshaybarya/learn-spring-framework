package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;

//import com.in28minutes.learnspringframework.game.GamingConsole;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(GameConfiguration.class)) {
			
			context.getBean(GameRunner.class).run();
			
			
		} catch (Exception e) {}		

	}

}
