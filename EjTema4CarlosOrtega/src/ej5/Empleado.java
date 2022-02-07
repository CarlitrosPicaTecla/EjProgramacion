package ej5;

public class Empleado {

	private String nombre;
	private int id;
	private double sueldo;
	private double recaudado;
	
	
	public Empleado(String nombre, int id, double sueldo, double recaudado) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.sueldo = sueldo;
		this.recaudado = recaudado;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public double getRecaudado() {
		return recaudado;
	}


	public void setRecaudado(double recaudado) {
		this.recaudado = recaudado;
	}
	
	
	
}
