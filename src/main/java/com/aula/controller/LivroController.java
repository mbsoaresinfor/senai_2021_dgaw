package com.aula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aula.modelos.LivroModelo;
import com.aula.negocio.LivroServico;
import com.aula.validacoes.PessoaValida;

@Controller
public class LivroController {

	
	@RequestMapping(value = "/prepara_cadastro_livro", method = RequestMethod.GET)
	public String preparaCadastroLivro() {		
		return "cadastro_livros";
	}
	


	@RequestMapping(value = "/cadastro_livro", method = RequestMethod.POST)
	public String cadastraLivro(@RequestParam(name = "nome") String nome,
			@RequestParam(name = "preco") String preco,
			@RequestParam(name = "editora") String editora,
			@RequestParam(name = "peso") String peso,
			Model model) {		
		
		LivroServico livroServico = new LivroServico();
		
		LivroModelo livro = new LivroModelo();
		livro.editora = editora;
		livro.nome = nome;
		livro.peso = peso;
		livro.preco = preco;
		
		String retornoServico = livroServico.cadastrarLivro(livro);
		
		if(retornoServico.equals("")) { // retorno vazio = SUCESSO.
			model.addAttribute("MENSAGEM", "Livro cadastrado com sucesso");
			return "resultado_cadastro_livro";
		}else {
			model.addAttribute("MENSAGEM", retornoServico);			
			// se retornou alguma coisa=  ERRO
			return "resultado_cadastro_livro";
		}
	}
}
