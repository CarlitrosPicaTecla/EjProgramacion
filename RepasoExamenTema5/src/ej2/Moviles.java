package ej2;

public class Moviles extends Producto{

	private String marca;
	private String modelo; 
	public Moviles(String nombre, int unidades, double precioBase, String marca, String modelo) {
		super(nombre, unidades, precioBase);
		this.marca = marca;
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	

	public double calcularPVP(double descuento) {
		
		return super.calcularPVP(descuento)+(super.calcularPVP(descuento)*descuento/100);
	}
	@Override
	public int compareTo(Producto o) {
		
		if(super.getUnidades()>=o.getUnidades()) {
			return -1;
		}
		else {
			if(super.getUnidades()<=o.getPrecioBase()) {
				return 1;
			}
		}
	
		return 0;
	}
	@Override
	public String toString() {
		return super.toString()+ " marca: " + marca + " modelo: " + modelo + " id";
	}
	
	
	
	
}
