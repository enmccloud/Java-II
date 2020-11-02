/**
 * Genre Class
 * @author Nikki McCloud
 * @version 1.0
 */
package games.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GENRE")
public class Genre {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	
	@Column(name="TYPE")
	private String genreType;
	
	/**
	 * Default No Arg Constructor
	 */
	public Genre() {
		super();
	}

	/**
	 * Parameterized Constructor
	 * @param genreType
	 */
	public Genre(String genreType) {
		super();
		this.genreType = genreType;
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
     * Getter for GenreType
     * @return genreType
     */
	public String getGenreType() {
		return genreType;
	}

	/**
	 * Setter for GenreType
	 * @param genreType
	 */
	public void setGenreType(String genreType) {
		this.genreType = genreType;
	}

	/**
	 * toString Method
	 * @param id
	 * @param genreType
	 * @return toString
	 */
	@Override
	public String toString() {
		return "Genre [id=" + id + ", genreType=" + genreType + "]";
	}
}
