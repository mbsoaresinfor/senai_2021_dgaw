package com.aula.negocio;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.aula.modelos.UsuarioModelo;

@Service
public class UsuarioServico {

	public Integer salvar(UsuarioModelo usuario) {
		return -1;
	}
	
	public ArrayList<UsuarioModelo> listar(){
		return null;
	}
	
	public UsuarioModelo buscar(Integer id) {
		return null;
	}
	
	public void deletar(Integer id) {}
	
	public void atualizar(UsuarioModelo usuario) {}
		
}
