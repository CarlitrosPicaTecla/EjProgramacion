package ej1;

import java.util.Objects;

public class Habitacion implements Comparable<Habitacion> {

	private String cliente;
	private boolean ocupacion;
	private int nDias;
	private int nOcupantes;
	private double precioBase;
	
	public Habitacion(String cliente, boolean ocupacion, int nDias, int nOcupantes, double precioBase) {
		super();
		this.cliente = cliente;
		this.ocupacion = ocupacion;
		this.nDias = nDias;
		this.nOcupantes = nOcupantes;
		this.precioBase = precioBase;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public boolean isOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(boolean ocupacion) {
		this.ocupacion = ocupacion;
	}

	public int getnDias() {
		return nDias;
	}

	public void setnDias(int nDias) {
		this.nDias = nDias;
	}

	public int getnOcupantes() {
		return nOcupantes;
	}

	public void setnOcupantes(int nOcupantes) {
		this.nOcupantes = nOcupantes;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	

	public double calcularPrecio(double descuento) {
		
		return precioBase*nDias;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(cliente, nDias, nOcupantes, ocupacion, precioBase);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Habitacion other = (Habitacion) obj;
		return Objects.equals(cliente, other.cliente) && nDias == other.nDias && nOcupantes == other.nOcupantes
				&& ocupacion == other.ocupacion
				&& Double.doubleToLongBits(precioBase) == Double.doubleToLongBits(other.precioBase);
	}

	@Override
	public int compareTo(Habitacion o) {
		// TODO Auto-generated method stub
		if(this.precioBase>=o.calcularPrecio(nDias)) {
			return -1;
		}
		else {
			if(this.precioBase<=o.calcularPrecio(nDias)) {
				return 1;
			}
		}
		return 0;
	}

	@Override
	public String toString() {
		return "\n Cliente: " + cliente + "\n Ocupacion:" + ocupacion + "\n Dias: " + nDias + "\n Ocupantes: "
				+ nOcupantes + "\n precioBase=" + precioBase + "€\n\n";
	}
	
}
	


