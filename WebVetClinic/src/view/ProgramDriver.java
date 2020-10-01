 /**************************************************************
* Name        : Web Vet Clinic Application (Week 5 Assessment)
* Author      : Nikki McCloud
* Created     : 9/30/20
* Course      : CIS 175 Java II
* Version     : 2.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : ENHANCED- Web Vet Clinic Pet List program with editable database.
*               Input:  Pet names and corresponding medications (add, edit, remove).
*               Output: Pet list with names and meds.
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/
package view;

import java.util.List;
import java.util.Scanner;

import controller.ListPetHelper;
import model.ListPet;

public class ProgramDriver {

	//Scanner 
	static Scanner in = new Scanner(System.in);
	
	//New list pet helper object
	static ListPetHelper lph = new ListPetHelper();
	
	/**
	 * Add Pet Method
	 * @param name
	 * @param medication
	 */
	private static void addPet() {
		// TODO Auto-generated method stub
		System.out.print("Enter the Pet's name: ");
		String name = in.nextLine();
		System.out.print("Enter the Pet's medication: ");
		String medication = in.nextLine();

		ListPet toAdd = new ListPet(name, medication);
		lph.insertPet(toAdd);
	}
	
	/**
	 * Delete Pet Method
	 * @param name
	 * @param medication
	 */
	private static void deletePet() {
		// TODO Auto-generated method stub
		System.out.print("Enter the Pet's name to delete: ");
		String name = in.nextLine();
		System.out.print("Enter the medication to delete: ");
		String medication = in.nextLine();

		ListPet toDelete = new ListPet(name, medication);
		lph.deletePet(toDelete);
	}
	
	/**
	 * Edit Pet Method
	 * @param name
	 * @param medication
	 */
	private static void editPet() {
		// TODO Auto-generated method stub
		System.out.println("How would you like to search? ");
		System.out.println("1 : Search by Pet's Name");
		System.out.println("2 : Search by Pet's Medication");
		int searchBy = in.nextInt();
		in.nextLine();
		List<ListPet> foundPets;
		if (searchBy == 1) {
			System.out.print("Enter the Pet's name: ");
			String petName = in.nextLine();
			foundPets = lph.searchForPetByName(petName);
		} else {
			System.out.print("Enter the Pet's medication: ");
			String petMedication = in.nextLine();
			foundPets = lph.searchForPetByMedication(petMedication);
		}

		if (!foundPets.isEmpty()) {
			System.out.println("Found Results.");
			for (ListPet l : foundPets) {
				System.out.println(l.getId() + " : " + l.returnPetDetails());
			}
			System.out.print("Which ID to edit: ");
			int idToEdit = in.nextInt();

			ListPet toEdit = lph.searchForPetById(idToEdit);
			System.out.println("Retrieved " + toEdit.getMedication() + " from " + toEdit.getName());
			System.out.println("1 : Update Pet's Name");
			System.out.println("2 : Update Pet's Medication");
			int update = in.nextInt();
			in.nextLine();

			if (update == 1) {
				System.out.print("New Name: ");
				String newName = in.nextLine();
				toEdit.setName(newName);
			} else if (update == 2) {
				System.out.print("New Medication: ");
				String newMedication = in.nextLine();
				toEdit.setMedication(newMedication);
			}

			lph.updatePet(toEdit);

		} else {
			System.out.println("---- No results found");
		}
	}

	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runMenu();

	}

	/**
	 * Run Menu Method
	 * Displays menu for user to choose from
	 * @param name
	 * @param medication
	 */
	public static void runMenu() {
		boolean goAgain = true;
		System.out.println("--- McCloud Vet Clinic Main Menu ---");
		while (goAgain) {
			System.out.println("*  Select an option from the Menu:");
			System.out.println("*  1 -- Add a Pet");
			System.out.println("*  2 -- Edit a Pet");
			System.out.println("*  3 -- Delete a Pet");
			System.out.println("*  4 -- View the Pet List");
			System.out.println("*  5 -- Exit the Vet Clinic Application");
			System.out.print("*  Your selection: ");
			int selection = in.nextInt();
			in.nextLine();
			
			if (selection == 1) {
				addPet();
			} else if (selection == 2) {
				editPet();
			} else if (selection == 3) {
				deletePet();
			} else if (selection == 4) {
				viewTheList();
			} else {
				lph.cleanUp();
				System.out.println("   Thank you for using our program!   ");
				goAgain = false;
			}

		}

	}

	/**
	 * View Pet List Method
	 * @param name
	 * @param medication
	 */
	private static void viewTheList() {
		List<ListPet> allPets = lph.showAllPets();
		for(ListPet singlePet : allPets){
			System.out.println(singlePet.returnPetDetails());
		}
	}
}