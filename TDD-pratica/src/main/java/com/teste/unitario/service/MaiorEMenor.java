package com.teste.unitario.service;

import com.teste.unitario.model.CarrinhoDeCompras;
import com.teste.unitario.model.Produto;

public class MaiorEMenor {

	private Produto menor;
	private Produto maior;
	
	
	public Produto getMenor() {
		return menor;
	}

	public void setMenor(Produto menor) {
		this.menor = menor;
	}

	public Produto getMaior() {
		return maior;
	}

	public void setMaior(Produto maior) {
		this.maior = maior;
	}

	public void encontra(CarrinhoDeCompras carrinhoDeCompras) {
		for(Produto prod : carrinhoDeCompras.getProdutos()) {
			if(menor == null || prod.getValor() < menor.getValor()) {
				menor = prod;
			} 
			if(maior == null || prod.getValor() > maior.getValor()) {
				maior = prod;
			}
		}
	}
}
