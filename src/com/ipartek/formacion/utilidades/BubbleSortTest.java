package com.ipartek.formacion.utilidades;

import static org.junit.Assert.*;

import org.junit.Test;

public class BubbleSortTest {
	
	@Test
	public void testBubbleSort() throws Exception {
		int[] listaDesordenada ={3,2,1};
		int[] listaResultado= {1,2,3};
		int[] listaOrdenada=BubbleSort.bubbleSort(listaDesordenada);
		assertArrayEquals("Todos iguales", listaResultado, listaOrdenada);
		
	}
			
	@Test
	public void testBubbleSortBasico() throws Exception {
		int[] lista ={3,0,1,8,7,2,5,4,6,9};
		int[] resultado=BubbleSort.bubbleSort(lista);
		assertEquals("Espera un 0 en la primera posicion",0, resultado[0]); 
		assertEquals("Espera un 1 en la segunda posicion",1, resultado[1]);
		assertEquals("Espera un 2 en la tercera posicion",2, resultado[2]);
		assertEquals("Espera un 3 en la cuarta posicion",3, resultado[3]);
		assertEquals("Espera un 9 en la decima posicion",9, resultado[9]);	
	}

	@Test
	public void testBubbleSortRepetidos() throws Exception {
		int[] lista ={3,0,0,8,7,0,3,4,6,9};
		int[] resultado=BubbleSort.bubbleSort(lista);
		assertEquals("Espera un 0 en la primera posicion",0, resultado[0]); 
		assertEquals("Espera un 0 en la segunda posicion",0, resultado[1]); 
		assertEquals("Espera un 0 en la tercera posicion",0, resultado[2]); 
		assertEquals("Espera un 3 en la cuarta posicion",3, resultado[3]);
		assertEquals("Espera un 3 en la quinta posicion",3, resultado[4]);	
	}
	
	@Test
	public void testBubbleSortNegativos() throws Exception {
		int[] lista ={3,-1,0,8,7,0,3,4,6,9};
		int[] resultado=BubbleSort.bubbleSort(lista);
		assertEquals("Espera un -1 en la primera posicion",-1, resultado[0]); 
		assertEquals("Espera un 0 en la segunda posicion",0, resultado[1]); 
		assertEquals("Espera un 0 en la tercera posicion",0, resultado[2]); 
		assertEquals("Espera un 3 en la cuarta posicion",3, resultado[3]);
		assertEquals("Espera un 3 en la quinta posicion",3, resultado[4]);	
	}
	
	@Test (expected = Exception.class)
	public void testBubbleSortNull() throws Exception {
		BubbleSort.bubbleSort(null);
	}
}
