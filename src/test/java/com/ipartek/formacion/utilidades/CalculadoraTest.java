package com.ipartek.formacion.utilidades;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	//CUIDADO!!! si no pones @Test no pilla el test
	@Test
	public void sumar() {
		//fail("Not yet implemented");
		int resultado= Calculadora.sumar(2, 3);
		int esperado =5; //2 + 3 = 5
		assertEquals("No suma bien",esperado, resultado);
	}

	@Test
	public void restar() {
		//fail("Not yet implemented");
		assertEquals(0, Calculadora.restar(2, 2));
		assertEquals(-1, Calculadora.restar(2, 3));
		assertEquals(1, Calculadora.restar(3, 2));
	}
	
	@Test
	public void multiplicar() {
		//fail("Not yet implemented");
		assertEquals(4, Calculadora.multiplicar(2, 2));
		assertEquals(0, Calculadora.multiplicar(2, 0));
		assertEquals(0, Calculadora.multiplicar(0, 2));
		assertEquals(-4, Calculadora.multiplicar(2, -2));
	}

	@Test (expected = ArithmeticException.class)
	public void dividir() {
		//fail("Falta de implementar");
		assertEquals(0, Calculadora.dividir(0, 2));
		assertEquals(5, Calculadora.dividir(10, 2));
		assertEquals(-5, Calculadora.dividir(10, -2));
		
		//Si ponemos @Test (expected = ArithmeticException.class)
		Calculadora.dividir(2, 0);
		
		// si ponemos solo @Test
		/*
		try {
			Calculadora.dividir(2, 0);
			fail("Deberia haber lanzado excepcion");
		}catch (Exception e) {
			// TODO: handle exception
			assertTrue(true);
		}
		*/
	}
	
	@Test (expected = NullPointerException.class)
	public void dividirNullPointer() {
		//Si dividir tuviera que lanzar mas de un tipo de excepcion hacemos otro test		
	}


}
