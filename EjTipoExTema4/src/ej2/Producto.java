package ej2;

public abstract class Producto {

	private String nombre;
	private double precioBase;
	private int cant;
	private boolean estado;
	
	public Producto(String nombre, double precioBase, int cant, boolean estado) {
		super();
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.cant = cant;
		this.setEstado(estado);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}
	
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
		
	
	public abstract double calculalPvp(double porc);


		
	
	
}
