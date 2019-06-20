package com.ipartek.formacion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CerdosyDiamantes {

	@Test
	public void test() {
		ArrayList<IOrdenable> lista = new ArrayList<IOrdenable>();
		Cerdo c1 = new Cerdo(500, "Tiberio");
		Cerdo c2 = new Cerdo(300,"Peggy");
		Diamante d1= new Diamante(1000,"rojo");
		Diamante d2= new Diamante(50,"verde");
		
		lista.add(d2);	
		lista.add(d1);	
		lista.add(c1);
		lista.add(c2);	
		
		for(IOrdenable elemento: lista) {
			if (elemento instanceof Diamante) {	
				Diamante diamante = (Diamante)elemento;
				diamante.getColor();
			}
			if (elemento instanceof Cerdo) {
				Cerdo cerdo = (Cerdo)elemento;
				cerdo.getNombre();
			}
		}
		Collections.sort(lista, new ComparatorCerdoDiamantes());
		
		assertEquals(d1,lista.get(0));
		assertEquals(c1,lista.get(1));
		assertEquals(c2,lista.get(2));
		assertEquals(d2,lista.get(3));
	}

}
