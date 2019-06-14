package com.ipartek.formacion.excepcion;

import com.ipartek.formacion.Perro;
import com.ipartek.formacion.PerroException;

/*
 * Se pueden capturar mas de un tipo de Excepciones
 * Siempre la ultima en capturar que sea Exception, que es la mas generica
 * @author curso
 */
public class CapturarTiposExcepciones {
	public static void main(String[] args) {
		try {
			
			//para provocar la excepcion de arrayindexoutofbounds
			int [] array = new int[20];
	        array[-3] = 24;	
	        
			//Perro p = null;
			Perro p = new Perro();
			p.setEdad(-1);
			p.toString();
			System.out.println(p);
			
			
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Se ha salido fuera del array Null");
		}catch (PerroException e) {
			System.out.println("PerroException Null");
		}catch (NullPointerException e) {
			System.out.println("Excepcion Null");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Excepcion generica, siempre la ultima");
			e.printStackTrace();
		}
	}

}
