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
	
	public double calcularProductoGeneral(Producto p, double descuento, LineaVenta l) {
		return p.calcularPrecioFinal(descuento)*l.getCantidad();
	}
	
	public double calcularSuma(double descuento) {
		
		double total =0.0;
		for (int i = 0; i < lineas.length; i++) {
			total+=calcularProductoGeneral(lineas[i].getP() ,descuento,lineas[i]);
		}
		
		return total;
	}
	
	public void imprimirTicket(double descuento) {
		
		System.out.println("TIENDA SALESIANO\n");
		System.out.printf("Cantidad\tProducto\tPrecio Unitario\t\tSubTotal\n");
		System.out.println();
		for (int i = 0; i < lineas.length; i++) {
			System.out.printf("   %-12d",lineas[i].getCantidad());
			System.out.printf("%-15s",lineas[i].getP().getNombre());
			System.out.printf("%10.2f€",lineas[i].getP().getPrecioU());
			System.out.printf("%20.2f€",lineas[i].calcularXCantidad());
			System.out.println();

		}
		
		System.out.printf("---------------------------------------------------------------------\n");
		System.out.printf("Precio: %53.2f€\n",calcularSuma(descuento));
		
	}
	
}
