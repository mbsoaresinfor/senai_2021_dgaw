package com.aula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FuncionarioController {

	@RequestMapping(value = "/inicio_cadastro_funcionario", method = RequestMethod.GET)
	public String index() {	
		return "cadastro_funcionario";
	}
	
	@RequestMapping(value = "/salvar_funcionario", method = RequestMethod.POST)
	public String cadastraAluno(@RequestParam(name = "nome") String nome,Model model) {
		model.addAttribute("nome", nome);
		return "listagem_funcionario";
	}
	
	
	
	
	
}
