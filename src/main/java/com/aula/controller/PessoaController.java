package com.aula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aula.modelos.PessoaModelo;
import com.aula.negocio.PessoaCamadaNegocio;
import com.aula.validacoes.PessoaValida;


@Controller
public class PessoaController {
	
	@RequestMapping(value = "/prepara_cadastro_pessoa", method = RequestMethod.GET)
	public String preparaCadastroPessoa() {		
		return "cadastro_pessoa";
	}
	
	// CONTROLADOR
	@RequestMapping(value = "/cadastro_pessoa", method = RequestMethod.POST)
	public String cadastraPessoa(@RequestParam(name = "nome") String nome) {		
		
		// MODELO
		PessoaValida validaPessoa = new PessoaValida();
		boolean resultado = validaPessoa.valida(nome);
		
		// DEFINICAO DE QUAL VIEW VAI SER EXECUTADO, BASEADO NO RETORNO DO MODELO
		if(resultado == true) {
			return "cadastro_pessoa_OK";
		}else {		
			return "cadastro_pessoa_ERROR";
		}
	}
	
	
		@RequestMapping(value = "/prepara_cadastro_pessoa2", method = RequestMethod.GET)
		public String preparaCadastroPessoa2() {		
			return "cadastroPessoaCamadaApresentacao";
		}
	
		@RequestMapping(value = "/cadastro_pessoa_2", method = RequestMethod.POST)
		public String cadastraPessoa2(@RequestParam(name = "nome") String nome,
				@RequestParam(name = "idade") String idade) {		
			

			PessoaCamadaNegocio camadaNegocio = new PessoaCamadaNegocio();
			
			PessoaModelo modelo = new PessoaModelo();
			modelo.nome = nome;
			modelo.idade = idade;
			
			boolean resultado = camadaNegocio.salvarPessoa(modelo);
			
			if(resultado == true) {
				return "cadastro_pessoa_OK";
			}else {		
				return "cadastro_pessoa_ERROR";
			}
		}
}
