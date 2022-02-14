package ej4;

public class Electronica extends Producto {


	private int impuestoElectronica;


	
	public Electronica(int impuestoElectronica,int id, double precioU, String nombre) {
		super(id, precioU, nombre);
		this.impuestoElectronica=impuestoElectronica;
	}
	
	
	
	public int getImpuestoElectronica() {
		return impuestoElectronica;
	}



	public void setImpuestoElectronica(int impuestoElectronica) {
		this.impuestoElectronica = impuestoElectronica;
	}



	@Override
	public double calcularPrecioFinal(double impuesto) {
		return getPrecioU()+(getPrecioU()*impuesto)/100;
	}
}
