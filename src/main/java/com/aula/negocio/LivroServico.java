package com.aula.negocio;

import java.util.ArrayList;

import com.aula.dados.LivroRepositorio;
import com.aula.modelos.LivroModelo;

public class LivroServico {

	LivroRepositorio livroRepositorio = new LivroRepositorio();
	ArrayList<String> editoras = new ArrayList<String>();
	
	// CONSTRUTOR
	public LivroServico() {
		editoras.add("Abril");
		editoras.add("Senai");
		editoras.add("FTD");
		editoras.add("joaoziho");
	}
	
	
	public String cadastrarLivro(LivroModelo livro) {
		
		if(livro.nome.length() > 30) {
			return "Livro tem que estar com menos de 30 caracteres";
		}
		
		float precoNumerico = Float.parseFloat(livro.preco);
		
		if(precoNumerico < 0 || precoNumerico > 5000) {
			return "Preco invalido, tem que ser entre 0 a 5000";
		}
		
		// Abril = ok
		// Brasil = ok
		if( editoras.contains(livro.editora) == false ) {
			return "Editora invalida, somente valores = Abril,Senai,FTD";
		}
		
		float pesoNumerico = Float.parseFloat(livro.peso);
		
		if(pesoNumerico < 0 || pesoNumerico > 50) {
			return "Peso invalido, tem que ser entre 0 a 50";
		}
		
		// SE EU CHEGUI AQUI..E PQ TUDO ESTA OK...POSSO CADASTRAR NA MINHA CAMADA DE DADOS.
		
		livroRepositorio.salvar(livro);
		return "";
		
	}
	
}
