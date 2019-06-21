package com.ipartek.formacion.utilidades;

import com.ipartek.formacion.Perro;

public class EjercicioCalculadora {
	public static void main(String[] args) {
		
		//metodos de instancia u objeto
		Perro p = new Perro();
		p.toString();
		
		//metodos estaticos o de clase, el obligatorio que sean 'static'
		//static significa que se puede usar el metodo sin tener que declarar un parametro
		Math.random();
		Calculadora.sumar(2,3);
		
	}
}
