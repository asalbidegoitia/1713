package com.ipartek.formacion.ejercicios.secuencial;

import java.util.Scanner;

public class EstructuraSecuencial {
	/*
	 *
	 * N = 12345    La salida debe ser:
	 * 1
	 * 12
	 * 123
	 * 1234
	 * 12345
	 */

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N;
	        System.out.print("Introduzca valor de N: ");
	        N = sc.nextInt(); //supondremos que el n�mero introducido tiene 5 cifras
	        System.out.println(N/10000);
	        System.out.println(N/1000);
	        System.out.println(N/100);
	        System.out.println(N/10);
	        System.out.println(N);
	    }
	
}
