package ej1;

public class Suite extends Habitacion{

	private double mCuadrados;
	private double extra;
	
	public Suite(String cliente, boolean ocupacion, int nDias, int nOcupantes, double precioBase, double mCuadrados,
			double extra) {
		super(cliente, ocupacion, nDias, nOcupantes, precioBase);
		this.mCuadrados = mCuadrados;
		this.extra = extra;
	}

	public double getmCuadrados() {
		return mCuadrados;
	}

	public void setmCuadrados(double mCuadrados) {
		this.mCuadrados = mCuadrados;
	}

	public double getExtra() {
		return extra;
	}

	public void setExtra(double extra) {
		this.extra = extra;
	}
	
	public double calcularPrecio(double descuento) {
		return super.calcularPrecio(descuento)-(super.calcularPrecio(descuento)*descuento/100)+extra;
	}
}
