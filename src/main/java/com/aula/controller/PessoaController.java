package com.aula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
}
