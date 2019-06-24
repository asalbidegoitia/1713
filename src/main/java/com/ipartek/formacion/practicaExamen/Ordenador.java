package com.ipartek.formacion.practicaExamen;

public class Ordenador {
	public final int X86=32;
	public final int X64=64;
	
	//atributos
	private String modelo;
	private String marca;
	private String placaBase;
	private float cpu;
	private int arquitectura;
	
	//contructora
	public Ordenador(String modelo, String marca, String placaBase, float cpu, int arquitectura) {
		super();
		this.setModelo(modelo);
		this.setMarca(marca);
		this.setPlacaBase(placaBase);
		this.setCpu(cpu);
		this.setArquitectura(arquitectura);
		/*
		this.modelo = modelo;
		this.marca = marca;
		this.placaBase = placaBase;
		this.cpu = cpu;
		this.arquitectura = arquitectura;
		*/
	}

	//getters y setters
	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public String getPlacaBase() {
		return placaBase;
	}

	public float getCpu() {
		return cpu;
	}

	public int getArquitectura() {
		return arquitectura;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setPlacaBase(String placaBase) {
		this.placaBase = placaBase;
	}

	public void setCpu(float cpu) {
		this.cpu = cpu;
	}

	public void setArquitectura(int arquitectura) {
		this.arquitectura = arquitectura;
	}

	//metodos
	@Override
	public String toString() {
		return "Ordenador [modelo=" + modelo + ", marca=" + marca + ", placaBase=" + placaBase + ", cpu=" + cpu
				+ ", arquitectura=" + arquitectura + "]";
	}
	
	
	
	
	
	

}
