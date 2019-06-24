package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.formacion.modelo.DAOAlumnoArrayList;

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
	
	static String ULTIMO_VOLUNTARIO= "";
	
	static DAOAlumnoArrayList dao;
	static ArrayList<Alumno> alumnos;
	static Alumno alumno;
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		dao = DAOAlumnoArrayList.getInstance(); //accedemos a traves de la clase porque es estatico
		//dao = new DAOAlumnoArrayList(); //ya no podemos hacerlo porque hemos hecho el DAO Singleton
		String opcion = null;
		dao.cargarAlumnos();
		do {
			System.out.println("\nSelecciona una opción: ");
			GenerarMenu();
			try {
				opcion = sc.nextLine();
				
				
			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println("Mensaje excepcion " + e.getMessage());
				System.out.println("Ha introducido datos sin el formato indicado");	
			}

			switch (opcion) {
			case OPCION_LISTAR:
				System.out.println("Se listaran los alumnos: ");
				alumnos =(ArrayList<Alumno>) dao.getAll();
				dao.pintarResul(alumnos);
				break;
			case OPCION_CREAR:				
				crearAlumno();
				break;
			case OPCION_ELIMINAR:
				eliminarAlumno(alumno);			
				break;
			case OPCION_VOLUNTARIO:
				buscarVoluntario();
				break;
			default:
			    System.out.println("Ha introducido datos sin el formato indicado o la opción no es valida");
			    break;
			}
		}while(!opcion.equals(OPCION_SALIR));
		
		System.out.println("Se acaba la ejecución");
		sc.close();
	}

	private static void GenerarMenu() {
		System.out.println("---------------------------------------------------------");
		System.out.println(OPCION_LISTAR+" - Listar alumnos + Ranking");
		System.out.println(OPCION_CREAR+" - Crear alumno");
		System.out.println(OPCION_ELIMINAR+" - Eliminar alumno");
		System.out.println(OPCION_VOLUNTARIO+" - Buscar voluntario");
		System.out.println(OPCION_SALIR+" - Salir");
		System.out.println("---------------------------------------------------------");
		System.out.println("Introduce tu opción: ");

	}
	
	public static void crearAlumno() {
		String nombre;
		do {
			System.out.println("Escribe el nombre del alumno que se añadira: ");
			nombre = sc.nextLine();
			System.out.println("Se creara el alumno: " + nombre);
			
		}while("".equals(nombre));
		alumno= new Alumno(nombre);
		alumno.setId(dao.getAll().size()+1);
		//alumno.setNombre(nombre); //no hace falta porque lo pide el constructor
		dao.insert(alumno);
		System.out.printf("El alumno se ha creado correctamente");
	}

	public static void eliminarAlumno(Alumno alumno) {
		String nombre;
		int id=-1;
		do {
			System.out.println("Escribe el nombre del alumno que se eliminara: ");
			nombre = sc.nextLine().trim();
			System.out.println("Se procedera a eliminar el alumno: " + nombre);
			
		}while("".equals(nombre)); //para que lo pida mientras no pongas nada
				
		for(Alumno a: dao.getAll()) {
			if(nombre.equalsIgnoreCase(a.getNombre())) {
				id=a.getId();
				break;
			}
		}
			
		if(dao.delete(id)) {
			System.out.printf("El alumno "+nombre+" se ha eliminado correctamente");
		}else {
			System.out.println("No se ha encontrado el alumno "+nombre);
		}
		
	}
	
	public static void buscarVoluntario() {
		int alumnoRandom= 0;
		do {
			alumnoRandom = (int) (Math.random() * dao.getAll().size());
			dao.getAll().get(alumnoRandom).setNumeroApariciones(dao.getAll().get(alumnoRandom).getNumeroApariciones()+1);
		}while(ULTIMO_VOLUNTARIO.equals(dao.getAll().get(alumnoRandom).getNombre()));	
		
		ULTIMO_VOLUNTARIO=dao.getAll().get(alumnoRandom).getNombre();
		System.out.println("El/La afortunado/a en leer es: " + dao.getAll().get(alumnoRandom).getNombre());
	}
}
