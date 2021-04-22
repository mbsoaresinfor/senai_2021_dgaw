package com.aula.negocio;

import java.util.ArrayList;

import com.aula.dados.PessoaRepositorio;
import com.aula.modelos.PessoaModelo;

public class PessoaCamadaNegocio {

	PessoaValidacao validador = new PessoaValidacao();
	PessoaRepositorio pessoaRepositorio = new PessoaRepositorio();
	
	/**
	 * Salva uma pessoa
	 * @param pessoa
	 * @return Retorna verdadeiro, caso a pessoa tenha sido salva, senao falso, para error.
	 */
	public boolean salvarPessoa(PessoaModelo pessoa) {
		System.out.println("EXECUTEI A FUNCAO SALVAR_PESSOA");
		
		boolean resultadoValidacao = validador.valida(pessoa);
		if(resultadoValidacao == true) {
			System.out.println("pessoa validada com sucesso");
			pessoaRepositorio.cadastrarPessoa(pessoa);
			return true;
		}else {
			System.out.println("erro na validacao da pessoa");
			return false;
		}
		
	}
	
}
