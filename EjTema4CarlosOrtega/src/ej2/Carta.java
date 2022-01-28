package ej2;

public class Carta extends Documento {

	private String fecha;

	public Carta(String nombre, String cif, String direccion, String fecha) {
		super(nombre, cif, direccion);
		this.fecha = fecha;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public void imprimirCarta() {
		super.imprimirDocumento();
		System.out.println("Fecha: "+getFecha());
	}
}
