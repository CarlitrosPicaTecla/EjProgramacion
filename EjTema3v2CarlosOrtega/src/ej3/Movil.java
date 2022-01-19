package ej3;

public class Movil {

	private String marca;
	private String modelo;
	private double precio;
	private boolean vendido;
	
	public Movil() {

	}
	
	public Movil(String marca, String modelo, double precio, boolean vendido) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.vendido = vendido;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public boolean isVendido() {
		return vendido;
	}


	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}
	
	
}
