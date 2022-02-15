package ej1;

public class Suite extends Habitacion{

	
	private double metrosCuadrados;
	private double consumido;
	
	
	public Suite(String cliente, double precioB, boolean ocupado, int nDias, int ocupantes,	double metrosCuadrados, double consumido) {
		super(cliente, precioB, ocupado, nDias, ocupantes);
		
		this.metrosCuadrados=metrosCuadrados;
		this.consumido=consumido;
	}


	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}


	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}


	public double getConsumido() {
		return consumido;
	}


	public void setConsumido(double consumido) {
		this.consumido = consumido;
	}

	
	public double calcularPrecio(double descuento) {
		return super.calcularPrecio(descuento)-((super.calcularPrecio(descuento)+consumido)*descuento)/100;
	}


	@Override
	public String toString() {
		super.toString();
		return "Suite [metrosCuadrados=" + metrosCuadrados + ", consumido=" + consumido + "]";
	}

	
	
}
