package ej3;

public class Furgoneta extends Vehiculo {

	public Furgoneta(String marca, String modelo, double cilindrada, double cv, int combustible) {
		super(marca, modelo, cilindrada, cv, combustible);
		// TODO Auto-generated constructor stub
	}

	public double calcularImpuesto(double porc) {
		
		return super.calcularImpuesto(porc)+porc;

	}
}
