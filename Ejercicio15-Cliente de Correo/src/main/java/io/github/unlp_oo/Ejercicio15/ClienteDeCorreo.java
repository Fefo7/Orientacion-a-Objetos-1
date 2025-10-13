package io.github.unlp_oo.Ejercicio15;

import java.util.*;

public class ClienteDeCorreo {

private Carpeta inbox;
private List<Carpeta> carpetas;

	public ClienteDeCorreo() 
	{
		this.inbox = new Carpeta("inbox");
		this.carpetas = new ArrayList<Carpeta>();
	}
	public ClienteDeCorreo (ArrayList<Carpeta> carpeta) 
	{
		this.inbox = new Carpeta("inbox");
		this.carpetas = carpeta;
	}
	public void recibir(Email email) 
	{
		this.inbox.setEmail(email);
		
	}	
	
	public Optional<Email> buscar(String texto) 
	{
		for (Carpeta c : this.carpetas) 
		{
			Optional<Email> resultado = c.obtenerEmail(texto); // consultar si puedo cambiar eso de la firma
			if (resultado.isPresent()) { // si contiene el dato
	            return resultado;
	        }	
		}
		return Optional.empty();
	}	
	public int espacioOcupado() 
	{
		return this.carpetas.stream()
				.mapToInt(c-> c.ObtenerTamanioCarpeta())
				.sum();
	}		
}
