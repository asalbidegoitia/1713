package com.ipartek.formacion.modelo;

import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.Alumno;

/**
 * Operaciones basicas de CRUD (Create, Read, Update, Delete) para Pojo (Plain Old Java Object)
 * Pojo Ej:Alumno, Person...
 * @author Curso
 *
 */
public interface IPersistible<P> {
	//operaciones basicas para persistir un objeto en base de datos
	/**
	 * listado de P
	 * @return List<P>, si no hay datos lista inicializada
	 */
	List<Alumno >getAll();
	
	/**
	 * Recupera P por su identificador
	 * @param id int identificador
	 * @return P, si no existe null
	 */
	Alumno getById(int id);
	
	/**
	 * Crea un nuevo registro
	 * @param pojo
	 * @return true si inserta, false en caso contrario
	 */
	boolean insert(P pojo);
	
	/**
	 * Elimina un nuevo registro
	 * @param id identificador
	 * @return true si inserta, false en caso contrario
	 */
	boolean delete(int id); //throws SQLException
	
	/**
	 * Modifica un nuevo registro
	 * @param pojo
	 * @return true si inserta, false en caso contrario
	 */
	boolean update(P pojo); //el pojo debe tener un id
}
