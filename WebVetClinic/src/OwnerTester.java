
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import controller.PetListDetailsHelper;
import model.ListPet;
import model.Owner;
import model.PetListDetails;

public class OwnerTester {
	
	public static void main(String [] args) {
		
		Owner Jon = new Owner ("Jon");
		
		PetListDetailsHelper pldh = new PetListDetailsHelper();
		
		ListPet corgi = new ListPet ("Frankie", "Ringworm");
		ListPet daschund = new ListPet ("Buddy", "Joint");

		List<ListPet> jonCampbellPets = new ArrayList<ListPet>();
		
		jonCampbellPets.add(corgi);
		jonCampbellPets.add(daschund);
		
		PetListDetails jonsPets = new PetListDetails("Jon Campbell's Pets", LocalDate.now(), Jon);
		
		jonsPets.setListOfPets(jonCampbellPets);
		
		pldh.insertNewPetListDetails(jonsPets);
		
		List<PetListDetails> allPets = pldh.getLists();
		for(PetListDetails a: allPets) {
			System.out.println(a.toString());
		}
	}
}