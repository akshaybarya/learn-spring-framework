package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.PacmanGame;


@Configuration
public class GameConfiguration {
	
	@Bean
	public GamingConsole game () {
		return new PacmanGame();
	}
	
	@Bean
	public GameRunner gameRunner (GamingConsole game) {
		return new GameRunner(game);
	} 
	
//	WE are creating a PACMAN Game and wiring it to game runner
}
