package balanzaElectronica;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Ticket {
	private final double IVA = 0.21;
	private  LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	private List<Producto> productos= new ArrayList<>();
	
	public Ticket(int cantidadprod, double pesototal, double preciototal) 
	{
		this.fecha = LocalDate.now();
		this.pesoTotal = pesototal;
		this.precioTotal = preciototal;
		this.cantidadDeProductos = cantidadprod;
	}
	
	public List<Producto> getProductos()
	{
		return tis.productos();
	}
	
	public LocalDate getFecha() {
		return fecha;
	}



	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}



	public double getPesoTotal() {
		return pesoTotal;
	}



	public double getPrecioTotal() {
		return precioTotal;
	}



	public double impuesto() 
	{
		
		return (IVA*getPrecioTotal()) ;
	}
	
}
	
