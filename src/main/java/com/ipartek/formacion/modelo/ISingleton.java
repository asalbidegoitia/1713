package com.ipartek.formacion.modelo;

/**
 * Interfaz para obligar a usar el patron Singleton
 * @author Curso
 * @param <C> Clase
 */
public interface ISingleton<C> { //C de clase
	C getInstance();
}
