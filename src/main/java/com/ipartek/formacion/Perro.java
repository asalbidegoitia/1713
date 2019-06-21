package com.ipartek.formacion;

import java.io.Serializable;

public class Perro implements Serializable {
	private static final long serialVersionUID=1L;
	
	//atributos privados para encapsular
	private String nombre;
	private String raza;
	private int edad;
	private Boolean vacunado;
	
	//constructores
	public Perro() {
		super();
		nombre = "Sin Nombre";
		raza = "Cruce";
		edad = 0;
		vacunado = false;
	}

	public Perro(String nombre) {
		this();
		this.nombre = nombre;
	}



	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getEdad() {
		return edad;
	}
	/**
	 * Seteamos la edad del perro, en caso de ser < 0 ponemos un 0
	 * @param int edad: valor en años
	 * @throws Exception edad < 0
	 */
	public void setEdad(int edad) throws Exception {
		if (edad < 0) {
			//this.edad = 0;
			//throw new Exception("La edad debe ser mayor que cero");
			throw new PerroException(PerroException.ERROR_EDAD);
		}else {
			this.edad = edad;
		}
	}
	public Boolean isVacunado() {
		return vacunado;
	}
	public void setVacunado(Boolean vacunado) {
		this.vacunado = vacunado;
	}
	
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", vacunado=" + vacunado + "]";
	}
}
