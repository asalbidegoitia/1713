package com.ipartek.formacion.modelo;

import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.Alumno;

/**
 * Clase de Ejemplo
 * El DAO se encargara de la conexion con la BD. Aun no tenemos BD asi que haremos con ArrayList
 * @author Curso
 *
 */
public class DAOAlumnoArrayList implements IPersistible<Alumno> { //lo casteamos a Alumno en vez de P
	private ArrayList<Alumno> lista; //lo inicializamos en el constructor
	
	public DAOAlumnoArrayList() {
		super();
		this.lista = new ArrayList<Alumno>();		
	}

	@Override
	public List<Alumno> getAll() {
		return lista;
	}

	@Override
	public Alumno getById(int id) {
		Alumno resul = null;
		for(Alumno alumno: lista) {
			if(alumno.getId()==id) {
				resul =alumno;
				break;
			}
		}
		return resul;
	}

	@Override
	public boolean insert(Alumno pojo) {
		return lista.add(pojo);
	}

	@Override
	public boolean delete(int id) {
		boolean eliminado= false;
		if(id != -1) {
			lista.remove(getById(id));
			eliminado= true;
		}else {
			eliminado =false;
		}
		return eliminado;	
	}

	@Override
	public boolean update(Alumno pojo) {
		// TODO Auto-generated method stub
		return false;
	}

	

	public ArrayList<Alumno> CargarAlumnos() {
		String[] losAlumnos = { "Ander", "Mounir", "Andoni", "Asier", "Jon C", "Arkaitz", "Aritz", "Manuel",
				"Eder I", "Eder S", "Gaizka", "Borja", "Verónica", "Jon A", "José Luis" };

		
		Alumno alumno;
		for (int i = 0; i < losAlumnos.length; i++) {
			//alumnos.add(new Alumno(losAlumnos[i]));
			alumno = new Alumno(losAlumnos[i]);
			alumno.setId(i+1);
			alumno.setNumeroApariciones(0);
			lista.add(alumno);	
		}
		return lista;
	}
	
	
}
