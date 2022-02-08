package ej4;

public abstract class Producto {
	
	private int id;
	private double precioU;
	private String nombre;
	
	
	public Producto(int id, double precioU, String nombre) {
		super();
		this.id = id;
		this.precioU = precioU;
		this.nombre = nombre;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getPrecioU() {
		return precioU;
	}


	public void setPrecioU(double precioU) {
		this.precioU = precioU;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract double calcularPrecioFinal(double descuento);
	
}
