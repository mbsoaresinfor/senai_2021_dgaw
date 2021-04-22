package com.aula.dados;

import java.util.ArrayList;

import com.aula.modelos.PessoaModelo;

public class PessoaRepositorio {
	
	private ArrayList<PessoaModelo> listaPessoas = new ArrayList<PessoaModelo>();
	
	public void cadastrarPessoa(PessoaModelo pessoa) {	
		listaPessoas.add(pessoa);
	}
	
	public void removerPessoa(String nome) {		
		for(PessoaModelo pessoa : listaPessoas) {
			if(pessoa.nome.equals(nome)) {
				listaPessoas.remove(pessoa);
			}
		}
	}
	
	public PessoaModelo buscaPessoa(String  nome) {
		for(PessoaModelo pessoa : listaPessoas) {
			if(pessoa.nome.equals(nome)) {
				return pessoa;
			}
		}
		return null;
	}
	
	public ArrayList<PessoaModelo> listarPessoas(){
		return listaPessoas;
	}
	
	
}
