package com.aula.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExemploController {

	@GetMapping({"/ola"})
    public String index(@RequestParam(name="name", required=false, defaultValue="Aluno") String name, Model model) {        
		model.addAttribute("name", name);
		return "boasVindas";
    }
}
