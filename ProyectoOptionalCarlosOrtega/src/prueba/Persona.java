package prueba;

public class Persona {

	private String nombre;
	private String curso;
	
	public Persona(String nombre, String curso) {
		super();
		this.nombre = nombre;
		this.curso = curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " Curso: " + curso;
	}

	
	
	
}
