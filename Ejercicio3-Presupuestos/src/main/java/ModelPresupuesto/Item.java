package ModelPresupuesto;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	
	public Item (String detalle,  int cantidad, double costo ) 
	{
		this.detalle = detalle; 
		this.cantidad = cantidad;
		this.costoUnitario = costo;
	}
	
	
	
	public String getDetalle() {
		return this.detalle;
	}



	public double getCostoUnitario() {
		return this.costoUnitario;
	}



	public double costo() 
	{
		return costoUnitario * cantidad;
	}
	
	
}
