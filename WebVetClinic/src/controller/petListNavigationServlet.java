package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PetListDetails;

/**
 * Servlet implementation class petListNavigationServlet
 */
@WebServlet("/petListNavigationServlet")
public class petListNavigationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public petListNavigationServlet() {
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
		String act = request.getParameter("doThisToList");
		
		if (act == null) {
			getServletContext().getRequestDispatcher("/viewAllPetListsServlet").forward(request, response);
			
		}else if (act.equals("delete")) {
			try {
				Integer tempId = Integer.parseInt(request.getParameter("id"));
				
				PetListDetails listToDelete = dao.searchForPetListDetailsById(tempId);
				
				dao.deleteList(listToDelete);
				
			} catch (NumberFormatException e) {
				System.out.println("Forgot to click a button");
			
			} finally {
				getServletContext().getRequestDispatcher("/viewAllPetListsServlet").forward(request, response);
			}
			
		}else if (act.equals("edit")) {
			try {
				Integer tempId = Integer.parseInt(request.getParameter("id"));
				PetListDetails listToEdit = dao.searchForPetListDetailsById(tempId);
				
				request.setAttribute("listToEdit", listToEdit);
				
				request.setAttribute("month",listToEdit.getDob().getMonthValue());
				request.setAttribute("date",listToEdit.getDob().getDayOfMonth());
				request.setAttribute("year",listToEdit.getDob().getYear());
				
				ListPetHelper daoForPets = new ListPetHelper();
				request.setAttribute("allPets", daoForPets.showAllPets());
				
				if(daoForPets.showAllPets().isEmpty()){
					request.setAttribute("allPets", " ");
				}
				getServletContext().getRequestDispatcher("/edit-pet-list.jsp").forward(request, response);
		
			} catch (NumberFormatException e) {
			getServletContext().getRequestDispatcher("/viewAllPetListsServelet").forward(request, response);
		}
		}else if (act.equals("add")) {
			getServletContext().getRequestDispatcher("/newPetList.html").forward(request, response);
		}
	}
}
