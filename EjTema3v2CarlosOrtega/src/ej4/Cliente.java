package ej4;

public class Cliente {

	private String nombre;
	private String dni;
	private double peso;
	private double altura;
	private boolean actividad;
	
	public Cliente(String nombre, String dni, double peso, double altura, boolean actividad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
		this.actividad = actividad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public boolean isActividad() {
		return actividad;
	}

	public void setActividad(boolean actividad) {
		this.actividad = actividad;
	}
	
	
	
}
