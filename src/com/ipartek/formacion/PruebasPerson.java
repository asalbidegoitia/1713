package com.ipartek.formacion;

import java.text.DecimalFormat;

public class PruebasPerson {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.toString());
		
		Person p2 = new Person("Pepe", 23, 'h');
		System.out.println(p2);
		
		Employee e =new Employee();
		System.out.println(e);
		
		Employee e2 =new Employee("Manolito", 44, 'h',1.200f);
		System.out.println(e2);
		
		//crear 3 personas famosas de Youtube
		Employee y1= new Employee("LoganPaul",23,'h',14500000f);
		Employee y2= new Employee("PewDiePie",23,'h',15500000f);
		Employee y3= new Employee("Jacksepticeye",23,'h',16000000f);
		
		//inicializar array con 3 posiciones
		Employee[] youtubers = new Employee[3];
		//rellenar array
		youtubers[0] = y1;
		youtubers[1] = y2;
		youtubers[2] = y3;
		
		System.out.println("-------------------------------------------------");
		System.out.println("------------------TOP YOUTUBE--------------------");
		System.out.println("-------------------------------------------------");
		
		Employee emp = null;
		DecimalFormat df = new DecimalFormat("#,###.##");
		for (int i = 0; i < youtubers.length; i++) {
			//posicion array, nombre, salario
			// 1, Logan, 14.500.000
			emp = youtubers[i];
			System.out.println((i+1)+" "+emp.getNombre()+" "+df.format(emp.getSalario()));
		}
		
		//lo mismo hecho con for each
		int i = 0;
		for(Employee empleado: youtubers) {
			System.out.println((i+1)+" "+empleado.getNombre()+" "+df.format(empleado.getSalario()));
			i++;
		}
	}

}
