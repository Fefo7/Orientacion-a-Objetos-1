package io.github.unlp_oo.Ejercico13;

import java.util.*;

public class Portafolio {
	//private double montoTotal; // puede no ir?
	private List<Inversion> inversiones;
	
	public Portafolio () 
	{
		this.inversiones = new ArrayList<Inversion>();
	}
	

	public boolean Agregar(Inversion inversion) {
		// TODO Auto-generated method stub
		return this.inversiones.add(inversion);
	}
	
	public boolean Sacar(Inversion inversion) {
		
		return this.inversiones.removeIf(i-> i.equals(inversion));
	}
	
	public double CalcularMontosTotales() {
		// TODO Auto-generated method stub
		return this.inversiones.stream()
				.mapToDouble(inv-> inv.CalcularValorActual())
				.sum();
	}
	
	
	
	
	
}
