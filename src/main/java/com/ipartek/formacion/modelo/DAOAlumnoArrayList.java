package com.ipartek.formacion.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ipartek.formacion.Alumno;

/**
 * Clase de Ejemplo
 * El DAO se encargara de la conexion con la BD. Aun no tenemos BD asi que haremos con ArrayList
 * @author Curso
 *
 */
public class DAOAlumnoArrayList implements IPersistible<Alumno> { //lo casteamos a Alumno en vez de P
	
	private static DAOAlumnoArrayList INSTANCE;
	private ArrayList<Alumno> lista; //lo inicializamos en el constructor
	
	/**
	 * Encargado de devolver solo 1 objeto, patron Singleton
	 * @return
	 */
	public static DAOAlumnoArrayList getInstance() {
		if(INSTANCE==null) {
			INSTANCE = new DAOAlumnoArrayList();
		}
		return INSTANCE;
		
	}
	
	/**
	 * Privado para que nadie pueda crear objetos (Singleton)
	 */
	private DAOAlumnoArrayList() {
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
		boolean resul= false;
		if(pojo!=null) {
			resul= lista.add(pojo);
		}
		return resul;
	}

	@Override
	public boolean delete(int id) {
		Alumno alumno = getById(id);
		return lista.remove(alumno);
		/*
		boolean resul= false;
		if(id != -1) {
			lista.remove(getById(id));
			resul= true;
		}else {
			resul =false;
		}
		return resul;	
		*/
	}

	@Override
	public boolean update(Alumno pojo) {
		boolean resul = false;
		if(pojo != null) {
			for(Alumno alumno:lista) {
				if(alumno.getId()== pojo.getId()) {
					//modificar
					int pos = lista.indexOf(alumno);
					lista.set(pos,pojo);
					resul =true;
					break;
				}
			}
		}
		return resul;
	}

	

	public ArrayList<Alumno> cargarAlumnos() {
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
	
	
	public ArrayList<Alumno> pintarResul(ArrayList<Alumno> alumnos) {
		Collections.sort(alumnos);
		for (int i = 0; i < alumnos.size(); i++) {
			
			System.out.println((i+1) + " " + alumnos.get(i).getNombre()+" "+ alumnos.get(i).getNumeroApariciones());		
		} // end for
		return alumnos;
	}
	
	
}
