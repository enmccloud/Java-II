package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ListPet;

/**
 * Servlet implementation class EditPetServlet
 */
@WebServlet("/editPetServlet")
public class EditPetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditPetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		ListPetHelper dao = new ListPetHelper();
		
		String name = request.getParameter("name");
		String medication = request.getParameter("medication");
		Integer tempId = Integer.parseInt(request.getParameter("id"));
				
		ListPet petToUpdate = dao.searchForPetById(tempId);
		petToUpdate.setMedication(medication);
		petToUpdate.setName(name);
				
		dao.updatePet(petToUpdate);

		getServletContext().getRequestDispatcher("/viewAllPetsServlet").forward(request, response);
	}

}
