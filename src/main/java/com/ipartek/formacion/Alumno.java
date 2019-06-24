package com.ipartek.formacion;

import java.io.Serializable;

public class Alumno extends Person implements Comparable<Alumno>,Serializable{
	private int numeroApariciones;

	public Alumno(String nombre, int numeroApariciones) {
		super(nombre);
		this.numeroApariciones=0;
	}

	public Alumno(String nombre) {
		super(nombre);
		super.setId(-1);
		this.setNumeroApariciones(0);
	}
	//getters y setters
	public int getNumeroApariciones() {
		return numeroApariciones;
	}
	public void setNumeroApariciones(int numeroApariciones) {
		this.numeroApariciones = numeroApariciones;
	}

	@Override
	public String toString() {
		return super.toString()+"Alumno [numeroApariciones=" + numeroApariciones + "]";
	}
	
	@Override
	public int compareTo(Alumno o) {
		return o.numeroApariciones - this.numeroApariciones;
	}
	
	

}
