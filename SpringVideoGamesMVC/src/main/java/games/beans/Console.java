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
	 * Default No Arg Constructor
	 */
	public Console() {
		super();
	}
	
	/**
	 * Parameterized Constructor
	 * @param consoleName
	 */
	public Console(String consoleName) {
		super();
		this.consoleName = consoleName;
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
     * Getter for ConsoleName
     * @return consoleName
     */
	public String getConsoleName() {
		return consoleName;
	}
	
	/**
	 * Setter for ConsoleName
	 * @param consoleName
	 */
	public void setConsoleName(String consoleName) {
		this.consoleName = consoleName;
	}

	/**
	 * toString Method
	 * @param id
	 * @param consoleName
	 * @return toString
	 */
	@Override
	public String toString() {
		return "Console [id=" + id + ", consoleName=" + consoleName + "]";
	}
	
}
