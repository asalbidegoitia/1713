package com.ipartek.formacion.practicaExamen;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PortatilTest {
	public final int BATERIA_MAX =100;
	public final int BATERIA_MIN=20;
	private final int X86=32;
	private final int X64=64;
	static Portatil p;
	
	String modelo = "Toshiba";
	String marca = "Satellite";
	String placaBase = "i5";
	float cpu = 40.5f;
	int arquitectura = X86;
	float tamanoPantalla= 17.5f;
	int porcentajeBateria = 100;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		p = new Portatil(modelo,marca,placaBase,cpu,arquitectura,tamanoPantalla,porcentajeBateria);
		p.setModelo(modelo);
		p.setMarca(marca);
		p.setPlacaBase(placaBase);
		p.setCpu(cpu);
		p.setArquitectura(arquitectura);
		p.setTamanoPantalla(tamanoPantalla);
		p.setPorcentajeBateria(porcentajeBateria);
	}

	@After
	public void tearDown() throws Exception {
		p=null;
	}

	@Test
	public void testGetTamanoPantalla() {
		assertEquals(17.5f,p.getTamanoPantalla(),0.001);
		
	}

	

	@Test
	public void testGetPorcentajeBateria() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTamanoPantalla()  {
		fail("Not yet implemented");
	}

	@Test  (expected = Exception.class)
	public void testSetPorcentajeBateria() throws Exception {
		p.setPorcentajeBateria(BATERIA_MAX);
		assertEquals(100,p.getPorcentajeBateria());
		
		p.setPorcentajeBateria(50);
		assertEquals(50,p.getPorcentajeBateria());
		
		p.setPorcentajeBateria(BATERIA_MIN);
	}

	@Test  (expected = Exception.class)
	public void testSetPorcentajeBateriaCero() throws Exception {
		p.setPorcentajeBateria(0);
	}
	
	@Test  (expected = Exception.class)
	public void testSetPorcentajeBateriaMayorMax() throws Exception {
		p.setPorcentajeBateria(BATERIA_MAX+10);
	}


	@Test
	public void testGetModelo() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMarca() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPlacaBase() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCpu() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetArquitectura() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetModelo() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetMarca() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPlacaBase() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCpu() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetArquitectura() {
		fail("Not yet implemented");
	}

}
