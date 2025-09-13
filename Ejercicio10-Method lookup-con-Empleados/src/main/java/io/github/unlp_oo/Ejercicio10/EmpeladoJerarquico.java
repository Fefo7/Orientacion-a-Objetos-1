package io.github.unlp_oo.Ejercicio10;

public class EmpeladoJerarquico extends Empleado {

	public EmpeladoJerarquico(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	public double sueldoBasico() 
	{
		return super.sueldoBasico() + this.bonoPorCategoria();
	}
	public double montoBasico() 
	{
		return 45000;
	}
	public double bonoPorCategoria() 
	{
		return 8000;
	}
	
}
