package ar.edu.unlp.info.oo1.Ejercicio8;

import java.time.LocalDate;

public class Mamifero  {
	
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero() {}
	public Mamifero(String nombre) {
		identificador = nombre;
	}
	
	//getters y setters
	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String id) {
		this.identificador = id;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Mamifero getPadre() {
		return padre;
	}

	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	public Mamifero getMadre() {
		return madre;
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	//@Comportamiento
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		
		if (this.getIdentificador() == unMamifero.getIdentificador()) {
	        return false;
	    }
		else 
		{
			return recorrerArbolGenialogico(unMamifero);
		}
		
	    
	}

	public Mamifero getAbueloMaterno() { return (madre != null && madre.getPadre() != null) ? madre.getPadre() : null; }
	public Mamifero getAbuelaMaterna() { return (madre != null && madre.getMadre() != null) ? madre.getMadre() : null; }
	public Mamifero getAbueloPaterno() { return (padre != null && padre.getPadre() != null) ? padre.getPadre() : null; }
	public Mamifero getAbuelaPaterna() { return (padre != null && padre.getMadre() != null) ? padre.getMadre() : null; }

	private boolean recorrerArbolGenialogico(Mamifero unMamifero) 
	{
		if (this.getIdentificador() == unMamifero.getIdentificador()) {
	        return true;
	    }
		boolean ramaPadre = (this.getPadre() != null) && this.getPadre().recorrerArbolGenialogico(unMamifero);
	    boolean ramaMadre = (this.getMadre() != null) && this.getMadre().recorrerArbolGenialogico(unMamifero);

	    return ramaPadre || ramaMadre;
	}
	
	
	

}
