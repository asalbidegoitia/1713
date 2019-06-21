package com.ipartek.formacion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class YoutubeTest {
	
	Youtube youtube;
	static final String TITULO="video1";
	static final String CODIGO="123456";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		youtube = new Youtube(TITULO, CODIGO);
	}

	@After
	public void tearDown() throws Exception {
		youtube=null;
	}

	@Test (expected = Exception.class)
	public void testYoutube() throws Exception {
		assertEquals( TITULO, youtube.getTitulo());
		assertEquals( CODIGO, youtube.getCodigo());
		assertEquals( 0, youtube.getReproducciones());
		
		try {
			youtube= new Youtube(null, null);
			fail("Constructo con NULLS");
		}catch (Exception e) {
			assertTrue(true);
		}
		
		//prueba constructor con codigo incorrecto para que falle
		try {
			youtube= new Youtube(TITULO, "11");
			fail("Codigo <> 11");
		}catch (Exception e) {
			assertTrue(true);
		}
		
		//prueba constructor con titulo incorrecto para que falle
		try {
			youtube= new Youtube(" ", CODIGO);
			fail("Titulo incorrecto");
		}catch (Exception e) {
			assertTrue(true);
		}
	}

	@Test
	public void testGetTitulo() {
		assertEquals(TITULO, youtube.getTitulo());
	}

	@Test (expected = Exception.class)
	public void testSetTitulo() throws Exception {
		//TODO probar los 6 casos
		/*(null, titulo < longitud maxima, titulo > longitud maxima, titulo correcto,
		 *  titulo = longitud maxima, titulo = longitud minima
		*/
		
		youtube.setTitulo(null);
		assertEquals( null, youtube.getTitulo());	
		
		youtube.setTitulo("algo");
		assertEquals( "algo", youtube.getTitulo());		
			
	}

	@Test 
	public void testGetCodigo() {
		assertEquals(CODIGO, youtube.getCodigo());
	}

	@Test (expected = Exception.class)
	public void testSetCodigo() throws Exception{
		fail("Not yet implemented");
	}

	@Test
	public void testGetReproducciones() {
		assertEquals(0, youtube.getReproducciones());
	}

	@Test (expected = Exception.class)
	public void testSetReproducciones() throws Exception {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUrl() {
		fail("Not yet implemented");
	}

}
