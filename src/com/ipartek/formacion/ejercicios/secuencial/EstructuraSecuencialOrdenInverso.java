package com.ipartek.formacion.ejercicios.secuencial;

import java.util.Scanner;

public class EstructuraSecuencialOrdenInverso {
	/*
	 *
	 * N = 12345    La salida debe ser:
	 * 5
	 * 45
	 * 345
	 * 2345
	 * 12345
	 */
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N;
	        System.out.print("Introduzca valor de N: ");
	        N = sc.nextInt();  //supondremos que el número introducido tiene 5 cifras
	        System.out.println(N%10);
	        System.out.printf("%02d %n",N%100);
	        System.out.printf("%03d %n",N%1000);
	        System.out.printf("%04d %n",N%10000);
	        System.out.printf("%05d %n",N);
	    }
	

}
