<html>
<body>
<div class="container">
	Bem Vindo ${name} a p�gina JSP!! 
	<br>
	
	<%
		out.println("<i>C�digo gerado por jsp.</i>");
		out.println("<br>meu nome � marcelo");
		
	%>
	
	<!--  aqui j� � html -->
	
	<br>
	voltei a programar em HTML.
	<br>
	
	<%
		String nome = "Maria da Siva";
		int idade = 10;
		if(idade > 18){
			out.println(nome + " � maior de idade");
		}else{
			out.println(nome + " � menor de idade");
		}
	
		for(int i=0; i < 5; i++){
			out.println("<br>valor do contador = " + i);
		}
		
	%>
	<br>
	<a href="produtos">Produtos </a>
	
	
</div>


</body>
</html>