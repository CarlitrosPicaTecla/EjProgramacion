package ej2;

public class Documento {

	private String nombre;
	private String cif;
	private String direccion;
	
	
	public Documento(String nombre, String cif, String direccion) {
		this.nombre = nombre;
		this.cif = cif;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	

	public void imprimirDocumento() {
		System.out.println("Empresa: "+getNombre());
		System.out.println("CIF: "+getCif());
		System.out.println("Direccion: "+getDireccion());
	}
	
}
