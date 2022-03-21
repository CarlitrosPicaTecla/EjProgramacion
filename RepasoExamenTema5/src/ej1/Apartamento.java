package ej1;

public class Apartamento extends Habitacion{

	private double extra;

	public Apartamento(String cliente, boolean ocupacion, int nDias, int nOcupantes, double precioBase, double extra) {
		super(cliente, ocupacion, nDias, nOcupantes, precioBase);
		this.extra = extra;
	}

	public double getExtra() {
		return extra;
	}

	public void setExtra(double extra) {
		this.extra = extra;
	}
	
	public double calcularPrecio(double descuento) {
		return super.calcularPrecio(descuento)+extra;
	}
}
