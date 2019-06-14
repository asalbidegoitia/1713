package com.ipartek.formacion.excepcion;

import com.ipartek.formacion.Perro;

public class PropagacionException {
	public static void main(String[] args) throws Exception {
		System.out.println("Comienza main");
		metodoA();
		System.out.println("Termina main");
	}
	
	private static void metodoA() throws Exception {
		System.out.println("Comienza metodoA");
		Perro p = new Perro();
		p.setEdad(-1);
		System.out.println(p);
		System.out.println("Termina metodoA");
	}

}
