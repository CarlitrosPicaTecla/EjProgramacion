package ej2;

public class Habitacion {

	private int tipo;
	private double precio;
	private int servicioExtra;
	private String Cliente;
	private int nDias;
	
	
	public Habitacion(int tipo, double precio, int servicioExtra, String cliente, int nDias) {
		super();
		this.tipo = tipo;
		this.precio = precio;
		this.servicioExtra = servicioExtra;
		Cliente = cliente;
		this.nDias = nDias;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getServicioExtra() {
		return servicioExtra;
	}


	public void setServicioExtra(int servicioExtra) {
		this.servicioExtra = servicioExtra;
	}


	public String getCliente() {
		return Cliente;
	}


	public void setCliente(String cliente) {
		Cliente = cliente;
	}


	public int getnDias() {
		return nDias;
	}


	public void setnDias(int nDias) {
		this.nDias = nDias;
	}
	
	
}
