package balanzaElectronica;
import java.util.ArrayList;
import java.util.List;

public class Balanza {

	//private int cantidadDeProductos;
	//private double precioTotal;
	//private double pesoTotal;
	private List<Producto> productos =  new ArrayList<>();
	
	/*@Geters 
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	public List<Producto> getProductos()
	{
		return this.productos;
	}
	*/
	//@Method
	//¿Que cambio produce este nuevo requerimiento en la implementación del mensaje ponerEnCero() ?
	// Ahora no necesitamos establecer las variables en 0, solo con poner la lista en null bastaria 
	
	public void ponerEnCero() 
	{
	  this.productos = null;
	}
	
	//
	public void agregarProducto(Producto prod) 
	{
		/*if(prod!= null) 
		{
			this.pesoTotal+= prod.getPeso();
			this.precioTotal += prod.getPrecio();
			this.cantidadDeProductos ++;
		}
		podemos calcular el total en el interfaz de usuario
		*/
		this.productos.add(prod);
		
	}
	public Ticket emitirTicket ()
	{
		double pesoTotal=0;
		double precioTotal=0;
		//return new Ticket(cantidadDeProductos,pesoTotal,precioTotal);
		for (Producto i : this.productos) 
		{
			pesoTotal+= i.getPeso();
			precioTotal += i.getPrecio();
		}
		return new Ticket(this.productos.size(),pesoTotal, precioTotal);
	}
}

