/**
 * Housing Class
 * @author Nikki McCloud
 * @version 1.0
 */
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Housing {

	//Declaring Variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String deedHolder;
	private String squareFootage;
	private String dwellingType;
	@Autowired
	private Address address;
	
	/**
	 * Default No Arg Constructor
	 */
	public Housing() {
		super();
		this.dwellingType = "residential";
	}

	/**
	 * Parameterized Constructor
	 * @param deedHolder
	 */
	public Housing(String deedHolder) {
		super();
		this.deedHolder = deedHolder;
	}

	/**
	 * Parameterized Constructor
	 * @param deedHolder
	 * @param squareFootage
	 * @param dwellingType
	 */
	public Housing(String deedHolder, String squareFootage, String dwellingType) {
		super();
		this.deedHolder = deedHolder;
		this.squareFootage = squareFootage;
		this.dwellingType = dwellingType;
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
     * Getter DeedHolder
     * @return deedHolder
     */
	public String getDeedHolder() {
		return deedHolder;
	}

    /**
     * Setter for DeedHolder
     * @param deedHolder
     */
	public void setDeedHolder(String deedHolder) {
		this.deedHolder = deedHolder;
	}

	 /**
     * Getter for SquareFootage
     * @return squareFootage
     */
	public String getSquareFootage() {
		return squareFootage;
	}

    /**
     * Setter for SquareFootage
     * @param squareFootage
     */
	public void setSquareFootage(String squareFootage) {
		this.squareFootage = squareFootage;
	}

	 /**
     * Getter for DwellingType
     * @return dwellingType
     */
	public String getDwellingType() {
		return dwellingType;
	}

    /**
     * Setter for DwellingType
     * @param dwellingType
     */
	public void setDwellingType(String dwellingType) {
		this.dwellingType = dwellingType;
	}
	
	 /**
     * Getter for Address Entity
     * @return address
     */
	public Address getAddress() {
		return address;
	}

    /**
     * Setter for Address Entity
     * @param address
     */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * Housing toString Method
	 * @param id
	 * @param deedHolder
	 * @param squareFootage
	 * @param dwellingType
	 * @return toString
	 */
	@Override
	public String toString() {
		return "Housing [id=" + id + ", deedHolder=" + deedHolder + ", squareFootage=" + squareFootage
				+ ", dwellingType=" + dwellingType + "]";
	}
}
