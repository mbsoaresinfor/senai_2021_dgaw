package com.aula.dados;

import java.util.ArrayList;
import com.aula.modelos.LivroModelo;

public class LivroRepositorio {

	ArrayList<LivroModelo> listaLivros = new ArrayList<LivroModelo>();
	
	public void salvar(LivroModelo livro ) {	
		listaLivros.add(livro);
	}
	
}
