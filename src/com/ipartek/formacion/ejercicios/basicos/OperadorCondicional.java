package com.ipartek.formacion.ejercicios.basicos;

public class OperadorCondicional {
	public static void main(String[] args) {
		int i = 8, j = 5, k;
		float x = 0.005F, y = -0.01F, z;
		char a, b = 'p', c = 'q';
		
		/*
		 * resultado = (condicion)?valor1:valor2;
		 * Si condicion es true entonces el resultado sera valor1, else valor2
		 */
		
		System.out.println(k = (j == 5) ? i : j);
		System.out.println(z = (x >= 0) ? x : 0);
		System.out.println(a = (b < 'c') ? b : c);
	}
}
