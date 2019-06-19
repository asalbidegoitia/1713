package com.ipartek.formacion;

public abstract class ObjetoGrafico { //debe ser abstract porque tiene al menos una clase abstracta
	//atributos
	
	//constructora
	
	//getters y setters
	
	//metodos
	public void mover(int x, int y) {
		System.out.println("Movemos el objeto a su nueva posicion");
	}
	
	public abstract void dibujar(String color); //prototipo

}
