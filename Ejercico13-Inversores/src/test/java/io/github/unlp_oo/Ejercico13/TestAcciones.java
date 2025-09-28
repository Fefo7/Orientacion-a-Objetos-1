package io.github.unlp_oo.Ejercico13;
import static org.junit.jupiter.api.Assertions.*;


import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TestAcciones {

	private Portafolio portafolio;
	@BeforeEach
	void setUp() throws Exception {
		
		
		portafolio = new Portafolio();
		portafolio.Agregar(new PlazoFijo(LocalDate.of(2025, 9, 27), 1000, 30));
		portafolio.Agregar(new Accion("AAPL", 3,255.46));
		portafolio.Agregar(new Accion("GOOGL", 3,246.54));
	}
	
	@Test
	void montosActuales() 
	{
		assertEquals(2806,portafolio.CalcularMontosTotales());
	}
	@Test
	void sacarInversion() 
	{
		assertTrue(portafolio.Sacar(new PlazoFijo(LocalDate.of(2025, 9, 27), 1000, 30)));
		assertTrue(portafolio.Sacar(new Accion("AAPL", 3,255.46)));
		assertEquals(739.62,portafolio.CalcularMontosTotales());
		
	}
	
}
