package ar.edu.unlp.info.oo1.Ejercicio5_Figuras_y_Cuerpos;


public class Circulo extends Figura 
{
	private double radio;
	private double diametro;
	
	public Circulo() 
	{
		
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
		this.setDiametro(); 
		//necesito tener el radio para asegurarme que se van hacer
		super.setArea(this.getArea());
		super.setPerimetro(this.getPerimetro());
	}
	public double getDiametro() 
	{
		return this.diametro;
	}
	public void setDiametro() 
	{
		this.diametro=this.radio *2;
	}

	@Override
	public double getArea() {
		return Math.PI * (this.radio*this.radio);
	}

	@Override
	public double getPerimetro() {
		return Math.PI * this.diametro;
	}
		



	
	

	
	

}
