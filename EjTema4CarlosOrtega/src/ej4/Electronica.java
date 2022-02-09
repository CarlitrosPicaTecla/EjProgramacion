package ej4;

public class Electronica extends Producto {




	
	public Electronica(int id, double precioU, String nombre) {
		super(id, precioU, nombre);
	}
	
	@Override
	public double calcularPrecioFinal(double impuesto) {
		return getPrecioU()+(getPrecioU()*impuesto)/100;
	}
}
