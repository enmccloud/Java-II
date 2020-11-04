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

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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
}

