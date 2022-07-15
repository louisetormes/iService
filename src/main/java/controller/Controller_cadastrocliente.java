package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import model.DAO_cadastrocliente;
import model.DAO_login;
import model.JavaBeans_cadastrocliente;
import model.JavaBeans_login;

@WebServlet(urlPatterns = { "/Controller", "/insert"})
public class Controller_cadastrocliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
DAO_cadastrocliente dao = new DAO_cadastrocliente();

	
	JavaBeans_cadastrocliente cadastrocliente = new JavaBeans_cadastrocliente();
	
    public Controller_cadastrocliente() {
        super();
      
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		if (action.equals("/insert")) {
			inserirCadastroCliente(request, response);
		} else {
			response.sendRedirect("index.html");
		}
	}

		
		protected void inserirCadastroCliente(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			cadastrocliente.setNome(request.getParameter("nome"));
			cadastrocliente.setFone(request.getParameter("fone"));
			cadastrocliente.setEmail(request.getParameter("email"));
			cadastrocliente.setPassword(request.getParameter("password"));
			cadastrocliente.setConfirmpassword(request.getParameter("confirmpassword"));
			System.out.println(cadastrocliente);
			dao.inserirCadastroCliente(cadastrocliente);
			response.sendRedirect("main");
		}
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
