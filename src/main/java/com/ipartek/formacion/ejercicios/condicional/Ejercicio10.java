package com.ipartek.formacion.ejercicios.condicional;

import java.util.Scanner;

/*
 * Programa java que lea una variable entera mes y compruebe si el valor corresponde
 * a un mes de 30 días. Se debe comprobar que el valor introducido esté
 * comprendido entre 1 y 12
 */

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mes;
		System.out.println("Introduzca el numero de un mes: ");
		mes = sc.nextInt();
		sc.close();
		if (mes < 1 || mes > 12) {
			System.out.println("Mes incorrecto");
		} else {
			switch (mes) {
			case 1:
				System.out.printf("Enero");
				break;
			case 2:
				System.out.printf("Febrero");
				break;
			case 3:
				System.out.printf("Marzo");
				break;
			case 4:
				System.out.printf("Abril");
				break;
			case 5:
				System.out.printf("Mayo");
				break;
			case 6:
				System.out.printf("Junio");
				break;
			case 7:
				System.out.printf("Julio");
				break;
			case 8:
				System.out.printf("Agosto");
				break;
			case 9:
				System.out.printf("Septiembre");
				break;
			case 10:
				System.out.printf("Octubre");
				break;
			case 11:
				System.out.printf("Noviembre");
				break;
			case 12:
				System.out.printf("Diciembre");
				break;
			}
		}//end if
		 if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			 System.out.println(" tiene 30 dias");
		 }else if(mes ==2) {
			 System.out.println(" tiene 28 dias");
		 }else {
			 System.out.println(" tiene 31 dias");
		 }

	}

}
