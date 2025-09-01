package balanzaElectronica;
public class Balanza {

	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	//@Geters 
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	
	//@Method
	public void ponerEnCero() 
	{
		this.precioTotal = 0;
		this.cantidadDeProductos= 0;
		this.pesoTotal =0;
	}
	
	public void agregarProducto(Producto prod) 
	{
		if(prod!= null) 
		{
			this.pesoTotal+= prod.getPeso();
			this.precioTotal += prod.getPrecio();
			this.cantidadDeProductos ++;
		}
		
		
	}
	public Ticket emitirTicket ()
	{
		 
		return new Ticket(cantidadDeProductos,pesoTotal,precioTotal);
	}
}

