package com.aula.validacoes;

public class PessoaValida {

	// false=nome invalido, true= nome valido
	public boolean valida(String nomePessoa) {
		if(nomePessoa == null || nomePessoa.equals("")) {
			return false;
		}else {
			return true;
		}
	}
	
}
