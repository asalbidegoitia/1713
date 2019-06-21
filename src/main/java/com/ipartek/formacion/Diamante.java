package com.ipartek.formacion;

public class Diamante implements IOrdenable {
	private int kilates;
	private String color;

	public Diamante(int kilates, String color) {
		this.kilates=kilates;
		this.color=color;
	}

	@Override
	public int getValor() {
		
		return this.kilates;
	}

	public int getKilates() {
		return kilates;
	}

	public void setKilates(int kilates) {
		this.kilates = kilates;
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Diamante [kilates=" + kilates + ", color=" + color + "]";
	}

	
}
