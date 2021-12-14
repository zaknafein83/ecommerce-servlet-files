package esercizio.ecommerce.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import esercizio.ecommerce.model.Prodotto;

public class GestioneFile {

	private final static String PATH = "catalogo.xck";

	public static void salvaFile(List<Prodotto> listaProdotti) throws ClassNotFoundException, IOException {
		File file = new File(PATH);
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(listaProdotti);

		objectOutputStream.close();
		fileOutputStream.close();
	}

	public static List<Prodotto> leggiCatalogo() throws ClassNotFoundException, IOException {
		File file = new File(PATH);
		if(!file.exists()) {
			return new ArrayList<>();
		}
		FileInputStream fileInputStream = new FileInputStream(file);
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		List<Prodotto> listaPersone = (List<Prodotto>) inputStream.readObject();
		inputStream.close();
		fileInputStream.close();
		return listaPersone;

	}
	
}