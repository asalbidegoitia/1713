package com.ipartek.formacion;

import java.io.Serializable;

public class Person implements IAmigable,Serializable{

	//atributos
	private int id;
	private String nombre;
	private int edad;
	private float altura; //Ejemplo: 1.70 cm
	private float peso; //Ejemplo: 50.5 kg
	private String ojos; //color de ojos
	private char sexo; //'h' hombre, 'm' mujer, 'i' indefinido
	//char es solo un caracter, solo una letra
	
	
	//constructora
	public Person() {
		super(); //java.lang.object
		this.id=-1; //No lo ha recuperado de la BD
		this.nombre="Anonimo";
		this.edad= 18;
		this.altura = 0;
		this.peso = 0;
		this.ojos = "Marron";
		this.sexo= 'i';
	}
	
	public Person(String nombre, int edad, char sexo) {
		this();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public Person(String nombre) {
		this();
		this.nombre = nombre;
		
	}


	//getters y setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre == null) {
			this.nombre = "Sin Nombre";
		}else {
			this.nombre = nombre;
		}
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getOjos() {
		return ojos;
	}

	public void setOjos(String ojos) {
		this.ojos = ojos;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso
				+ ", ojos=" + ojos + ", sexo=" + sexo + "]";
	}


	public String saludar() {
		return "Hola me llamo " + getNombre();
		
	}

	@Override
	public String despedir() {
		// TODO Auto-generated method stub
		return "Agur benur";
	}

	


}
