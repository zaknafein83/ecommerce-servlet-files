package esercizio.ecommerce.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import esercizio.ecommerce.model.Prodotto;
import esercizio.ecommerce.utility.GestioneFile;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ricerca")
public class GestioneRicerca extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String keyword = req.getParameter("keyword");
		try {
			List<Prodotto> listaProdottiACatalogo = GestioneFile.leggiCatalogo();
			List<Prodotto> risultatoRicerca = new ArrayList<>();
			for (Prodotto prodotto : listaProdottiACatalogo) {
				if (prodotto.getNome().contains(keyword) || prodotto.getCategoria().equalsIgnoreCase(keyword)) {
					risultatoRicerca.add(prodotto);
				}
			}
			
			req.setAttribute("lista", risultatoRicerca);
			
			getServletContext().getRequestDispatcher("/risultati.jsp").forward(req, resp);
			
			
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
