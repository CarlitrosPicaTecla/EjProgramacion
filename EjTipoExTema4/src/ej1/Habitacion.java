package ej1;

public class Habitacion {

	private String cliente;
	private double precioB;
	private boolean ocupado;
	private int nDias;
	private int ocupantes;
	
	
	public Habitacion(String cliente, double precioB, boolean ocupado, int nDias, int ocupantes) {
		this.cliente = cliente;
		this.precioB = precioB;
		this.ocupado = ocupado;
		this.nDias = nDias;
		this.ocupantes = ocupantes;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public double getPrecioB() {
		return precioB;
	}


	public void setPrecioB(double precioB) {
		this.precioB = precioB;
	}


	public boolean isOcupado() {
		return ocupado;
	}


	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}


	public int getnDias() {
		return nDias;
	}


	public void setnDias(int nDias) {
		this.nDias = nDias;
	}


	public int getOcupantes() {
		return ocupantes;
	}


	public void setOcupantes(int ocupantes) {
		this.ocupantes = ocupantes;
	}
	
	
	public double calcularPrecio(double descuento) {
		
		return precioB*nDias;
	}


	@Override
	public String toString() {
		return "Habitacion [cliente=" + cliente + ", precioB=" + precioB + ", ocupado=" + ocupado + ", nDias=" + nDias
				+ ", ocupantes=" + ocupantes + "]";
	}
}
