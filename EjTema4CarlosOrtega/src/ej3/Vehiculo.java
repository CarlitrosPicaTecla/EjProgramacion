package ej3;

public class Vehiculo {

	private String marca;
	private String modelo;
	private double cilindrada;
	private double cv;
	private int combustible;//1.Gasolina, 2.Diesel, 3.Hibrido, 4.Electrico
	
	
	
	public Vehiculo(String marca, String modelo, double cilindrada, double cv, int combustible) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.cv = cv;
		this.combustible = combustible;
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

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public double getCv() {
		return cv;
	}

	public void setCv(double cv) {
		this.cv = cv;
	}

	public int getCombustible() {
		return combustible;
	}

	public void setCombustible(int combustible) {
		this.combustible = combustible;
	}

	
	public double calcularImpuesto(double porc) {
		return 2*cv+cilindrada;
	}
		

	
	
}
