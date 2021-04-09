package com.aula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ExercicioController1 {

	@RequestMapping(value = "/controlador1", method = RequestMethod.GET)
	public String mostraMensagem() {	
		return "controlador1View";
	}
	
}
