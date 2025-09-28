package io.github.unlp_oo.Ejercicio14;

import java.util.*;

public class ReporteConstruccion {

	List<Pieza> piezas;
	public ReporteConstruccion() 
	{
		this.piezas = new ArrayList<Pieza>();
	}
	
	public void agregarPieza(Pieza p) {
	    this.piezas.add(p);
	}

	
	public double volumenDeMaterial(String nombreDeMaterial ) 
	{
		 return this.piezas.stream()
		        .filter(p -> p.getMaterial().equals(nombreDeMaterial))
		        .mapToDouble(p->p.volumen())
		        .sum();
	}
	
	public double superficieDeColor(String unNombreDeColor)
	{
		return this.piezas.stream()
				.filter(p->p.getColor().equals(unNombreDeColor))
				.mapToDouble(p-> p.superficie())
				.sum();
	}

	
	
}
