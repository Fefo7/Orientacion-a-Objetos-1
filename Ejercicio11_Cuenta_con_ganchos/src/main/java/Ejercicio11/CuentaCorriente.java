package Ejercicio11;

public class CuentaCorriente extends Cuenta {
	private double descubierto;
	
	public CuentaCorriente() 
	{
		descubierto =0;
	}
	
	
	public double getLimiteDescubierto() {
		return descubierto;
	}


	public void setLimiteDescubierto(double limiteDescubierto) {
		this.descubierto = limiteDescubierto;
	}	
	
	@Override
	protected boolean puedeExtraer(double monto) {
		
		return dentroDescubierto(monto);
	}
	
	
	private boolean dentroDescubierto(double monto) // evito romper el encapsulamiento ?
	{
		return (this.getSaldo()-monto >= this.descubierto); 
	}


	
	
}
