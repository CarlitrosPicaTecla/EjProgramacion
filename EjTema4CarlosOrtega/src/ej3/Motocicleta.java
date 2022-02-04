package ej3;

public class Motocicleta extends Vehiculo {

	public Motocicleta(String marca, String modelo, double cilindrada, double cv, int combustible) {
		super(marca, modelo, cilindrada, cv, combustible);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularImpuesto(double porc) {

		double div=100;
		
		return	super.calcularImpuesto(porc)+getCv()*porc/div;
	}
}
