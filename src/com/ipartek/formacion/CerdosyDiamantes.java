package com.ipartek.formacion;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CerdosyDiamantes {

	@Test
	public void test() {
		ArrayList<IOrdenable> lista = new ArrayList<IOrdenable>();
		Cerdo c = new Cerdo();
		Diamante d= new Diamante();
		
		lista.add(c);
		lista.add(d);	
		
		for(IOrdenable elemento: lista) {
			if (elemento instanceof Diamante) {
				Diamante diamante = (Diamante)elemento;
			}
			if (elemento instanceof Cerdo) {
				Cerdo cerdo = (Cerdo)elemento;
			}
		}
		
	}

}
