package ej3;

public class Turismo extends Vehiculo {

	public Turismo(String marca, String modelo, double cilindrada, double cv, int combustible) {
		super(marca, modelo, cilindrada, cv, combustible);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularImpuesto(double porc) {
		double div=100;
		return super.calcularImpuesto(porc)+getCilindrada()*porc/div;
	}






	
	

	
}
