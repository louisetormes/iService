package controller;

import java.io.IOException;
import java.util.ArrayList;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO_login;
import model.JavaBeans_login;

@WebServlet(urlPatterns = {"/main"})
public class Controller_login extends HttpServlet {
	private static final long serialVersionUID = 1L;

DAO_login dao = new DAO_login();
//	
//	/** The contato. */
	JavaBeans_login acessologin = new JavaBeans_login();
//	
    public Controller_login() {
        super();
        
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		if (action.equals("/main")) {
			inserirAcessologin(request, response);
		} else {
			response.sendRedirect("index.html");
		}
	}

		protected void inserirAcessologin(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			acessologin.setNomeLogin(request.getParameter("nome_login"));
			acessologin.setPasswordLogin(request.getParameter("password_login"));
			System.out.println(acessologin);
			dao.inserirAcessologin(acessologin);
			response.sendRedirect("main");
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
}
//
//}
