package io.github.unlp_oo.Ejercicio10;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente alan = new Gerente("Alan Turing");
		double aportesDeAlan = alan.aportes(); 
		
		Gerente alan2 = new Gerente("Alan Turing");
		double sueldoBasicoDeAlan = alan.sueldoBasico();
		System.out.println("Aportes de Alan: " + aportesDeAlan);
		System.out.println("sueldo basico de Alan: " + sueldoBasicoDeAlan);
		
	}

}
