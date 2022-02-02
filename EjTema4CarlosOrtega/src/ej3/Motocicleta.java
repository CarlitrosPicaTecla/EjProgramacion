package ej3;

public class Motocicleta extends Vehiculo {

	public Motocicleta(String marca, String modelo, double cilindrada, double cv, int combustible) {
		super(marca, modelo, cilindrada, cv, combustible);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularImpuesto(double cantidadFija) {
		double total;
		double porc=60;
		porc=porc/100;
		total=(getCv()*porc)+cantidadFija;
		
		return total;
	}
}
