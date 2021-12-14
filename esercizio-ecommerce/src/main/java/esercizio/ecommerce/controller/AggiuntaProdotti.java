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

@WebServlet("/aggiungi")
public class AggiuntaProdotti extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		String descrizione = req.getParameter("descrizione");
		double prezzo = Double.parseDouble(req.getParameter("prezzo"));
		String categoria = req.getParameter("categoria");
		
		Prodotto nuovoProdotto = new Prodotto(nome, descrizione, prezzo, categoria);
		
		try {
			List<Prodotto> listaProdottiLettaDaFile = GestioneFile.leggiCatalogo();
			if(listaProdottiLettaDaFile == null) {
				listaProdottiLettaDaFile =new ArrayList<>();
			}
			listaProdottiLettaDaFile.add(nuovoProdotto);
			GestioneFile.salvaFile(listaProdottiLettaDaFile);
			
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
		
	}
}
