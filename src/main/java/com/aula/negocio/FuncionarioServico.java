package com.aula.negocio;

import java.util.ArrayList;

import com.aula.dados.FuncionarioRepositorio;

public class FuncionarioServico {

	FuncionarioRepositorio repositorio = new FuncionarioRepositorio();
	
	public void salvar(String nome) {
		// implementacoes
		repositorio.salvar(nome);
	}
	
	public ArrayList<String> listar(){
		return repositorio.listagem();
	}
}
