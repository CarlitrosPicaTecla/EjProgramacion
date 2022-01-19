package ej2;

public class Habitacion {

	private int tipo;//1.Grande, 2.Mediana 3.Pequeña
	private double precio;
	private int servicioExtra;
	private String Cliente;
	private int nDias;
	private boolean limpio;
	private boolean ocupada;
	
	
	public Habitacion(int tipo, double precio, int servicioExtra, String cliente, int nDias, boolean limpio, boolean ocupada) {
		super();
		this.tipo = tipo;
		this.precio = precio;
		this.servicioExtra = servicioExtra;
		Cliente = cliente;
		this.nDias = nDias;
		this.limpio= limpio;
		this.ocupada=ocupada;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getServicioExtra() {
		return servicioExtra;
	}


	public void setServicioExtra(int servicioExtra) {
		this.servicioExtra = servicioExtra;
	}


	public String getCliente() {
		return Cliente;
	}


	public void setCliente(String cliente) {
		Cliente = cliente;
	}


	public int getnDias() {
		return nDias;
	}


	public void setnDias(int nDias) {
		this.nDias = nDias;
	}


	public boolean isLimpio() {
		return limpio;
	}


	public void setLimpio(boolean limpio) {
		this.limpio = limpio;
	}


	public boolean isOcupada() {
		return ocupada;
	}


	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}
	
	
	
}
