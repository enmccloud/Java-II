/**
 * Console Class
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
@Table(name="CONSOLE")
public class Console {

	//Creating variables and setting up database table.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	
	@Column(name="CONSOLE_NAME")
	private String consoleName;
	
	/**
	 * Parameterized Constructor
	 * @param consoleName
	 */
	public Console(String consoleName) {
		super();
		this.consoleName = consoleName;
	}
}
