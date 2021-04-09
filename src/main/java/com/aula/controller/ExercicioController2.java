package com.aula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ExercicioController2 {

	@RequestMapping(value = "/controlador2", method = RequestMethod.GET)
	public String mostraMensagem() {	
		return "controlador2View";
	}
}
