package ej2;

public class Ventas {

	Producto p[];
	
	

	public Ventas(Producto[] p) {
		super();
		this.p = p;
	}

	public Producto[] getP() {
		return p;
	}

	public void setP(Producto[] p) {
		this.p = p;
	}
	
	public int sinVender() {
		int cant=0;
		for (int i = 0; i < p.length; i++) {
			if(p[i].isEstado()==false) {
				cant++;
			}
		}
		return cant;
	}
	
	public double totalRecaudaddo() {
		double total=0;
		for (int i = 0; i < p.length; i++) {
			if(p[i].isEstado()) {
				total+=p[i].getPrecioBase();
			}
		}
		return total;
	}
	
	public double calcularCambio(double entregado, double porc, int i) {
		double cambio=0;
		double total=0;

		total+=p[i].calculalPvp(porc);
		
		cambio=entregado-total;
		return cambio;
		
	}
	
	public void mostrarLista() {
		
		for (int i = 0; i < p.length; i++) {
			System.out.println();
			System.out.println(p[i].getNombre());
			System.out.println("Cant: "+p[i].getCant());
			System.out.println("Precio: "+p[i].getPrecioBase());
			System.out.println();
		}
	}
	
}
