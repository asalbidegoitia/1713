package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Aula {

	private static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	
	
	public static void main(String[] args) {
		/**********************************************************************
		 * // Declarar array con nombre alumnos
		 **********************************************************************/

		String[] losAlumnos = { "Ander", "Mounir", "Andoni", "Asier", "Jon C", "Arkaitz", "Aritz", "Manuel", "Eduardo",
				"Eder I", "Eder S", "Gaizka", "Borja", "Verónica", "Jon A", "José Luis" };

		
		for (int i = 0; i < losAlumnos.length; i++) {
			alumnos.add(new Alumno(losAlumnos[i]));
		}

		/*
		 * for (int i = 0; i < alumnos.length; i++) { System.out.println(i + " " +
		 * alumnos[i]); }
		 */

		/**********************************************************************
		 * //generar numero aleatorio
		 **********************************************************************/

		/*
		 * Random random = new Random(); int alumnoRandom =
		 * random.nextInt(alumnos.length);
		 */

		// otra forma (con el math random)
		int alumnoRandom = (int) (Math.random() * alumnos.size());

		/**********************************************************************
		 * //mostrar voluntario para leer
		 **********************************************************************/

		System.out.println("El/La afortunado/a en leer es: " + alumnos.get(alumnoRandom).getNombre());

		// otra forma

		for (int i = 0; i < alumnos.size(); i++) {
			if (alumnoRandom == i) {
				System.out.println("*** " + alumnos.get(i));
			} else {
				System.out.println(i + " " + alumnos.get(i).getNombre());
			}
		} // end for

	}

	public static ArrayList<Alumno> pintarResul(ArrayList<Alumno> alumnos) {
		Collections.sort(alumnos);
		for (int i = 0; i < alumnos.size(); i++) {
			
			System.out.println((i+1) + " " + alumnos.get(i).getNombre()+" "+ alumnos.get(i).getNumeroApariciones());		
		} // end for
		return alumnos;
	}
	
	

}
