package io.github.unlp_oo.Ejercicio17;

import java.time.LocalDate;


public class DateLapse implements IDateLapse {
	private LocalDate from;
	private int sizeInDays;
	public DateLapse (LocalDate from,int sizeInDays) 
	{
		this.from = from;
		this.sizeInDays = sizeInDays;
	}
	
	public LocalDate getFrom() {return this.getFrom();}
	//“Retorna la fecha de inicio del rango”

	public LocalDate getTo() 
	{
		return this.from.plusDays(this.sizeInDays);
	}
	//“Retorna la fecha de fin del rango”

	public int sizeInDays() 
	{ 
		return this.sizeInDays;
	}
	//“retorna la cantidad de días entre la fecha 'from' y la fecha 'to'”

	public boolean includesDate(LocalDate other) 
	{
		LocalDate aux = this.from.plusDays(this.sizeInDays);
		return !from.isAfter(other) && !aux.isBefore(other);
	}
	//“recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to del receptor y false en caso contrario”.

}
