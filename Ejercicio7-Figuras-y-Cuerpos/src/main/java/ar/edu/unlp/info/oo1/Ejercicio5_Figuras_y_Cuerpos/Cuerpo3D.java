package ar.edu.unlp.info.oo1.Ejercicio5_Figuras_y_Cuerpos;

public class Cuerpo3D {
	private double altura;
	private Figura caraBasal;
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getVolumen() {
		return caraBasal.getArea()*this.altura;
	}
	public double getSuperficieExterior() {
		return 2* caraBasal.getArea() + caraBasal.getPerimetro()*this.altura; 
	}
	public void setCaraBasal(Figura caraBascal) {
		this.caraBasal = caraBascal;
	}
	
	
	

}
