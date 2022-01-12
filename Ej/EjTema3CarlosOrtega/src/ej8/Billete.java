package ej8;

public class Billete {

	private int numero;
	private double precio;
	
	
	public Billete() {

	}
	public Billete(int numero, double precio) {
		super();
		this.numero = numero;
		this.precio = precio;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
