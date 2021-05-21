package com.aula.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "minha primeira api")
public class PessoaRestController {
	
	private List<String> pessoas = Arrays.asList("maria","pedro", "jose");

	
	@RequestMapping(value= "/pessoas", method=RequestMethod.GET, produces = "application/json")
	public String buscaPessoa() {
		return pessoas.toString();
	}
	
	@RequestMapping(value= "/pessoas/{id}", method=RequestMethod.GET, produces = "application/json")
	public String buscaPessoa(@PathVariable("id") Integer id) {
		try {
			return pessoas.get(id -1);
		}catch(Exception e) {
			return "Este ID " + id + " não é reconhecido pela minha API";
		}
	}
}
