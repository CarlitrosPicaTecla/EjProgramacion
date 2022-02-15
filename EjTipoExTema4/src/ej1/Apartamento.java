package ej1;

public class Apartamento extends Habitacion{



	private double servicioExtra;
	
	public Apartamento(String cliente, double precioB, boolean ocupado, int nDias, int ocupantes, double servicioExtra) {
		super(cliente, precioB, ocupado, nDias, ocupantes);
		this.servicioExtra=servicioExtra;
	}

	public double getServicioExtra() {
		return servicioExtra;
	}

	public void setServicioExtra(double servicioExtra) {
		this.servicioExtra = servicioExtra;
	}
	
	public double calcularPrecio(double descuento) {
		return super.calcularPrecio(descuento)+servicioExtra;
	}

	@Override
	public String toString() {
		super.toString();
		return "Apartamento [servicioExtra=" + servicioExtra + "]";
	}
	
	
	
}
