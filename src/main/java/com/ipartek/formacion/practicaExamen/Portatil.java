package com.ipartek.formacion.practicaExamen;

public class Portatil extends Ordenador {
	public final int BATERIA_MAX =100;
	public final int BATERIA_MIN=20;
	
	private float tamanoPantalla;
	private int porcentajeBateria;
	public Portatil(String modelo, String marca, String placaBase, float cpu, int arquitectura, float tamanoPantalla, int porcentajeBateria) throws Exception {
		super(modelo, marca, placaBase, cpu, arquitectura);
		this.setTamanoPantalla(tamanoPantalla);
		this.setPorcentajeBateria(porcentajeBateria);
	}
	
	public float getTamanoPantalla() {
		return tamanoPantalla;
	}
	public int getPorcentajeBateria() {
		return porcentajeBateria;
	}
	public void setTamanoPantalla(float tamanoPantalla) {
		this.tamanoPantalla = tamanoPantalla;
	}
	public void setPorcentajeBateria(int porcentajeBateria) throws Exception {
		if(porcentajeBateria> BATERIA_MAX) {
			throw new Exception("No puedes tener mas del 100%");
		}else if (porcentajeBateria <= BATERIA_MIN) {
			throw new Exception("Bateria baja, ponlo a cargar que se muere o haz un push, ¡¡¡que se muere!!!");
		}
		this.porcentajeBateria = porcentajeBateria;
	}

	@Override
	public String toString() {
		return super.toString()+ "Portatil [tamanoPantalla=" + tamanoPantalla + ", porcentajeBateria=" + porcentajeBateria + "]";
	}
	
	
	
	
}
