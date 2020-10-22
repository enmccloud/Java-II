/**
 * Address Class
 * @author Nikki McCloud
 * @version 1.0
 */
package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	//Declaring Variables
	private String street;
	private String city;
	private String state;
	private int zip;
	
	/**
	 * Default No Arg Constructor
	 */
	public Address() {
		super();
	}
	
	/**
	 * Parameterized Constructor
	 * @param street
	 * @param city
	 * @param state
	 * @param zip
	 */
	public Address(String street, String city, String state, int zip) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	 /**
     * Getter for Street
     * @return street
     */
	public String getStreet() {
		return street;
	}

    /**
     * Setter for Street
     * @param street
     */
	public void setStreet(String street) {
		this.street = street;
	}

	 /**
     * Getter for City
     * @return city
     */
	public String getCity() {
		return city;
	}

    /**
     * Setter for City
     * @param city
     */
	public void setCity(String city) {
		this.city = city;
	}

	 /**
     * Getter for State
     * @return state
     */
	public String getState() {
		return state;
	}

    /**
     * Setter for State
     * @param state
     */
	public void setState(String state) {
		this.state = state;
	}

	 /**
     * Getter for Zip
     * @return zip
     */
	public int getZip() {
		return zip;
	}

    /**
     * Setter for Zip
     * @param zip
     */
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	/**
	 * Address toString Method
	 * @param street
	 * @param city
	 * @param state
	 * @param zip
	 * @return toString
	 */
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}

}
