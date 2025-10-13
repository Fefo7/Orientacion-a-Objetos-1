package io.github.unlp_oo.Ejercicio15;

import java.util.*;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	public Email(String titulo, String cuerpo) 
	{
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<Archivo>();
	}
	public String getTitulo() 
	{
		return this.titulo;
	}
	public String getCuerpo() 
	{
		return this.cuerpo;
	}
	public List<Archivo> adjuntos() 
	{
		return this.adjuntos;
	}
	
	
	public int ObtenerTamanio() 
	{
		return this.adjuntos.stream()
				.mapToInt(a-> a.tamanio())
				.sum();
	}
	
	public boolean ContieneTituloyCuerpo(String texto) 
	{
		return this.titulo.contains(texto) || this.cuerpo.contains(texto);
	}
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Email aux = (Email) obj;
	    return this.titulo.equals(aux.titulo) &&
	           this.cuerpo.equals(aux.cuerpo); 
	}
}
