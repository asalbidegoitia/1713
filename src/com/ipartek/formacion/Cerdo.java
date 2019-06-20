package com.ipartek.formacion;

public class Cerdo implements IOrdenable {
	private int kilos;
	private String nombre;

	public Cerdo(int kilos, String nombre) {
		this.kilos=kilos;
		this.nombre=nombre;
	}

	public int getKilos() {
		return kilos;
	}

	public void setKilos(int kilos) {
		this.kilos = kilos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getValor() {
		return this.kilos;
	}

	@Override
	public String toString() {
		return "Cerdo [kilos=" + kilos + ", nombre=" + nombre + "]";
	}
	
	
	
}
