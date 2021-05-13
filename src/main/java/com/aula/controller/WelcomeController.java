package com.aula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	// classe de controle  - MVC
	
	@RequestMapping(value = "/ola", method = RequestMethod.GET)
	public String bemVindo(@RequestParam(name="name", required=false, defaultValue="Aluno") String name, Model model) {
		model.addAttribute("name", name);
		return "welcome";
	}
	
	@RequestMapping(value = "/produtos", method = RequestMethod.GET)
	public String bemVindo( Model model) {		
		return "produtos";
	}
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.GET)
	public String cadastro( Model model) {		
		return "cadastro";
	}
	
	@RequestMapping(value = "/formulario1", method = RequestMethod.GET)
	public String formulario1( Model model) {		
		return "formulario1";
	}
	
	@RequestMapping(value = "/hello3", method = RequestMethod.GET)
	public String hello3( Model model) {		
		return "hello3";
	}
	
	@RequestMapping(value = "/formulario4", method = RequestMethod.GET)
	public String formulario4( Model model) {		
		return "formulario4";
	}
	
	@RequestMapping(value = "/cadastraForm4", method = RequestMethod.POST)
	public String cadastraForm4( Model model) {		
		return "cadastraForm4";
	}
	
	

	
}
