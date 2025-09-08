package ar.edu.unlp.info.oo1.Ejercicio5_Figuras_y_Cuerpos;

public class Cuadrado implemnts Figura {
	private double Lado;

	

	public double getLado() {
		return Lado;
	}

	public void setLado(double lado) {
		Lado = lado;
	}

	@Override
	public double getArea() {
		
		return this.Lado*this.Lado ;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return this.Lado*4;
	}
	
}
