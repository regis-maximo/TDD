package com.teste.unitario;

import com.teste.unitario.model.CarrinhoDeCompras;
import com.teste.unitario.model.Produto;
import com.teste.unitario.service.MaiorEMenor;

public class TestMain {

	public static void main(String[] args) {
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		carrinhoDeCompras.adiciona(new Produto("Liquidificador", 250.0));
		carrinhoDeCompras.adiciona(new Produto("Geladeira", 450.0));
		carrinhoDeCompras.adiciona(new Produto("Jogo de pratos", 70.0));
		
		MaiorEMenor encontra = new MaiorEMenor();
		encontra.encontra(carrinhoDeCompras);
		
		System.out.println("O menor valor: " + encontra.getMenor().getValor());
		System.out.println("O maior valor: " + encontra.getMaior().getValor());
		
	}

}
