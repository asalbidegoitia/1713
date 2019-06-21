package com.ipartek.formacion.ejercicios.basicos;

/*
 * @author Asier Salbidegoitia
 * @see http://puntocomnoesunlenguaje.blogspot.com/2012/10/java-ejercicios-iniciales-3.html
 */

public class Ejercicio8 {
	
	public static void main (String[] args) {
		/*
		 * Escribe un programa java que declare una variable A de tipo entero y asígnale un valor.
		 *  A continuación muestra un mensaje indicando si A es par o impar. 
		 *  Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
			Si por ejemplo A = 14 la salida será
			14 es par
			Si fuese por ejemplo A = 15 la salida será:
			15 es impar
		 */
		final String NOMBRE_EJERCICIO = "Ejercicio 8"; //constante
		System.out.println(NOMBRE_EJERCICIO);
		int a = 14;
		int b = 15;
		System.out.println( a + (a % 2 == 0 ? " Es par" : " Es impar"));
		String resultado = (b % 2 == 0) ? " Es par" : " Es impar";
		System.out.printf("El numero %s es %s \n", b, resultado);
		
		
		
		
		float numero = 4.1425936363f;	//la f al final castea a float, es equivalente a poner "(float)" delante
		float numero2 = (float)4.1425936363;
		float numero3 = 3;
		
		double numeroDouble = 4.1425936363;
		System.out.printf("Numero formateado con 2 decimales %.2f", numero);
		
	}
	

}
