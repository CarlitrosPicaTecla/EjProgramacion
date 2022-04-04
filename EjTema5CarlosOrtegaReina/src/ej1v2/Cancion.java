package ej1v2;

import java.time.Duration;


public class Cancion {

	private String nombre;
	private String autor;
	private Duration duracion;
	private String genero;
	
	public Cancion(String nombre, String autor, Duration duracion, String genero) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.duracion = duracion;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Duration getDuracion() {
		return duracion;
	}

	public void setDuracion(Duration duracion) {
		this.duracion = duracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + ", autor=" + autor + ", duracion=" + duracion + ", genero=" + genero + "]";
	}



	
	
	
}
