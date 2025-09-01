package ModelPresupuesto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items = new ArrayList<>();
	public Presupuesto(String cliente) 
	{
		this.cliente = cliente;
		this.fecha = LocalDate.now();
	}
	
	
	public LocalDate getFecha() {
		return fecha;
	}


	public String getCliente() {
		return cliente;
	}


	public void agregarItem(Item item) 
	{
		items.add(item);
	}
	
	public double calcularTotal() 
	{
		int total = 0;
		if(items != null) 
		{
			for(Item i :items) 
			{
				total += i.costo();
			}
		}
		return total;
	}
	
}
