/**
 * Pet Owner Class
 * @author Nikki McCloud
 * @version 1.0
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="owner")
public class Owner {
	
	//Variables and Table Linking
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="OWNER_ID")
	private int id;
	@Column(name="OWNER_NAME")
	private String ownerName;
	
	/**
	 * Default no Arg Constructor
	 */
	public Owner() {
		super();
	}


	/**
	 * Parameterized Constructor 
	 * @param id
	 * @param owner name
	 */
	public Owner(int id, String ownerName) {
		super();
		this.id = id;
		this.ownerName = ownerName;
	}
	
	/**
	 * Parameterized Constructor 
	 * @param owner name
	 */
	public Owner(String ownerName) {
		super();
		this.ownerName = ownerName;
	}

	 /**
     * Getter for Id
     * @return Id
     */
	public int getId() {
		return id;
	}

    /**
     * Setter for Id
     * @param Id
     */
	public void setId(int id) {
		this.id = id;
	}

	 /**
     * Getter for Owner Name
     * @return Owner Name
     */
	public String getOwnerName() {
		return ownerName;
	}

    /**
     * Setter for Owner Name
     * @param Owner Name
     */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	/**
	 * ToString Method
	 * @param id
	 * @param owner name
	 * @return to String
	 */
	@Override
	public String toString() {
		return "Owner [id=" + id + ", ownerName=" + ownerName + "]";
	}
	
}
