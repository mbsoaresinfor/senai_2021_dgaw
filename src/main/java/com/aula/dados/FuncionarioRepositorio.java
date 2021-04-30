package com.aula.dados;

import java.util.ArrayList;

public class FuncionarioRepositorio {

	ArrayList<String> funcionarios = new ArrayList<>();
	
	public void salvar(String nome) {
		funcionarios.add(nome);
	}
	
	public ArrayList<String> listagem(){
		return funcionarios;
	}
	
	
}
