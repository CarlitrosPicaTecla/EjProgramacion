package ej4;

public class Venta {

	private LineaVenta[] lineas;

	public Venta(LineaVenta[] lineas) {
		super();
		this.lineas = lineas;
	}

	public LineaVenta[] getLineas() {
		return lineas;
	}

	public void setLineas(LineaVenta[] lineas) {
		this.lineas = lineas;
	}
	
	public void addLineaVenta(int pos, LineaVenta l) {
		lineas[pos]=l;
	}
	
	public double calcularProductoGeneral(Producto p, double descuento) {
		return p.calcularPrecioFinal(descuento);
	}
	
	public double calcularSuma(double descuento) {
		
		double total =0.0;
		for (int i = 0; i < lineas.length; i++) {
			total+=calcularProductoGeneral(lineas[i].getP() ,descuento);
		}
		
		return total;
	}
	
	public void imprimirTicket() {
		
	}
	
}
