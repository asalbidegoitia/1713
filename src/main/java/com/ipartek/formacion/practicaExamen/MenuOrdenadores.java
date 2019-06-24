package com.ipartek.formacion.practicaExamen;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.formacion.Alumno;

public class MenuOrdenadores {
	static final int OPCION_LISTAR=1;
	static final int OPCION_CREAR=2;
	static final int OPCION_ELIMINAR=3;
	static final int OPCION_SALIR=4;
	private static final int OPCION_PORTATIL = 1;
	private static final int OPCION_SOBREMESA = 2;
	static Scanner sc;
	
	static String modelo="";
	static String marca="";
	static String placaBase="";
	static float cpu=0.0f;
	static int arquitectura=0;
	static float tamanoPantalla=0;
	static int porcentajeBateria=0;
	
	public static void main(String[] args) throws Exception {
		
		
		sc = new Scanner(System.in);
		int opcion = 0;
		
		do {
			System.out.println("\nSelecciona una opción: ");
			System.out.println("1- Listar");
			System.out.println("2- Crear");
			System.out.println("3- Borrar");
			System.out.println("3- Salir");
			
			try {
				opcion = Integer.parseInt(sc.nextLine().trim());			
			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println("Mensaje excepcion " + e.getMessage());
				System.out.println("Ha introducido datos sin el formato indicado");	
			}

			switch (opcion) {
			case OPCION_LISTAR:
				
				break;
			case OPCION_CREAR:				
				crearDispositivo();
				break;
			case OPCION_ELIMINAR:
						
				break;
			
			default:
			    System.out.println("Ha introducido datos sin el formato indicado o la opción no es valida");
			    break;
			}
		}while(opcion!=OPCION_SALIR);
		
		System.out.println("Se acaba la ejecución");
		sc.close();		
	}

	private static void crearDispositivo() throws Exception {
		
		int opcion = 0;
		System.out.println("\nSelecciona que quieres crear: ");
		System.out.println("1- Portatil");
		System.out.println("2- Ordenador de sobremesa");
		try {
			opcion = Integer.parseInt(sc.nextLine().trim());			
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Mensaje excepcion " + e.getMessage());
			System.out.println("Ha introducido datos sin el formato indicado");	
		}
		switch (opcion) {
		case OPCION_PORTATIL:
			crearPortatil();
			break;
		case OPCION_SOBREMESA:				
			crearOrdenador();
			break;
		
		default:
		    System.out.println("Ha introducido datos sin el formato indicado o la opción no es valida");
		    break;
		}
		
		
		
	}

	private static void crearOrdenador() {
		do {
			System.out.println("Introduce la marca ordenador de sobremesa que se añadira: ");
			modelo = sc.nextLine();	
		}while("".equals(modelo));
		
		do {
			System.out.println("Introduce el modelo del ordenador de sobremesa que se añadira: ");
			marca = sc.nextLine();
		}while("".equals(marca));
		
		do {
			System.out.println("Introduce la placa base del ordenador de sobremesa que se añadira: ");
			placaBase = sc.nextLine();
		}while("".equals(placaBase));
		
		do {
			System.out.println("Introduce la cpu del ordenador de sobremesa que se añadira: ");
			cpu = Float.parseFloat(sc.nextLine());
		}while(cpu == 0);
		
		do {
			System.out.println("Introduce la arquitectura del ordenador de sobremesa que se añadira: ");
			arquitectura = Integer.parseInt(sc.nextLine().trim());
		}while(arquitectura == 0);
		
		Ordenador sobremesa = new Ordenador(modelo, marca, placaBase, cpu, arquitectura);	
		System.out.println(sobremesa.toString());

	}

	private static void crearPortatil() throws Exception {
		do {
			System.out.println("Introduce la marca ordenador portatil que se añadira: ");
			modelo = sc.nextLine();	
		}while("".equals(modelo));
		
		do {
			System.out.println("Introduce el modelo del ordenador portatil que se añadira: ");
			marca = sc.nextLine();
		}while("".equals(marca));
		
		do {
			System.out.println("Introduce la placa base del ordenador portatil que se añadira: ");
			placaBase = sc.nextLine();
		}while("".equals(placaBase));
		
		do {
			System.out.println("Introduce la cpu del ordenador portatil que se añadira: ");
			cpu = Float.parseFloat(sc.nextLine());
		}while(cpu == 0);
		
		do {
			System.out.println("Introduce la arquitectura del ordenador portatil (32 o 64): ");
			arquitectura = Integer.parseInt(sc.nextLine().trim());
		}while(arquitectura == 0);
		
		do {
			System.out.println("Introduce el tamaño de pantalla del ordenador portatil que se añadira: ");
			tamanoPantalla = Float.parseFloat(sc.nextLine());
		}while(tamanoPantalla == 0);
		
		do {
			System.out.println("Introduce el porcentaje de bateria del ordenador portatil que se añadira: ");
			porcentajeBateria = Integer.parseInt(sc.nextLine().trim());
		}while(porcentajeBateria == 0);
		
		Portatil lp = new Portatil(modelo, marca, placaBase, cpu, arquitectura, tamanoPantalla, porcentajeBateria);	
		System.out.println(lp.toString());
	}

}
