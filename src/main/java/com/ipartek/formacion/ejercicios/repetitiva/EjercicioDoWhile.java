package com.ipartek.formacion.ejercicios.repetitiva;

import java.util.Scanner;
/*
 * Mostrar los números desde 1 hasta N utilizando la estructura repetitiva do..while
 */
public class EjercicioDoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Introduzca un numero: ");
		n = sc.nextInt();
		sc.close();
		System.out.println("Numeros del 1 al " + n + ": ");
        int i = 1;
		do {
			System.out.println(i);
            i++;
        } while (i <= n);
			
	}
}
