package com.ipartek.formacion.excepcion;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		System.out.println("Comienza programa");
		int numero = 0, numero2 = 0;
		boolean repetir = true;
		Scanner sc = new Scanner(System.in);
		
		// primer numero
		do {
			System.out.println("Por favor introduce el primer numero: ");
			try {
				String sNumero = sc.nextLine();
				numero = Integer.parseInt(sNumero);
				System.out.println("Su numero es " + numero);
				repetir= false;
			}catch (Exception e) {
				//e.printStackTrace();
				System.out.println("Mensaje excepcion " + e.getMessage());
				System.out.println("No has introducido un numero");
				repetir = true;
			}	
		}while(repetir);
		
		//segundo numero
		do {
			System.out.println("Por favor introduce el segundo numero: ");
			try {
				String sNumero2 = sc.nextLine();
				numero2 = Integer.parseInt(sNumero2);
				System.out.println("Su numero es " + numero2);
				repetir= false;
			}catch (Exception e) {
				//e.printStackTrace();
				System.out.println("Mensaje excepcion " + e.getMessage());
				System.out.println("No has introducido un numero");
				repetir = true;
			}	
		}while(repetir);

	
		
		int suma = numero + numero2;
		System.out.println("El resultado es la suma de "+numero+" + "+numero2+" : " + suma);
		System.out.println("Finaliza programa");

	}

}
