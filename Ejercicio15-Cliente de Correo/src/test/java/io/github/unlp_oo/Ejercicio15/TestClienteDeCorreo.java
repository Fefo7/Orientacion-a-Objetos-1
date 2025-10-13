package io.github.unlp_oo.Ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestClienteDeCorreo {
	private ClienteDeCorreo cliente;
	private ArrayList<Carpeta> carpetas;
	
	@BeforeEach
	public void setUp() throws Exception
	{
		
		this.carpetas = new ArrayList<Carpeta>();
		Carpeta c1 =new Carpeta("archivos1");
		c1.setEmail(new Email("hola mundo", "hola mundo"));
		c1.setEmail(new Email("", "hola mundo"));
		c1.setEmail(new Email("hola mundo", ""));
		this.carpetas.add(c1);
		this.cliente = new ClienteDeCorreo(carpetas);
		cliente.recibir(new Email("hola mundo", "hola mundo")); //inbox
	}
	
	@Test
	public void testBuscarTexto() 
	{
		Optional<Email> emailBuscar = cliente.buscar("hola mundo");
		assertEquals(emailBuscar.isPresent(),true);
		Optional<Email> emailBuscar2 = cliente.buscar("fede");
		assertEquals(emailBuscar2.isPresent(),false);
		
	}
	@Test
	public void testEspacioOcupado() 
	{
		Carpeta c1 =new Carpeta("archivos1");
		c1.setEmail(new Email("hola mundo", "hola mundo"));
		c1.setEmail(new Email("", "hola mundo"));
		c1.setEmail(new Email("hola mundo", ""));
		assertEquals(cliente.espacioOcupado(),c1.ObtenerTamanioCarpeta());
	}
	

	

}
