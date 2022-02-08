package ej4;

public class Alimentacion extends Producto {


	private int diasCaducidad;
	
	public Alimentacion(int id, double precioU, String nombre, int diasCaducidad) {
		super(id, precioU, nombre);
		this.diasCaducidad = diasCaducidad;
	}
	
	

	public int getDiasCaducidad() {
		return diasCaducidad;
	}




	public void setDiasCaducidad(int diasCaducidad) {
		this.diasCaducidad = diasCaducidad;
	}





	public double calcularPrecioFinal(double descuento) {
		return 0;
	}
	
	
	
}
