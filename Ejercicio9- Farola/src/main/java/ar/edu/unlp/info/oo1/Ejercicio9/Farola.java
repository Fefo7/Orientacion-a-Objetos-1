package ar.edu.unlp.info.oo1.Ejercicio9;

import java.util.*;

public class Farola {

	private boolean isOn;
	private List<Farola> vecinos =new ArrayList<>();;
	public Farola() 
	{
		this.isOn = false;
		
	}
	
	public void pairWithNeighbor(Farola farola) 
	{
		this.vecinos.add(farola);
	    farola.vecinos.add(this);
	}
	
	public List<Farola> getNeighbors ()
	{
		return this.vecinos;
	}
	public void turnOn() 
	{
		if(!this.isOn) 
		{
			this.isOn = true;
			this.vecinos.stream().forEach(v -> v.isOn = true);
		}
		
	}
	public void turnOff() 
	{
		if(this.isOn) 
		{
			this.isOn = false;
			this.vecinos.stream().forEach(v -> v.isOn = false);
		}
		
	}
	
	public boolean isOn() 
	{
		
		return this.isOn;
	}
	public boolean isOff() 
	{ 
		
		return !this.isOn;
	}

}
