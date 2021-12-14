package esercizio.ecommerce.controller;

import java.io.IOException;

import esercizio.ecommerce.utility.GestioneFile;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/redirect")
public class GestioneRedirect extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String scelta = req.getParameter("scelta");
		
		switch (scelta) {
		case "1":
			getServletContext().getRequestDispatcher("/nuovoProdotto.jsp").forward(req, resp);
			break;

		case "2":
			try {
				req.setAttribute("listaProdotti", GestioneFile.leggiCatalogo());
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			getServletContext().getRequestDispatcher("/catalogo.jsp").forward(req, resp);
			break;
			
		case "3":
			getServletContext().getRequestDispatcher("/ricerca.jsp").forward(req, resp);
			break;
		case "4":
			getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
			break;
		default:
			break;
		}
	}

}
