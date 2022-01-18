package ej1;

public class Producto {

	
	private String nombre;
	private double tasacion;
	private int codProducto;
	private double precioFabrica;
	private boolean fragil;
	
	
	
	public Producto(String nombre, double tasacion, int codProducto, double precioFabrica, boolean fragil) {
		this.nombre = nombre;
		this.tasacion = tasacion;
		this.codProducto = codProducto;
		this.precioFabrica = precioFabrica;
		this.fragil = fragil;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getTasacion() {
		return tasacion;
	}
	public void setTasacion(double tasacion) {
		this.tasacion = tasacion;
	}
	public int getCodProducto() {
		return codProducto;
	}
	public void setCodProducto(int codProducto) {
		this.codProducto = codProducto;
	}
	public double getPrecioFabrica() {
		return precioFabrica;
	}
	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}
	public boolean isFragil() {
		return fragil;
	}
	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}
	
	
	
}
