<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

HELLO3

<%
	// CODIGO JSP
	String nome = request.getParameter("nome");
	out.println("O valor do parametro nome é: " + nome);
// REQUEST 1
	 CHAMA PAGINA 1 (NOME)
			CHAMA PAGINA 2
					CHAMA PAGINA 3 NOME
 // FIM REQUEST 1 (MORRE VARIAVEL NOME)
%>

</body>
</html>