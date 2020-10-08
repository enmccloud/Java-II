package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.PetListDetails;

public class PetListDetailsHelper {

	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("VetClinic");

	public void insertNewPetListDetails(PetListDetails p) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.close();
		}
	
	public List<PetListDetails> getLists() {
		EntityManager em = emfactory.createEntityManager();
		
		List<PetListDetails> allDetails = em.createQuery("SELECT d FROM PetListDetails d").getResultList();
		
		return allDetails;
	}

	public void deleteList(PetListDetails toDelete) {
		// TODO Auto-generated method stub
		
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<PetListDetails> typedQuery = em.createQuery("SELECT detail from PetListDetails detail where detail.id = :selectedId", PetListDetails.class);
		
		typedQuery.setParameter("selectedId", toDelete.getId());
		typedQuery.setMaxResults(1);
		PetListDetails result = typedQuery.getSingleResult();
		
		em.remove(result);
		em.getTransaction().commit();
		em.close();	
	}
	
	public PetListDetails searchForPetListDetailsById(Integer tempId) {
		
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		PetListDetails found = em.find(PetListDetails.class, tempId);
		em.close();
		return found;
	}
	
	public void updateList(PetListDetails toEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(toEdit);
		
		em.getTransaction().commit();
		em.close();
	}
}
