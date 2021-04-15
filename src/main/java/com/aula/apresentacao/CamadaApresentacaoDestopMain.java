package com.aula.apresentacao;

import javax.swing.JOptionPane;

import com.aula.modelos.PessoaModelo;
import com.aula.negocio.PessoaCamadaNegocio;

public class CamadaApresentacaoDestopMain {

	
	public static void main(String[] args) {
	
		PessoaCamadaNegocio camadaNegocio = new PessoaCamadaNegocio();
		
		String nome = JOptionPane.showInputDialog("digite seu nome");
		String idade = JOptionPane.showInputDialog("digite sua idade");
		
		PessoaModelo modelo = new PessoaModelo();
		modelo.nome = nome;
		modelo.idade = idade;
		
		boolean resultadoSalvarPessoa = camadaNegocio.salvarPessoa(modelo);
		if(resultadoSalvarPessoa == true) {
			JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso");
		}else {
			JOptionPane.showMessageDialog(null, "Pessoa não cadastrada");
		}
		
		

	}

}
