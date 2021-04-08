package com.aula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AlunoController {

	@RequestMapping(value = "/indexCadastroAluno", method = RequestMethod.GET)
	public String index() {	
		return "indexCadastroAluno";
	}
	
	@RequestMapping(value = "/cadastraAluno", method = RequestMethod.POST)
	public String cadastraAluno(@RequestParam(name = "nome") String nome,
			@RequestParam(name = "idade") String idade,
			Model model) {	
		
		if (nome.equals("")) {
			model.addAttribute("error", "Nome invalido");
		}else if(idade.equals("")) {
			model.addAttribute("error", "Idade invalida");
		}else {
			model.addAttribute("nome", nome);
			model.addAttribute("idade", idade);
		}
		
		return "resultadoCadastroAluno";
	}
	
	
	
}
