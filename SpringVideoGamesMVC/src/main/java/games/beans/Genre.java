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

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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
	 * Parameterized Constructor
	 * @param genreType
	 */
	public Genre(String genreType) {
		super();
		this.genreType = genreType;
	}
}
