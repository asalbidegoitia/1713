package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	/*
	 * TODO
	 *
	 * aula cambiar array por arraylist de person
	 * 
	 * contador de cuantas veces ha salido cada persona que te pregunte si quieres
	 * volver a tirar
	 * 
	 * crear una app 
	 * 1- listar alumnos + ranking (cuantas veces ha salido cada uno)
	 * 2- crear alumno (nombre y edad por pantalla) 
	 * 3- eliminar alumno 
	 * 4- buscar voluntario (no puede salir el anterior)
	 * 
	 * 
	 * lo mas encapsulado posible (main con subprogramas) usar switch case para las
	 * opciones
	 */
	
	static final String OPCION_LISTAR="1";
	static final String OPCION_CREAR="2";
	static final String OPCION_ELIMINAR="3";
	static final String OPCION_VOLUNTARIO="4";
	static final String OPCION_SALIR="5";
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opcion = null;
		boolean repetir = true;
		Aula.CargarAlumnos();
		do {
			System.out.println("\nSelecciona una opción: ");
			GenerarMenu();
			try {
				opcion = sc.nextLine();
				System.out.println("Has elegido la opción: " + opcion);

				repetir = false;
			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println("Mensaje excepcion " + e.getMessage());
				System.out.println("Ha introducido datos sin el formato indicado");
				repetir = true;
			}
			
			switch (opcion) {
			case OPCION_LISTAR:
				System.out.println("Se listaran los alumnos: ");
				Aula.ListarAlumnos();
				break;
			case OPCION_CREAR:
				System.out.println("Escribe el nombre del alumno que se añadira: ");
				String alumnoCrear = sc.nextLine();
				System.out.println("Se eliminara el alumno: " + alumnoCrear);
				Aula.CrearAlumno(alumnoCrear);
				System.out.printf("El alumno se ha creado correctamente");
				break;
			case OPCION_ELIMINAR:
				System.out.println("Escribe el nombre del alumno que se eliminara: ");
				String alumnoEliminar = sc.nextLine();
				System.out.println("Se eliminara el alumno: " + alumnoEliminar);
				Aula.EliminarAlumno(alumnoEliminar);
				System.out.printf("El alumno se ha eliminado correctamente");
				break;
			case OPCION_VOLUNTARIO:
				Aula.BuscarVoluntario();
				break;
			}
		}while(opcion!=OPCION_SALIR);
		
		sc.close();
	}

	private static void GenerarMenu() {
		System.out.println(OPCION_LISTAR+" - Listar alumnos + Ranking");
		System.out.println(OPCION_CREAR+" - Crear alumno");
		System.out.println(OPCION_ELIMINAR+" - Eliminar alumno");
		System.out.println(OPCION_VOLUNTARIO+" - Buscar voluntario");
		System.out.println(OPCION_SALIR+" - Salir");

	}

}
