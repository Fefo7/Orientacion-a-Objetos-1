package io.github.unlp_oo.Ejercicio15;

import java.util.*;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) 
	{
		this.nombre = nombre;
		this.emails = new ArrayList<Email>();
	}
	
	public List<Email> getEmails()
	{
		return this.emails;
	}
	
	public void setEmail(Email email) 
	{
		this.emails.add(email);
	}
	
	public String getNombre() 
	{
		return this.nombre;
	}
	
	public void mover(Email email, Carpeta destino) 
	{
		this.emails.remove(email); // tengo que sobre escribir el equals?
		destino.setEmail(email);
	}
	
	public Optional<Email> obtenerEmail(String text) 
	{
		
		return emails.stream()
					 .filter(e-> e.ContieneTituloyCuerpo(text))
					 .findAny();

	}
	public int ObtenerTamanioCarpeta() 
	{
		return this.emails.stream()
				.mapToInt(p-> p.ObtenerTamanio())
				.sum();
	}
	
}
