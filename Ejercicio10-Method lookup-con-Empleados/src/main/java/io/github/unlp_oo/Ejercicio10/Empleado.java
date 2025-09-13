package io.github.unlp_oo.Ejercicio10;

public class Empleado {
 private String nombre;
 
 public Empleado(String nombre) 
 {
	 this.nombre =nombre;
 }
 
 public double MontoBasico() 
 {
	return 35000; 
 }
 
 public double Aportes() 
 {
	 return 13500;
 }
 
 public double sueldoBasico() 
 {
	 return this.MontoBasico() + this.Aportes();
 }
}
