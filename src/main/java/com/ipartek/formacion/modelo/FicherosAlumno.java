package com.ipartek.formacion.modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import com.ipartek.formacion.Alumno;
import com.ipartek.formacion.Person;

public class FicherosAlumno {

	public static void main(String[] args) throws Exception {
		String ficheroListadoAlumnos = "alumnos.txt";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ficheroListadoAlumnos));
		DAOAlumnoArrayList dao = DAOAlumnoArrayList.getInstance();
		dao.cargarAlumnos();
		for (Alumno alumno : dao.getAll()) {
			oos.writeObject(alumno);
			oos.flush();
		}

		// TODO leer objeto del fichero
		// @see http://www.chuidiang.org/java/ficheros/ObjetosFichero.php
		
		System.out.println("Leyendo Listado alumnos\n");

		try (
				// linea para leer el objeto
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ficheroListadoAlumnos));) {

			Object aux = ois.readObject();
			
			while (aux != null) {

				if (aux instanceof Alumno)
					System.out.println(aux); // Se escribe por pantalla el objeto
					aux = ois.readObject();
			}
			System.out.println("Terminamos de leer");
		}
		oos.close();
	}

}
