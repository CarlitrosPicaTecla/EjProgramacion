package ej3;

public class Turismo extends Vehiculo {

	public Turismo(String marca, String modelo, double cilindrada, double cv, int combustible) {
		super(marca, modelo, cilindrada, cv, combustible);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularImpuesto(double cantidadFija) {
		double total;
		double porc=25;
		porc=porc/100;
		total=(getCilindrada()*porc)+cantidadFija;
		
		return total;
	}






	
	

	
}
