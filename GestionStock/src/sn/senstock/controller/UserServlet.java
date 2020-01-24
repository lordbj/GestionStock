package sn.senstock.controller;

import sn.senstock.dao.UserImp;
import sn.senstock.entities.User;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/User")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	private UserImp  user_metier;
	
    public UserServlet() {
       
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		user_metier = new UserImp();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getSession().getAttribute("user_session") != null ) {
			if(request.getParameter("page")!=null) {
				String page = request.getParameter("page").toString();
				if(page.equals("edit")) {
					int id = Integer.parseInt(request.getParameter("id").toString());
					user_metier.get(id);
					request.getRequestDispatcher("view/user/edit.jsp").forward(request, response);
					
				}
				
				if(page.equals("delete")) {
					if(request.getParameter("id")!=null){
					int id = Integer.parseInt(request.getParameter("id").toString());
					user_metier.delete(id);
				}
				
				}
				
			}
			
			
			request.setAttribute("liste_users", user_metier.getAll());
			
			request.getRequestDispatcher("view/user/liste.jsp").forward(request, response);
		}
		else {
			response.sendRedirect("Login");
			}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("valider") != null) {
			String nom = request.getParameter("nom").toString();
			String prenom = request.getParameter("prenom").toString();
			String email = request.getParameter("email").toString();
			String password = request.getParameter("password").toString();
			
			User u = new User();
			u.setNom(nom);
			u.setPrenom(prenom);
			u.setEmail(email);
			u.setPassword(password);
			
			int ok = user_metier.add(u);
			request.setAttribute("message",ok);
			response.sendRedirect("User");
		}
	}

}
