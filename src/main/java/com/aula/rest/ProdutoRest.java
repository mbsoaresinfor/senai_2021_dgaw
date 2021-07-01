package com.aula.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.aula.modelos.ProdutoModelo;
import com.aula.modelos.UsuarioModelo;


@RestController
public class ProdutoRest {

	// METODO DE ACESSO HTTP: get(buscar), post(criar), delete(deletar) , put(atualizar)
	
	ArrayList<ProdutoModelo> listaProduto = new ArrayList<ProdutoModelo>();
	
	
	public ProdutoRest() {
		ProdutoModelo p = new ProdutoModelo();
		p.id = 1;
		p.nome = "tv";
		p.preco = 10;
		listaProduto.add(p);
	}
	
	@RequestMapping(value= "/produtos2", method=RequestMethod.GET, produces = "application/json")
	public ArrayList<ProdutoModelo> retornaTodosProdutos(){
		System.out.println("### RETORNANDO PRODUTOS");
		return listaProduto;
	}
	
	@RequestMapping(value= "/produto3", method=RequestMethod.POST)
	public void salvar(@RequestBody ProdutoModelo produto){
		System.out.println("### SALVANDO PRODUTOS");
		listaProduto.add(produto);		
	}
	
	@RequestMapping(value= "/produto3/{id}", method=RequestMethod.DELETE)
	public void deletar(@PathVariable("id") Integer id){
		System.out.println("### DELETANDO PRODUTOS");
		listaProduto.removeIf(obj -> obj.id == id);	
	}
	
}
