package com.aula.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aula.modelos.UsuarioModelo;
import com.aula.negocio.UsuarioServico;

import io.swagger.annotations.ApiOperation;

@RestController
public class UsuarioAPI {

	// injecao de dependencia.
	@Autowired
	UsuarioServico servico;
	
	@ApiOperation(value = "Salva um usuario no sistema", response = ResponseEntity.class)
	@RequestMapping(value= "/usuarios", method=RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Integer> salvar(@RequestBody UsuarioModelo usuario){		
		return new ResponseEntity<>(servico.salvar(usuario),HttpStatus.OK);		
	}
	
	@RequestMapping(value= "/usuarios", method=RequestMethod.GET, produces = "application/json")
	public ArrayList<UsuarioModelo> listar(){
		return servico.listar();
	}
	
	@RequestMapping(value= "/usuarios/{id}", method=RequestMethod.GET, produces = "application/json")
	public ResponseEntity<UsuarioModelo> buscar(@PathVariable("id") Integer id){
		return new ResponseEntity<>(servico.buscar(id),HttpStatus.OK);
	}
	
	@RequestMapping(value= "/usuarios/{id}", method=RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity<Void> deletar(@PathVariable("id") Integer id){
		servico.deletar(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(value= "/usuarios", method=RequestMethod.PUT, produces = "application/json")
	public ResponseEntity<Void> atualizar(@RequestBody UsuarioModelo usuario){		
		servico.atualizar(usuario);
		return new ResponseEntity<>(HttpStatus.OK);		
	}
	
}
