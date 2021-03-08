package com.aula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/ola", method = RequestMethod.GET)
	public String bemVindo(@RequestParam(name="name", required=false, defaultValue="Aluno") String name, Model model) {
		model.addAttribute("name", name);
		return "welcome";
	}

	
}
