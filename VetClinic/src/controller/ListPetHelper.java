/**
 * List Pet Helper Class
 * @author Nikki McCloud
 * @version 1.0
 */
package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.ListPet;

public class ListPetHelper {
	
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("VetClinic");

	/**
	 * Insert Pet Method
	 * @param name
	 * @param medication
	 */
	public void insertPet(ListPet lp) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(lp);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Show all Pets Method
	 * @param name
	 * @param medication
	 */
	public List<ListPet> showAllPets() {
		EntityManager em = emfactory.createEntityManager();
		List<ListPet> allPets = em.createQuery("SELECT i FROM ListPet i").getResultList();
		return allPets;
	}
	
	/**
	 * Delete Pet Method
	 * @param name
	 * @param medication
	 */
	public void deletePet(ListPet toDelete) {
		// TODO Auto-generated method stub
		
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<ListPet> typedQuery = em.createQuery(
				"select lp from ListPet lp where lp.name = :selectedName and lp.medication = :selectedMedication",
				ListPet.class);
		
		// Parameter w/ values to delete
		typedQuery.setParameter("selectedName", toDelete.getName());
		typedQuery.setParameter("selectedMedication", toDelete.getMedication());
		typedQuery.setMaxResults(1);

		// Get one result and save.
		ListPet result = typedQuery.getSingleResult();

		// Delete and commit changes.
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Search for Pet by ID Method
	 * @param ID
	 * @param name
	 * @param medication
	 */
	public ListPet searchForPetById(int idToEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		ListPet found = em.find(ListPet.class, idToEdit);
		em.close();
		return found;
	}

	/**
	 * Update Pet Method
	 * @param name
	 * @param medication
	 */
	public void updatePet(ListPet toEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Search for Pet by Name Method
	 * @param name
	 * @param medication
	 */
	public List<ListPet> searchForPetByName(String petName) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<ListPet> typedQuery = em.createQuery("select lp from ListPet lp where lp.name = :selectedName", ListPet.class);
		typedQuery.setParameter("selectedName", petName);

		List<ListPet> foundPets = typedQuery.getResultList();
		em.close();
		return foundPets;
	}

	/**
	 * Search for Pet by Medication Method
	 * @param name
	 * @param medication
	 */
	public List<ListPet> searchForPetByMedication(String petMedication) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<ListPet> typedQuery = em.createQuery("select lp from ListPet lp where lp.medication = :selectedMedication", ListPet.class);
		typedQuery.setParameter("selectedMedication", petMedication);

		List<ListPet> foundPets = typedQuery.getResultList();
		em.close();
		return foundPets;
	}
	
	/**
	 * Clean Up Method (closing).
	 */
	public void cleanUp(){
		emfactory.close();
	}
}