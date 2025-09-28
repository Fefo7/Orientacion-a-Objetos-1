package Ejercicio11;

public class CajaDeAhorro extends Cuenta {
	private final int costoAdicional;

	
	public CajaDeAhorro() 
	{
		super();
		costoAdicional =2;
	}
	
	public void depositar(double monto) 
	{
		super.depositar(monto - ((monto/100)*costoAdicional));
	}
	
	public boolean extraer(double monto)
	{
		
		return super.extraer(monto + ((monto/100)*costoAdicional));
	}
	

	@Override
	protected boolean puedeExtraer(double monto) {
	
		return this.getSaldo() >= monto + (monto/100)*costoAdicional;
	}

}
