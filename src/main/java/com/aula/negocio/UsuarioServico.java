package com.aula.negocio;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.aula.modelos.UsuarioModelo;

@Service
public class UsuarioServico {

	ArrayList<UsuarioModelo> lista = new ArrayList<>();
	static int contadorId = 1;
	
	public Integer salvar(UsuarioModelo usuario) {
		usuario.id = contadorId++;
		lista.add(usuario);
		return usuario.id;
	}
	
	public ArrayList<UsuarioModelo> listar(){
		return lista;
	}
	
	public UsuarioModelo buscar(Integer id) {
		for(UsuarioModelo usuario: lista) {
			if(usuario.id == id) {
				return usuario;
			}
		}
		return null;
	}
	
	public void deletar(Integer id) {
		lista.removeIf(obj -> obj.id == id);
	}
	
	public void atualizar(UsuarioModelo usuario) {
		lista.removeIf(obj -> obj.id == usuario.id);
		lista.add(usuario);
	}
		
}
