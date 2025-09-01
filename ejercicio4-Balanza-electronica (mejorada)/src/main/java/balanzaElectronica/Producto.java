package balanzaElectronica;

public class Producto {
	private String descripcion;
	private double peso;
	private double precioPorKilo;
	
	public Producto(){}
	
	public Producto(String descripcion, double peso, double precioPorKilo) 
	{
		this.descripcion= descripcion;
		this.peso = peso;
		this.precioPorKilo = precioPorKilo;
	}
	
	
	public void setPrecioPorKilo(double  precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}

	public double getPrecio() 
	{
		return this.peso * this.precioPorKilo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getPeso() {
		return peso;
	}

	public double getPrecioPorKilo() {
		return precioPorKilo;
	}
	
}
