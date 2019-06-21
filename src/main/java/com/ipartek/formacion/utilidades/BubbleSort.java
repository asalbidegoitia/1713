package com.ipartek.formacion.utilidades;

public class BubbleSort {
	//atributos
	
	/**
	 * Metodo de ordenacion por burbuja que revisando cada elemento de la lista que va a ser ordenada con el siguiente,
	 * intercambiándolos de posición si están en el orden equivocado. Repite hasta que toda la lista este ordenada.
	 * @param lista int[] lista desordenada
	 * @throws Exception si lista == null
	 * @return devuelve la lista ordenada de menor a mayor
	 */
	public static int[] bubbleSort(int[] lista) throws Exception {
		if(lista==null) {
			throw new Exception("No puede ser null");
		}
		int aux;
		for (int i = 0; i < lista.length; i++) {
			for (int j = 1; j < lista.length; j++) {
				if(lista[j-1]>lista[j]) {
					//swap elements
					aux= lista[j-1];
					lista[j-1]=lista[j];
					lista[j]= aux;
				}
			}		
		}
		return lista;
		
	}

}
