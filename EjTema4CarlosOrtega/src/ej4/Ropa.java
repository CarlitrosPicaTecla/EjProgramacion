package ej4;

public class Ropa extends Producto {
	
	private char talla;

	public Ropa(int id, double precioU, String nombre, char talla) {
		super(id, precioU, nombre);
		this.talla=talla;
	}
	
	
	

	public char getTalla() {
		return talla;
	}




	public void setTalla(char talla) {
		this.talla = talla;
	}




	@Override
	public double calcularPrecioFinal(double descuento) {
		return 0;
	}

	
}
