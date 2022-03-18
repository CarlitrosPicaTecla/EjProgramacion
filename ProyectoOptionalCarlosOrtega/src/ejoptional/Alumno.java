package ejoptional;

import java.util.Optional;

public class Alumno {
	
	
	private String dni;
	private String nombre;
	private String curso;
	private String email;
	public double notaMedia;
	public Alumno(String dni, String nombre, String curso, String email, double notaMedia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.curso = curso;
		this.email = email;
		this.notaMedia = notaMedia;
	}
	public Optional<String> getDni() {
		return Optional.ofNullable(dni);
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Optional<String> getNombre() {
		return Optional.ofNullable(nombre);
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Optional<String>getCurso() {
		return Optional.ofNullable(curso);
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getNotaMedia() {
		return notaMedia;
	}
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", curso=" + curso + ", email=" + email + ", notaMedia="
				+ notaMedia + "]";
	}
	
	
	
}
