package ej1;

public class Deposito {

	private int id;
	private double altura;
	private double radio;
	private double precio;
	
	
	public Deposito() {
	}
	public Deposito(int id, double altura, double radio, double precio) {
		this.id = id;
		this.altura = altura;
		this.radio = radio;
		this.precio = precio;
	}
	
	
	public int getId() {
		return id;
	
	
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
