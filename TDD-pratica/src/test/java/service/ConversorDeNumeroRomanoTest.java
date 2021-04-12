package service;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import com.teste.unitario.model.ConversorDeNumeroRomano;

class ConversorDeNumeroRomanoTest {

	@Test
	void deveEntenderOSimboloI() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("I");
		assertEquals(1, numero);
	}
	
	@Test
	void deveEntenderOSimboloV() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("V");
		assertEquals(5, numero);
	}
	
	@Test
	void deveEntenderDoisSimbolosComoII() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("II");
		assertEquals(2, numero);
	}
	
	@Test
	void deveEntenderQuatroSimbolosDoisADoisComoXXII() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("XXII");
		assertEquals(22, numero);
	}
	
	@Test
	void deveEntenderNumerosComoIX() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("IX");
		assertEquals(9, numero);
	}

	@Test
	public void deveEntenderNumerosComplexosComoXXIV() {
	ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
	int numero = romano.converte("XXIV");
	assertEquals(24, numero);
	}
	
}
