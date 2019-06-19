package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

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

	public static ArrayList<Alumno> CargarAlumnos() {
		String[] losAlumnos = { "Ander", "Mounir", "Andoni", "Asier", "Jon C", "Arkaitz", "Aritz", "Manuel", "Eduardo",
				"Eder I", "Eder S", "Gaizka", "Borja", "Verónica", "Jon A", "José Luis" };

		
		Alumno alumno;
		for (int i = 0; i < losAlumnos.length; i++) {
			//alumnos.add(new Alumno(losAlumnos[i]));
			alumno = new Alumno(losAlumnos[i]);
			alumno.setNumeroApariciones(0);
			alumnos.add(alumno);	
		}
		return alumnos;
	}

	public static ArrayList<Alumno> ListarAlumnos() {
		for (int i = 0; i < alumnos.size(); i++) {
			System.out.println((i+1) + " " + alumnos.get(i).getNombre()+" "+ alumnos.get(i).getNumeroApariciones());
			
		} // end for
		return alumnos;
	}
	
	public static void BuscarVoluntario() {
		int alumnoRandom = (int) (Math.random() * alumnos.size());
		alumnos.get(alumnoRandom).setNumeroApariciones(alumnos.get(alumnoRandom).getNumeroApariciones()+1);
		System.out.println("El/La afortunado/a en leer es: " + alumnos.get(alumnoRandom).getNombre());
	}

	public static void CrearAlumno(String alumnoCrear) {
		
		
		
	}

	public static void EliminarAlumno(String alumnoEliminar) {
		// TODO Auto-generated method stub
		//BuscarAlumno()
		
	}

}
