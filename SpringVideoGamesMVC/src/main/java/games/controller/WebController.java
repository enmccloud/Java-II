/**
 * Web Controller Class
 * @author Nikki McCloud
 * @version 1.0
 */
package games.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import games.beans.Console;
import games.beans.Genre;
import games.beans.VideoGame;
import games.repository.ConsoleRepository;
import games.repository.GenreRepository;
import games.repository.VideoGameRepository;

@Controller
public class WebController {
	
	//Linking my repos
	@Autowired
	VideoGameRepository videoGameRepo;
	@Autowired
	GenreRepository genreRepo;
	@Autowired
	ConsoleRepository consoleRepo;

	/**
	 * View all Video Games Method
	 * @param videogameRepo
	 * @param genreRepo
	 * @param consoleRepo
	 * @return view all
	 */
	@GetMapping({ "/", "viewAll" })
	public String viewAll(Model model) {
		if(videoGameRepo.findAll().isEmpty()) {
			return addNewVideoGame(model);
		}
		
		model.addAttribute("videogames", videoGameRepo.findAll());
		model.addAttribute("genres", genreRepo.findAll());
		model.addAttribute("consoles", consoleRepo.findAll());
		
		return "viewAll";
	}

	/**
	 * Add New Video Games Method
	 * @param VideoGame
	 * @param Genre
	 * @param Console
	 * @return insertVideoGame
	 */
	@GetMapping("/insertVideoGame")
	public String addNewVideoGame(Model model) {
		VideoGame game = new VideoGame();
		Genre genre = new Genre();
		Console console = new Console();
		
		model.addAttribute("newVideoGame", game);
		model.addAttribute("newGenre", genre);
		model.addAttribute("newConsole", console);
		return "insertVideoGame";
	}

	/**
	 * Edit Video Games Method
	 * @param VideoGame
	 * @param Genre
	 * @param Console
	 * @return insertVideoGame
	 */
	@GetMapping("/edit/{id}")
	public String showUpdateVideoGame(@PathVariable("id") long id, Model model) {
		VideoGame game = videoGameRepo.findById(id).orElse(null);
		Genre genre = genreRepo.findById(id).orElse(null);
		Console console = consoleRepo.findById(id).orElse(null);
		
		System.out.println("GAME TO EDIT: " + game.toString());
		
		model.addAttribute("newVideoGame", game);
		model.addAttribute("newGenre", genre);
		model.addAttribute("newConsole", console);
		return "insertVideoGame";
	}

	/**
	 * Update Video Games Method
	 * @param VideoGame
	 * @return view All
	 */
	@PostMapping("/update/{id}")
	public String reviseGame(VideoGame game, Model model) {
		videoGameRepo.save(game);
		
		return viewAll(model);
	}
	
	/**
	 * Delete Video Games Method
	 * @param VideoGame
	 * @return view All
	 */
	@GetMapping("/delete/{id}")
	public String deleteVideoGame(@PathVariable("id") long id, Model model) {
		VideoGame game = videoGameRepo.findById(id).orElse(null);
		videoGameRepo.delete(game);
		
	    return viewAll(model);
	}
}

