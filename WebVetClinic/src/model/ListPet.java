/**
 * List Pets Class
 * @author Nikki McCloud
 * @version 2.0
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pets")
public class ListPet {

	//Declaring Variables and Entities
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="MEDICATION")
	private String medication;
	
	/**
	 * Default no Arg Constructor
	 */
	public ListPet() {
		super();
	}

	/**
	 * Parameterized Constructor
	 * @param name
	 * @param medication
	 */
	public ListPet(String name, String medication) {
		super();
		this.name = name;
		this.medication = medication;
	}

    /**
     * Getter for the ID property
     * @return id
     */
	public int getId() {
		return id;
	}

    /**
     * Setter for the ID property
     * @param id
     */
	public void setId(int id) {
		this.id = id;
	}

    /**
     * Getter for the Name property
     * @return name
     */
	public String getName() {
		return name;
	}

    /**
     * Setter for the Name property
     * @param name
     */
	public void setName(String name) {
		this.name = name;
	}
	
    /**
     * Getter for the Medication property
     * @return medication
     */
	public String getMedication() {
		return medication;
	}

    /**
     * Setter for the Medication property
     * @param medication
     */
	public void setMedication(String medication) {
		this.medication = medication;
	}

	/**
	 * Pet Details method
	 * @param name
	 * @param medication
	 * @return name and medication details
	 */
	public String returnPetDetails() {
		return "ListPet [name=" + name + ", medication=" + medication + "]";
	}
}
