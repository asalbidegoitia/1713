package com.ipartek.formacion;

import java.util.Random;

public class Aula {

	public static void main(String[] args) {
		/**********************************************************************
		 * // Declarar array con nombre alumnos
		 **********************************************************************/
		/*
		 * String[] alumnos = new String[14]; alumnos[0] = "Asier"; alumnos[1] = "Eder";
		 */

		String[] alumnos = { "Ander",
							 "Mounir",
							 "Andoni",
							 "Asier", 
							 "Jon C",
							 "Arkaitz", 
							 "Aritz",
							 "Manuel",
							 "Eduardo",
							 "Eder I",
							 "Eder S",
							 "Gaizka",
							 "Borja",
							 "Verónica",
							 "Jon A",
							 "José Luis"};

		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(i + " " + alumnos[i]);
		}

		/**********************************************************************
		 * //generar numero aleatorio
		 **********************************************************************/

		/*
		 * Random random = new Random(); int alumnoRandom =
		 * random.nextInt(alumnos.length);
		 */

		// otra forma (con el math random)
		int alumnoRandom = (int) (Math.random() * alumnos.length);

		/**********************************************************************
		 * //mostrar voluntario para leer
		 **********************************************************************/

		System.out.println("El/La afortunado/a en leer es: " + alumnos[alumnoRandom]);

		// otra forma
		/*
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnoRandom == i) {
				System.out.println("*** " + alumnos[i]);
			} else {
				System.out.println(i + " " + alumnos[i]);
			}
		} // end for
		*/
	}

}
