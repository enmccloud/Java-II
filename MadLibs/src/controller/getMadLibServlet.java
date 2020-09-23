/**************************************************************
* Name        : MadLibs (Week 4 Assessment)
* Author      : Nikki McCloud
* Created     : 9/23/20
* Course      : CIS 175 Java II
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : MadLibs program that displays user's story after
* 				receiving user input.
*               Input:  Words for each category.
*               Output: MadLib story with user's input.
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/

package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MadLib;

/**
 * Servlet implementation class getMadLibServlet
 */
@WebServlet("/getMadLibServlet")
public class getMadLibServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getMadLibServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Requesting Parameters
		String name = request.getParameter("name");
		String favColor = request.getParameter("favColor");
		String animal = request.getParameter("animal");
		String location = request.getParameter("location");
		String verb = request.getParameter("verb");
		
		//New Madlib instance
		MadLib inputMadLib = new MadLib();
		
		//Setting parameters
		inputMadLib.setName(name);
		inputMadLib.setFavColor(favColor);
		inputMadLib.setAnimal(animal);
		inputMadLib.setLocation(location);
		inputMadLib.setVerb(verb);
		
		request.setAttribute("inputMadLib", inputMadLib);
		
		request.getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
	}

}
