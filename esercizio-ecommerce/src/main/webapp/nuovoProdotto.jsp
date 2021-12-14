<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aggiungi un nuovo prodotto</title>
</head>
<body>

	<form action="aggiungi">
		
		<label for="nome">Inserisci il nome del prodotto</label>
		<input type="text" name="nome" id="nome" placeholder="Inserisci il nome del prodotto">
		
		<label for="descrizione">Inserisci la descrizione del prodotto</label>
		<input type="text" name="descrizione" id="descrizione" placeholder="Inserisci la descrizione del prodotto">
		
		<label for="prezzo">Inserisci il prezzo del prodotto</label>
		<input type="number" name="prezzo" id="prezzo" placeholder="Inserisci il prezzo del prodotto" step="0.01" min="1">
		
		
		<label for="categoria">Inserisci la categoria del prodotto</label>
		<input type="text" name="categoria" id="categoria" placeholder="Inserisci la categoria del prodotto">
		
		<input type="submit" value="Aggiungi nuovo prodotto">
	</form>
	<form action="redirect">
		<button name="scelta" value="4" type="submit">Vai in homepage</button><br/>
	</form>

</body>
</html>