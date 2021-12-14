<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cerca prodotti nel catalogo</title>
</head>
<body>


<form action="ricerca">
	<label for="parolaChiave">Inserisci il termine per effettaure una ricerca</label>
	<input type="text" id="parolaChiave" name="keyword" placeholder="Inserisci un nome o una categoria per cercare un prodotto">
	<input type="submit" value="Ricerca">

</form>
	<form action="redirect">
		<button name="scelta" value="4" type="submit">Vai in homepage</button><br/>
	</form>

</body>
</html>