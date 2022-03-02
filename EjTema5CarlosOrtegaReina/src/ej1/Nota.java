package ej1;

public class Nota {

	private int id;
	private String titulo;
	private String texto;
	boolean urgente;
	
	public Nota(int id, String titulo, String texto, boolean urgente) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.texto = texto;
		this.urgente = urgente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public boolean isUrgente() {
		return urgente;
	}

	public void setUrgente(boolean urgente) {
		this.urgente = urgente;
	}

	@Override
	public String toString() {
		return "Nota [id=" + id + ", titulo=" + titulo + ", texto=" + texto + ", urgente=" + urgente + "]";
	}
	
	
	
	

	
	
	
	
}
