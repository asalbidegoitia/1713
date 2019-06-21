package com.ipartek.formacion.ejercicios.repetitiva;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Introducir los valores de N y M por teclado. 
 * En este punto se debe comprobar que los valores introducidos por teclado para N y M sean v�lidos, 
 * en concreto se debe comprobar que los valores de N y M sean mayores que cero y adem�s que el valor de N sea menor que el de M.
 * Mediante un bucle for se mostrar�n los m�ltiplos de N entre 1 y M
 */
public class EjercicioMultiplos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = 0;
        int m = 0;
        Boolean salir=false;
        do {
        	System.out.print("Introduce un n�mero entero positivo: ");
        	try {
	            n = sc.nextInt(); 
        	}catch (InputMismatchException e) {
        		System.out.println("Error, no es numero");
        		salir = false;
        	}finally { //hacemos el next line porque sino no pilla el scanner otra vez y hace bucle infinito
        		sc.nextLine();
        	}
        	if(n<=0){
                System.out.println("Debe introducir un n�mero positivo");
                salir =false;
            }else {//has introducido un numero valido
            	salir = true;
            }
        }while (n<=0 && salir ==false);
        
        do {
            System.out.print("Introduce otro n�mero entero positivo mayor que " + n + ": ");
            m = sc.nextInt();
            if(m<=0){
                System.out.println("Debe introducir un n�mero positivo");
            }else if(n>=m){
                System.out.println("Debe introducir un n�mero mayor que " + n);
            }
        }while(m<=0 || n >=m);
        sc.close();
        
      //Mostrar los m�ltiplos de N desde 1 hasta M
        System.out.println("\nM�ltiplos de  " + n + " desde 1 hasta " + m + " : ");
        for (int i = 1; i <= m; i++) { //recorre hasta m (m incluido)
            if (i % n == 0) { //si el resto es 0 es multiplo
                System.out.println(i);
            }
        }
        
	}

}
