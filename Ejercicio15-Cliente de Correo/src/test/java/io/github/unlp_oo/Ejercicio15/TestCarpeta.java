package io.github.unlp_oo.Ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCarpeta {
	
	private Carpeta carpeta;
	private Carpeta destino;
	
	
	@BeforeEach
	public void setUp () throws Exception
	{
		Carpeta carpeta =new Carpeta("archivos1");
		carpeta.setEmail(new Email("hola mundo", "hola mundo"));
		carpeta.setEmail(new Email("", "hola mundo"));
		carpeta.setEmail(new Email("hola mundo", ""));
		
		Carpeta destino =new Carpeta("archivos4");
	}
	
	@Test
	public void testMoverCarpeta ()
	{
		Carpeta carpeta =new Carpeta("archivos1");
		Carpeta destino =new Carpeta("archivos4");
		carpeta.setEmail(new Email("hola mundo", "hola mundo"));
		carpeta.setEmail(new Email("", "hola mundo"));
		carpeta.setEmail(new Email("hola mundo", ""));
		carpeta.mover(new Email("hola mundo", "hola mundo"), destino);
		
		assertEquals(carpeta.getEmails().size(), 2);
		assertEquals(destino.getEmails().size(), 1);
	}
}
