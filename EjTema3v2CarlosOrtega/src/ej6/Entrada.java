package ej6;

public class Entrada {

	private int id;
	private double precio;
	private  boolean estado;
	private int fila;
	private int butaca;
	
	public Entrada(int id, double precio, boolean estado, int fila, int butaca) {
		super();
		this.id = id;
		this.precio = precio;
		this.estado = estado;
		this.fila = fila;
		this.butaca = butaca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getButaca() {
		return butaca;
	}

	public void setButaca(int butaca) {
		this.butaca = butaca;
	}
	
	
	
}
