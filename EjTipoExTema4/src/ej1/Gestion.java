package ej1;

public class Gestion {

	private Habitacion[] listaH;
	
	public static double totalRecaudado;

	public Gestion(Habitacion[] listaH) {
		super();
		this.listaH = listaH;
	}


	public Habitacion[] getListaH() {
		return listaH;
	}

	public void setListaH(Habitacion[] listaH) {
		this.listaH = listaH;
	}
	
	
	
	public static double getTotalRecaudado() {
		return totalRecaudado;
	}

	public static void setTotalRecaudado(double totalRecaudado) {
		Gestion.totalRecaudado = totalRecaudado;
	}

	public double calcularHabitacion(Habitacion h, double porc) {
		return h.calcularPrecio(porc);
	}
	
	public void gananciaTotal(double descuento) {
		for (int i = 0; i < listaH.length; i++) {
			totalRecaudado=totalRecaudado+ calcularHabitacion(listaH[i], descuento);
		}
	}
	
	public void mostrarHabitacion(int i) {
		System.out.println();
		System.out.println("Cliente: "+listaH[i].getCliente());
		System.out.println("Nº de dias: "+listaH[i].getnDias());
		System.out.println("Nº Ocupantes: "+listaH[i].getOcupantes());
		System.out.println("Precio: "+listaH[i].getPrecioB());
		System.out.println();

	}
	
	public void mostrarOcupacion() {
		for (int j = 0; j < listaH.length; j++) {
			if(listaH[j].isOcupado()==false) {
				mostrarHabitacion(j);
			}
		}

	}
}
