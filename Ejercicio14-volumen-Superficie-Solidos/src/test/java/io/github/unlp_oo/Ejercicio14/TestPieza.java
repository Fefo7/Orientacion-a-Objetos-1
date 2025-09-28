package io.github.unlp_oo.Ejercicio14;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPieza {
	
	private ReporteConstruccion reporte;

	
	@BeforeEach
	void setUp() throws Exception {
		reporte = new ReporteConstruccion();
		reporte.agregarPieza(new Cilindro("Hierro", "Rojo", 4,4));
		reporte.agregarPieza(new Esfera("Hierro", "Rojo", 4));
		reporte.agregarPieza(new PrismaRectangular("Metal", "Verde", 6,4,2));
		
	}

	@Test
	void reportePorMaterial() {
		assertEquals(468.9, reporte.volumenDeMaterial("Hierro"));
	}
	@Test
	void reportePorColor()
	{
		assertEquals(468.9, reporte.superficieDeColor("Rojo"));
	}

}
