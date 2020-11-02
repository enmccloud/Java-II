/**
 * Video Game Class
 * @author Nikki McCloud
 * @version 1.0
 */
package games.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="VIDEOGAMES")
public class VideoGame {

	//Creating variables and setting up database table.
	//Including One to Many Relationships
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	
	@Column(name="NAME")
	private String gameName;
	@Column(name="PLAYERS")
	private int numOfPlayers;
	@Column(name="ESRB")
	private String esrbRating;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="GENRE")
	private Genre genre;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CONSOLE")
	private Console console;
	
	public VideoGame() {
		super();
	}

	/**
	 * Parameterized Constructor
	 * @param gameName
	 * @param numOfPlayers
	 * @param esrbRating
	 * @param genre
	 * @param console
	 */
	public VideoGame(String gameName, int numOfPlayers, String esrbRating, Genre genre, Console console) {
		super();
		this.gameName = gameName;
		this.numOfPlayers = numOfPlayers;
		this.esrbRating = esrbRating;
		this.genre = genre;
		this.console = console;
	}

	/**
     * Getter for Id
     * @return id
     */
	public long getId() {
		return id;
	}

	/**
	 * Setter for Id
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
     * Getter for GameName
     * @return gameName
     */
	public String getGameName() {
		return gameName;
	}

	/**
	 * Setter for GameName
	 * @param gameName
	 */
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	/**
     * Getter for NumOfPlayers
     * @return numOfPlayers
     */
	public int getNumOfPlayers() {
		return numOfPlayers;
	}

	/**
	 * Setter for NumOfPlayers
	 * @param numOfPlayers
	 */
	public void setNumOfPlayers(int numOfPlayers) {
		this.numOfPlayers = numOfPlayers;
	}

	/**
     * Getter for EsrbRating
     * @return esrbRating
     */
	public String getEsrbRating() {
		return esrbRating;
	}
	
	/**
	 * Setter for esrbRating
	 * @param esrbRating
	 */
	public void setEsrbRating(String esrbRating) {
		this.esrbRating = esrbRating;
	}

	/**
     * Getter for Genre
     * @return genre
     */
	public Genre getGenre() {
		return genre;
	}

	/**
	 * Setter for Genre
	 * @param genre
	 */
	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	/**
     * Getter for Console
     * @return console
     */
	public Console getConsole() {
		return console;
	}

	/**
	 * Setter for Console
	 * @param console
	 */
	public void setConsole(Console console) {
		this.console = console;
	}

	/**
	 * toString Method
	 * @param id
	 * @param gameName
	 * @param numOfPlayers
	 * @param esrbRating
	 * @param genre
	 * @param console
	 * @return toString
	 */
	@Override
	public String toString() {
		return "VideoGame [id=" + id + ", gameName=" + gameName + ", numOfPlayers=" + numOfPlayers + ", esrbRating="
				+ esrbRating + ", genre=" + genre + ", console=" + console + "]";
	}
}

