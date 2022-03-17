package ej6;

import java.util.Objects;

public class Trabajador implements Comparable<Trabajador> {

	private String nombre;
	private String dni;
	private double horasT;
	private double sueldo;
	
	public Trabajador(String nombre, String dni, double horasT) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.horasT = horasT;
		this.sueldo = 0;
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

	public double getHorasT() {
		return horasT;
	}

	public void setHorasT(double horasT) {
		this.horasT = horasT;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni, horasT, nombre, sueldo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trabajador other = (Trabajador) obj;
		return Objects.equals(dni, other.dni)
				&& Double.doubleToLongBits(horasT) == Double.doubleToLongBits(other.horasT)
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(sueldo) == Double.doubleToLongBits(other.sueldo);
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", dni=" + dni + ", horasT=" + horasT + ", sueldo=" + sueldo + "]";
	}
	
	public double calcularSueldo(double sueldoH) {
		
		
		setSueldo(horasT*sueldoH);
		return horasT*sueldoH;
		
		
	}

	@Override
	public int compareTo(Trabajador o) {
		// TODO Auto-generated method stub
		
		if(this.horasT>=o.getHorasT()) {
			return -1;
		}
		else {
			if(this.horasT<=o.getHorasT()) {
				return 1;
			}
		}
		
		return 0;
	}
	
}
