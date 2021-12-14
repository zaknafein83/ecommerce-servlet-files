<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Risultato della ricerca</title>
</head>
<body>


	<form action="redirect">
		<button name="scelta" value="4" type="submit">Vai in homepage</button><br/>
	</form>
	
	<table border="1">
		<tr>
			<th>Nome</th>
			<th>Descrizione</th>
			<th>Prezzo in €</th>
			<th>Categoria</th>
		</tr>
		<c:forEach var="prodotto" items="${lista }">
		<tr>
			<td><c:out value="${prodotto.getNome() }"></c:out> </td>
			<td><c:out value="${prodotto.getDescrizione() }"></c:out> </td>
			<td><c:out value="${prodotto.getPrezzo() } €"></c:out> </td>
			<td><c:out value="${prodotto.getCategoria() }"></c:out> </td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>