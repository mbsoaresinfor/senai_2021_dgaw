package com.aula.negocio;

import com.aula.modelos.PessoaModelo;

public class PessoaValidacao {

	public boolean valida(PessoaModelo pessoa) {
		System.out.println("EXECUTANDO FUNCAO VALIDA");
		
		if(pessoa.nome.equals("") ) {
			return false;
		}
		
		if(pessoa.idade.equals("")) {
			return false;
		}
		
		return true;
	}
	
}
