package ar.edu.unlp.info.oo1.Ejercicio5_Figuras_y_Cuerpos;

public abstract class  Figura {
	private double perimetro;
	private double area;
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public abstract double getArea();
	public abstract double getPerimetro();
	
}
