/**
 * Pet List Details Class
 * @author Nikki McCloud
 * @version 1.0
 */
package model;

import java.time.LocalDate;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "pet_list_details")
public class PetListDetails {
	//Variables and Table Linkings
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PET_LIST_ID")
	private int id;
	@Column(name="PET_LIST_NAME")
	private String petListName;
	@Column(name="DOB")
	private LocalDate dob;
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="OWNER_ID")
	private Owner owner;
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
		@JoinTable
			(name="medications_on_list",
			joinColumns= { @JoinColumn(name="PET_LIST_ID", referencedColumnName="PET_LIST_ID")},
			inverseJoinColumns= { @JoinColumn(name="MEDICATION_ID", referencedColumnName="ID", unique=true)})
	private List<ListPet> listOfPets;
	
	/**
	 * Default no ARG Constructor
	 */
	public PetListDetails() {
		super();
	}
	
	/**
	 * Parameterized constructor
	 * @param id
	 * @param petListName
	 * @param dob
	 * @param owner
	 * @param listOfPets
	 */
	public PetListDetails(int id, String petListName, LocalDate dob, Owner owner, List<ListPet> listOfPets) {
		super();
		this.id = id;
		this.petListName = petListName;
		this.dob = dob;
		this.owner = owner;
		this.listOfPets = listOfPets;
	}

	/**
	 * Parameterized constructor
	 * @param petListName
	 * @param dob
	 * @param owner
	 * @param listOfPets
	 */
	public PetListDetails(String petListName, LocalDate dob, Owner owner, List<ListPet> listOfPets) {
		super();
		this.petListName = petListName;
		this.dob = dob;
		this.owner = owner;
		this.listOfPets = listOfPets;
	}

	/**
	 * Parameterized constructor
	 * @param petListName
	 * @param dob
	 * @param owner
	 */
	public PetListDetails(String petListName, LocalDate dob, Owner owner) {
		super();
		this.petListName = petListName;
		this.dob = dob;
		this.owner = owner;
	}

	 /**
     * Getter for Id
     * @return id
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
     * Getter for Pet List Name
     * @return Pet List Name
     */
	public String getPetListName() {
		return petListName;
	}

    /**
     * Setter for Pet List Name
     * @param Pet List Name
     */
	public void setPetListName(String petListName) {
		this.petListName = petListName;
	}

	 /**
     * Getter for Date of Birth (later changed to appt set date)
     * @return dob
     */
	public LocalDate getDob() {
		return dob;
	}

    /**
     * Setter for Date of Birth (later changed to appt set date)
     * @param dob
     */
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	 /**
     * Getter for Owner
     * @return Owner
     */
	public Owner getOwner() {
		return owner;
	}

    /**
     * Setter for Owner 
     * @param Owner 
     */
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	 /**
     * Getter for ListOfPets
     * @return ListOfPets
     */
	public List<ListPet> getListOfPets() {
		return listOfPets;
	}

    /**
     * Setter for ListOfPets
     * @param OListOfPets
     */
	public void setListOfPets(List<ListPet> listOfPets) {
		this.listOfPets = listOfPets;
	}
	
	/**
	 * ToString Method
	 * @param id
	 * @param petlist name
	 * @param dob
	 * @param owner
	 * @param list of pets
	 * @return to String
	 */
	@Override
	public String toString() {
		return "PetListDetails [id=" + id + ", petListName=" + petListName + ", dob=" + dob + ", owner=" + owner
				+ ", listOfPets=" + listOfPets + "]";
	}

}
