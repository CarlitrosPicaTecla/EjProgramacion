package ej4;

public class Contacto {

	private String nombre;
	private String tlf;
	
	public Contacto(String nombre, String tlf) {
		super();
		this.nombre = nombre;
		this.tlf = tlf;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", tlf=" + tlf + "]";
	}
	

	
	
}
