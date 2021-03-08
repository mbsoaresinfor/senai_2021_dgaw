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

	
}
