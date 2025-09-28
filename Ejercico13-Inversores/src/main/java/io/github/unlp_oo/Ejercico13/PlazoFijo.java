package io.github.unlp_oo.Ejercico13;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
	
	private LocalDate  fecha;
	private double montoDepositado;
	private double porcentajeInteres;
	
	public PlazoFijo (LocalDate fecha,double montoDepositado,double porcentajeInteres)
	{
		this.fecha = fecha;
		this.montoDepositado = montoDepositado;
		this.porcentajeInteres = porcentajeInteres;
	}
	
	

	@Override
	public double CalcularValorActual() {
		
		double montoPorcentaje= (this.montoDepositado /100.0) *porcentajeInteres;
		
		return this.montoDepositado +(montoPorcentaje*calcularDias(this.fecha)) ;
	}
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    PlazoFijo that = (PlazoFijo) obj;
	    return this.fecha.equals(that.fecha) &&
	           this.montoDepositado == that.montoDepositado &&
	           this.porcentajeInteres == that.porcentajeInteres;
	}

	
	private int calcularDias(LocalDate fecha) 
	{
		LocalDate fechaActual = LocalDate.now();
		return (int) ChronoUnit.DAYS.between(fecha, fechaActual);
	}

}
