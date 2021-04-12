package service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.teste.unitario.model.CarrinhoDeCompras;
import com.teste.unitario.model.Produto;
import com.teste.unitario.service.MaiorEMenor;


class TestaMaiorEMenor {

	@Test
	void ordemDescrescente() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Geladeira", 450.0));
		carrinho.adiciona(new Produto("Liquidificador", 250.0));
		carrinho.adiciona(new Produto("Jogo de pratos", 70.0));

		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinho);
		
		Assert.assertEquals("Jogo de pratos", algoritmo.getMenor().getNomeProduto());
		Assert.assertEquals("Geladeira",
				algoritmo.getMaior().getNomeProduto());
	}
	
	@Test
	void apenasUmProduto() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Geladeira", 450.0));
		
		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinho);
		
		Assert.assertEquals("Geladeira", algoritmo.getMenor().getNomeProduto());
		Assert.assertEquals("Geladeira", algoritmo.getMaior().getNomeProduto());
	}

}
