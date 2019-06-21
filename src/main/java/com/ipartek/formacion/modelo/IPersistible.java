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
	List<Alumno >getAll();
	Alumno getById(int id);
	boolean insert(P Pojo);
	boolean delete(int id); //throws SQLException
	boolean update(P pojo); //el pojo debe tener un id
}
