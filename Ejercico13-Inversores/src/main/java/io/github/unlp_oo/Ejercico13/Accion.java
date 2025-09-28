package io.github.unlp_oo.Ejercico13;

public class Accion implements Inversion {
	private String nombre;
	private int cantidadAcciones;
	private double valorUnitario;
	
	public Accion(String nombre,int cantidadAcciones,double valorUnitario) 
	{
		this.nombre = nombre;
		this.cantidadAcciones = cantidadAcciones;
		this.valorUnitario = valorUnitario;
	}
	
	@Override
	public double CalcularValorActual() {
		
		return this.valorUnitario * this.cantidadAcciones;
	}
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Accion that = (Accion) obj;
	    return this.nombre == that.nombre && this.cantidadAcciones == that.cantidadAcciones && this.valorUnitario == that.valorUnitario;
	}
}
