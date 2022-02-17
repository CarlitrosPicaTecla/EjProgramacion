package ej1;

public class Trabajador implements IImpuesto{

	public Trabajador() {
		
	}
	
	@Override
	public double calculoIva(double precio, double iva) {
		return 0;
	}

	@Override
	public double calculoIrpf(double sueldo) {
		return sueldo+100;
	}

}
