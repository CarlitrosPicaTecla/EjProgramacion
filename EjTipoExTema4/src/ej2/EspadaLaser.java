package ej2;

public class EspadaLaser extends Producto {

	private String tipo;
	
	public EspadaLaser(String nombre,String tipo,double precioBase, int cant, boolean estado) {
		super(nombre, precioBase, cant, estado);
		this.tipo=tipo;
	}

	
	public double calculalPvp(double porc) {
		return getPrecioBase()*getCant();
	}
}
