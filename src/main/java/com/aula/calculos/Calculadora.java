package com.aula.calculos;

public class Calculadora {

	public float calcular(Float v1,Float v2,String operacao) {
		if(operacao.equals("soma")) {
			return v1 + v2;
		}else if(operacao.equals("subtrair")) {
			return v1 - v2;
		}
		return -1;
	}
	
}
