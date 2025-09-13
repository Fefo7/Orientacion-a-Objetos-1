package io.github.unlp_oo.Ejercicio10;

public class Gerente extends EmpeladoJerarquico {
	
	public double aportes() 
	{
		return this.montoBasico()*0.05d;
	}
	public double montoBasico() 
	{
		return 57000;
	}
}
