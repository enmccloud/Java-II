/**
 * MadLib Class
 * @author Nikki McCloud
 * @version 1.0
 */
package model;

public class MadLib {

	//Declaring Variables
	private String name;
	private String favColor;
	private String animal;
	private String location;
	private String verb;
	
	/**
	 * Default No Arg Constructor
	 */
	public MadLib() {
		super();
	}

	/**
	 * MadLib Constructor
	 * @param name
	 * @param favColor
	 * @param animal
	 * @param location
	 * @param verb
	 */
	public MadLib(String name, String favColor, String animal, String location, String verb) {
		super();
		this.name = name;
		this.favColor = favColor;
		this.animal = animal;
		this.location = location;
		this.verb = verb;
	}

    /**
     * Getter for the Name property
     * @return Name
     */
	public String getName() {
		return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
	}

    /**
     * Setter for the Name property
     * @param Name
     */
	public void setName(String name) {
		this.name = name;
	}

    /**
     * Getter for the FavColor property
     * @return FavColor
     */
	public String getFavColor() {
		return favColor.substring(0, 1).toUpperCase() + favColor.substring(1).toLowerCase();
	}

    /**
     * Setter for the FavColor property
     * @param favColor
     */
	public void setFavColor(String favColor) {
		this.favColor = favColor;
	}

    /**
     * Getter for the Animal property
     * @return Animal
     */
	public String getAnimal() {
		return animal.substring(0, 1).toUpperCase() + animal.substring(1).toLowerCase();
	}

    /**
     * Setter for the Name property
     * @param Name
     */
	public void setAnimal(String animal) {
		this.animal = animal;
	}

    /**
     * Getter for the Location property
     * @return Location
     */
	public String getLocation() {
		return location.substring(0, 1).toUpperCase() + location.substring(1).toLowerCase();
	}

    /**
     * Setter for the Location property
     * @param Location
     */
	public void setLocation(String location) {
		this.location = location;
	}

    /**
     * Getter for the Verb property
     * @return Verb
     */
	public String getVerb() {
		return verb.substring(0, 1).toUpperCase() + verb.substring(1).toLowerCase();
	}

    /**
     * Setter for the Verb property
     * @param Verb
     */
	public void setVerb(String verb) {
		this.verb = verb;
	}

	/**
	 * ToString Method
	 * @param name
	 * @param favColor
	 * @param animal
	 * @param location
	 * @param verb
	 * @return toString
	 */
	@Override
	public String toString() {
		return "MadLib [name=" + name + ", favColor=" + favColor + ", animal=" + animal + ", location=" + location
				+ ", verb=" + verb + "]";
	}
}
