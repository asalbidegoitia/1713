package com.ipartek.formacion.xml;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;

/**
 * Ejercicio para aprender a parsear y trabajar con XML
 * https://www.tutorialspoint.com/java_xml/java_dom_parse_document.htm
 * 
 * @author Curso
 *
 */
public class EstudiantesXML {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory =
				DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		//similar a String pero preparado para trabajar con String grandes o ficheros de texto
		StringBuilder xmlStringBuilder = new StringBuilder();
		
		//simbolo de escape \" para que el string no piense que esta cerrando el string, en un .xml se hace con CDATA
		xmlStringBuilder.append("<?xml version=\"1.0\"?> <perro class=\"rojo\"><nombre>Rataplan</nombre><edad>45</edad></perro>"); 
		//xmlStringBuilder.append("<?xml version=\"1.0\"?> <class> </class>"); 
		ByteArrayInputStream input = new ByteArrayInputStream(
		   xmlStringBuilder.toString().getBytes("UTF-8"));
		Document doc = builder.parse(input);
		
		Element elementPerro = doc.getDocumentElement();
		NodeList nodes = elementPerro.getChildNodes();
		
		String nombre= nodes.item(0).getTextContent();
		String edad= nodes.item(1).getTextContent();		
		
		String contenidoTextoCompleto= elementPerro.getTextContent();
		System.out.println("Sacamos del perro: "+contenidoTextoCompleto);

	}
}
