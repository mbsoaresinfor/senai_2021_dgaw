<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.util.*"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listagem de Produtos.</title>
</head>
<body>

	<%
		// aqui � jsp.
		List<String> listaProdutos = new ArrayList<String>();
		listaProdutos.add("tv");
		listaProdutos.add("radio");
		listaProdutos.add("games");
		listaProdutos.add("panelas");
		
		out.println("<table border=1>");
		
		for(String produto : listaProdutos){
			out.println("<tr>");
				out.println("<td>");
				out.println(produto);
				out.println("</td>");
			out.println("</tr>");
		}
		
		out.println("</table>");
		
	
	%>

</body>
</html>