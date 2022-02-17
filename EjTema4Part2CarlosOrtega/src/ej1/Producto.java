package ej1;

public class Producto implements IImpuesto{

	
	public Producto() {
		
	}
	
	@Override
	public double calculoIva(double precio, double iva) {
		// TODO Auto-generated method stub
		return precio+(precio*iva/100);
	}

	@Override
	public double calculoIrpf(double sueldo) {
		return 0;
	}

}
