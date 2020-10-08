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
 * Servlet implementation class createNewPetListServlet
 */
@WebServlet("/createNewPetListServlet")
public class createNewPetListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public createNewPetListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ListPetHelper lph = new ListPetHelper();
		
		String petListName = request.getParameter("petListName");
		System.out.println("Owner Name: "+ petListName);
		
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		String year = request.getParameter("year");
		String ownerName = request.getParameter("ownerName");
		LocalDate ld;
		
		try {
			ld = LocalDate.of(Integer.parseInt(year),
			Integer.parseInt(month), Integer.parseInt(day));
			}
			catch(NumberFormatException ex) {
				ld = LocalDate.now();
			}
		
		String[] selectedPets = request.getParameterValues("allPetsToAdd");
		
		List<ListPet> selectedPetsInList = new ArrayList<ListPet>();
		
		if (selectedPets != null && selectedPets.length > 0) {
			for(int i = 0; i<selectedPets.length; i++) {
				System.out.println(selectedPets[i]);
				ListPet c =
				lph.searchForPetById(Integer.parseInt(selectedPets[i]));
				selectedPetsInList.add(c);
			}
		}
		
		Owner owner = new Owner(ownerName);
		
		PetListDetails pld = new PetListDetails(petListName, ld, owner);
		
		pld.setListOfPets(selectedPetsInList);
		PetListDetailsHelper plh = new PetListDetailsHelper();
		plh.insertNewPetListDetails(pld);
		
		System.out.println("Success!");
		System.out.println(pld.toString());
		
		getServletContext().getRequestDispatcher("/viewAllPetListsServlet").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
