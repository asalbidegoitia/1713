package com.ipartek.formacion.xml;

import org.w3c.dom.*;

import com.ipartek.formacion.Perro;

import javax.xml.parsers.*;
import java.io.*;

/**
 * Leer XML con listado de perros, guardar en ArrayList y mostrar por pantalla
 * 
 * @author Curso
 *
 */
public class LeerPerrosFromXML {
	public static void main(String[] args) {
		// parsear documento perros.xml

		try {
			File inputFile = new File(
					"C:\\1713\\eclipse-workspace\\1713\\src\\main\\java\\com\\ipartek\\formacion\\xml\\perros.xml");
			// crear factory
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			// crear builder
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();	
			// inicializa el documento 
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("perro");
			System.out.println("----------------------------");

			//TODO setearlo en perro y mostrarlo desde la clase
			Perro perro = new Perro();
			
			// recorrer document y rellenar ArrayList
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println("Perros : ");
					System.out.println("Nombre: " + eElement.getElementsByTagName("nombre").item(0).getTextContent());
					System.out.println("Raza: " + eElement.getElementsByTagName("raza").item(0).getTextContent());
					System.out.println("Edad: " + eElement.getElementsByTagName("edad").item(0).getTextContent());
					System.out
							.println("Vacuando: " + eElement.getElementsByTagName("vacunado").item(0).getTextContent());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
