<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.util.*,com.aula.negocio.FuncionarioServico"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listagem de Funcionario.</title>
</head>
<body>

	<%
		FuncionarioServico servico = (FuncionarioServico)  application.getAttribute("lista_funcionario");
		if(servico == null){
			servico = new FuncionarioServico();
			application.setAttribute("lista_funcionario", servico);
			servico.salvar(request.getAttribute("nome").toString());
		}else{
			servico.salvar(request.getAttribute("nome").toString());
		}
		
		ArrayList<String> listaFuncionarios = servico.listar();
	
		for(String funcionario : listaFuncionarios){
				out.println(funcionario);
		}
		
	
	%>

</body>
</html>