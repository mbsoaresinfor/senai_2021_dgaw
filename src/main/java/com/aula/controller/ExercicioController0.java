package com.aula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ExercicioController0 {

	
	@RequestMapping(value = "/inicioExercicio", method = RequestMethod.GET)
	public String calculadora() {	
		return "inicioExercicio";
	}
}
