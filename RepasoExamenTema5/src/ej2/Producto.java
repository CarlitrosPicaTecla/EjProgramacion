package ej2;

import java.util.Objects;

public abstract class Producto implements Comparable<Producto> {

	private String nombre;
	private int unidades;
	private double precioBase;
	
	public Producto(String nombre, int unidades, double precioBase) {
		super();
		this.nombre = nombre;
		this.unidades = unidades;
		this.precioBase = precioBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	public double calcularPVP(double descuento) {
		return precioBase*unidades;
	}


	
	@Override
	public int hashCode() {
		return Objects.hash(nombre, precioBase, unidades);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precioBase) == Double.doubleToLongBits(other.precioBase)
				&& unidades == other.unidades;
	}
	
	

	public void mostrarProdcto(double descuento) {
		System.out.println();
		System.out.printf("%-10s\t\t ",nombre);
		System.out.printf("%d \t\t",unidades);
		System.out.printf("%.2f€\t\t",precioBase);
		System.out.printf("%.2f € \t",calcularPVP(descuento));
	}

	@Override
	public String toString() {
		return "\nnombre: " + nombre + " unidades: " + unidades + "  precioBase: " + precioBase + "";
	}
	
	
	
	
}
