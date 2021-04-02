package com.aula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aula.calculos.Calculadora;


@Controller
public class CalculadoraController {
	
	@RequestMapping(value = "/pre_calculdora", method = RequestMethod.GET)
	public String calculadora() {	
		return "calculadora";
	}
	
	// CONTROLADOR
	@RequestMapping(value = "/calcular", method = RequestMethod.POST)
	public String calculadora(@RequestParam(name = "valor1") String valor1,
			@RequestParam(name = "valor2") String valor2,
			@RequestParam(name = "operacao") String operacao,
			Model model) {		
		
		// MODEL
		Calculadora calc = new Calculadora();
		Float valor1Float = Float.parseFloat(valor1);
		Float valor2Float = Float.parseFloat(valor2);
		Float resultado = calc.calcular(valor1Float, valor2Float, operacao);
		model.addAttribute("resultado", resultado);
		
		// VIEW
		return "mostraCalculo";
	}
	
	

}
