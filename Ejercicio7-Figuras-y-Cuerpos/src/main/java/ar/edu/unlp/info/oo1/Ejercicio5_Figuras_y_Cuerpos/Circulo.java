package ar.edu.unlp.info.oo1.Ejercicio5_Figuras_y_Cuerpos;


public class Circulo extends Figura 
{
	private double radio;
	
	
	public Circulo() 
	{
		
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
		//necesito tener el radio para asegurarme que se van hacer
	}
	public double getDiametro() 
	{
		return this.radio *2;
	}
	public void setDiametro( double diametro) 
	{
		this.radio= diametro/2;
	}

	@Override
	public double getArea() {
		return Math.PI * (this.radio*this.radio);
	}

	@Override
	public double getPerimetro() {
		return Math.PI * this.getDiametro();
	}
		



	
	

	
	

}
