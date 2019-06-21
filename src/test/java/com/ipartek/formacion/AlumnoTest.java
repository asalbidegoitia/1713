package com.ipartek.formacion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class AlumnoTest {

	@Test
	public void testSortNumVecesLeer() {

		
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		
		Alumno a = new Alumno("Pepe");
		a.setNumeroApariciones(0);
		alumnos.add(a);
				
		a = new Alumno("Manoli");
		a.setNumeroApariciones(2);
		alumnos.add(a);
		
		a = new Alumno("Antton");
		a.setNumeroApariciones(20);
		alumnos.add(a);
				
		Collections.sort(alumnos);		
		
		assertEquals("Antton", alumnos.get(0).getNombre() );
		assertEquals("Manoli", alumnos.get(1).getNombre() );
		assertEquals("Pepe", alumnos.get(2).getNombre() );
		
		
	}
	
	
	@Test
	public void testSortNombre() {

		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		
		Alumno a = new Alumno("Zapatero");
		a.setNumeroApariciones(0);
		alumnos.add(a);
				
		a = new Alumno("Anastasia");
		a.setNumeroApariciones(2);
		alumnos.add(a);
		
		a = new Alumno("Burrito");
		a.setNumeroApariciones(20);
		alumnos.add(a);
				
		Collections.sort(alumnos, new ComparatorNombre() );		
		
		assertEquals("Anastasia", alumnos.get(0).getNombre() );
		assertEquals("Burrito", alumnos.get(1).getNombre() );
		assertEquals("Zapatero", alumnos.get(2).getNombre() );
		
		
	}

}