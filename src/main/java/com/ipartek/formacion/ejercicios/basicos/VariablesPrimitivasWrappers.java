package com.ipartek.formacion.ejercicios.basicos;

import java.util.Scanner;

/*
 * @author Curso
 * @see http://www.campus.formacion.ipartek.com/moodle/mod/page/view.php?id=882
 */

public class VariablesPrimitivasWrappers {
	public static void main(String[] args) {
		//declarar todas los posibles tipos variables primitivas
		
		//numeros enteros
		byte b = (byte)200;
		short s = 4;
		int i = 0;
		long l = 8;
		
		//numeros reales
		float f = 2.34f;
		double d = 4.56;
		
		char c = 'a'; //comillas simples
		boolean b1 = true; //or false
		
		//Wrappers
		
		int numeroParseado = Integer.parseInt("3");
		System.out.printf("El rango de un int %d %d \n \n \n", Integer.MIN_VALUE, Integer.MAX_VALUE);
		
		/*
		 * indicar si el caracter introducido por pantalla es 
		 * mayuscula o minuscula, letra o numero
		 */
		
		System.out.println("Por favor introduce un caracter: ");
		Scanner sc = new Scanner(System.in);
		char caracter = sc.next().charAt(0); 
		System.out.println("Has escrito " + caracter);
		sc.close();
		
		System.out.println(Character.isLetter(caracter) ? "Es letra" : "No es letra");
		System.out.println(Character.isDigit(caracter) ? "Es numero" : "No es numero");
		System.out.println(Character.isLowerCase(caracter) ? "Es minuscula" : "No es minuscula");
		System.out.println(Character.isUpperCase(caracter) ? "Es mayuscula" : "No es mayuscula");
		System.out.println(Character.isLetterOrDigit(caracter) ? "" : "**Es caracter especial");
		 
		System.out.println("\n \n \n");
		 
		//otra forma		
		if (Character.isLetter(caracter)) {
			System.out.println("El caracter es letra");
		}else if(Character.isUpperCase(caracter)) {
			System.out.println("El caracter es mayuscula");
		}else if(Character.isLowerCase(caracter)) {
			System.out.println("El caracter es minuscula");	
		}else if(Character.isDigit(caracter)){
			System.out.println("El caracter es numero");	
		}else if(!Character.isLetterOrDigit(caracter)) {
			System.out.println("El caracter es simbolo especial");
		}
		
		
		
		
		
		
		
		
	
	}

	
}
