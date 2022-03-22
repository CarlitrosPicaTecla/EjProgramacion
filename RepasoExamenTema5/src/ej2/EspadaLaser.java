package ej2;

public class EspadaLaser extends Producto {

	private String tipo;

	public EspadaLaser(String nombre, int unidades, double precioBase, String tipo) {
		super(nombre, unidades, precioBase);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double calcularPVP(double descuento) {
		
		return super.calcularPVP(descuento)+(super.calcularPVP(descuento)*descuento/100);
	}

	@Override
	public int compareTo(Producto o) {
		if(super.getUnidades()>=o.getUnidades()) {
			return -1;
		}
		else {
			if(super.getUnidades()<=o.getPrecioBase()) {
				return 1;
			}
		}
	
		return 0;
	}

	@Override
	public String toString() {
		return super.toString() +" tipo: " + tipo+" id" ;
	}

	
	
	
}
