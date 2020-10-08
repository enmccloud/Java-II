package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ListPet;
import model.Owner;
import model.PetListDetails;

/**
 * Servlet implementation class editListDetailsServlet
 */
@WebServlet("/editListDetailsServlet")
public class editListDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editListDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PetListDetailsHelper dao = new PetListDetailsHelper();
		ListPetHelper lph = new ListPetHelper();
		OwnerHelper oh = new OwnerHelper();
		
		Integer tempId = Integer.parseInt(request.getParameter("id"));
		PetListDetails listToUpdate = dao.searchForPetListDetailsById(tempId);
		
		String newPetListName = request.getParameter("petListName");
		
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		String year = request.getParameter("year");
		
		String ownerName = request.getParameter("ownerName");
		Owner newOwner = oh.findOwner(ownerName);
		
		LocalDate ld;
		try {
			ld = LocalDate.of(Integer.parseInt(year),
			Integer.parseInt(month), Integer.parseInt(day));
		} catch (NumberFormatException ex) {
			ld = LocalDate.now();
		}
		
		try {
			String[] selectedPets = request.getParameterValues("allPetsToAdd");
			List<ListPet> selectedPetsInList = new ArrayList<ListPet>();
		
			for (int i = 0; i < selectedPets.length; i++) {
				System.out.println(selectedPets[i]);
				
				ListPet c = lph.searchForPetById(Integer.parseInt(selectedPets[i]));
				selectedPetsInList.add(c);
			}
			listToUpdate.setListOfPets(selectedPetsInList);
			
		}catch (NullPointerException ex) {
			List<ListPet> selectedPetsInList = new ArrayList<ListPet>();
			listToUpdate.setListOfPets(selectedPetsInList);
		}
		
		listToUpdate.setPetListName(newPetListName);
		listToUpdate.setDob(ld);
		listToUpdate.setOwner(newOwner);
		
		dao.updateList(listToUpdate);
		
		getServletContext().getRequestDispatcher("/viewAllPetListsServlet").forward(request, response);
	}
}
