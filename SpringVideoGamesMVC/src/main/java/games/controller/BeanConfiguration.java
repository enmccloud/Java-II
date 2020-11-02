/**
 * Bean Configuration Class
 * @author Nikki McCloud
 * @version 1.0
 */
package games.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import games.beans.VideoGame;
import games.beans.Genre;
import games.beans.Console;

@Configuration
public class BeanConfiguration {
	
	//New instance of Video Game
	@Bean
	public VideoGame videoGame() {
		VideoGame bean = new VideoGame("Silent Hill", 2, "T", genre(), console());
		return bean;
	}

	//New instance of Genre
	@Bean
	public Genre genre() {
		Genre bean = new Genre("Horror");
		return bean;
	}
	
	//New instance of Console
	@Bean
	public Console console() {
		Console bean = new Console ("Playstation 1");
		return bean;
	}
}