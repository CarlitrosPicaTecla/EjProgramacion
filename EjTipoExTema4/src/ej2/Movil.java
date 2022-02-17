package ej2;

public class Movil extends Producto {


	private String marca;


	public Movil(String nombre,String marca ,double precioBase, int cant, boolean estado) {
		super(nombre, precioBase, cant, estado);
		this.marca=marca;
	}


	
	public double calculalPvp(double porc) {
		return getPrecioBase()*getCant();
	}


	
	
}
