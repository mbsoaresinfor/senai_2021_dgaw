package com.aula.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aula.modelos.AlunoModelo;

import io.swagger.annotations.ApiOperation;

@RestController
public class AlunoRestApi {

	ArrayList<AlunoModelo> listaAluno = new ArrayList<>();
	
	public AlunoRestApi() {
		AlunoModelo aluno1 = new AlunoModelo();
		aluno1.nome = "Maria";
		aluno1.curso = "ADS";
		
		AlunoModelo aluno2 = new AlunoModelo();
		aluno2.nome = "Pedro";
		aluno2.curso = "ADS";
		
		listaAluno.add(aluno1);
		listaAluno.add(aluno2);
	}
	
	@ApiOperation(value = "Lista os alunos", response = List.class)
	@RequestMapping(value= "/alunos", method=RequestMethod.GET, produces = "application/json")
	public ArrayList<AlunoModelo> retornaTodosAlunos(){
		return listaAluno;
	}
	
	@ApiOperation(value = "Busca um aluno pelo id", response = AlunoModelo.class)
	@RequestMapping(value= "/alunos/{id}", method=RequestMethod.GET, produces = "application/json")
	public AlunoModelo retornaAluno(@PathVariable("id") Integer id) {
		try {
			return listaAluno.get(id -1);
		}catch(Exception e) {
			return new AlunoModelo();
		}
	}
	
	
	
}
