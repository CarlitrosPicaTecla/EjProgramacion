package ej1;

public class Aeropuerto {

	private String nombre;
	private Avion aviones[];
	
	public Aeropuerto(String nombre, Avion[] aviones) {
		super();
		this.nombre = nombre;
		this.aviones = aviones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Avion[] getAviones() {
		return aviones;
	}

	public void setAviones(Avion[] aviones) {
		this.aviones = aviones;
	}
	
	public double CalcularAvionGeneral(Avion a, double descuento) {
		return a.calcularPrecioAterrizaje(descuento);
	}
	
	public double CalcularTotalAviones(double descuento) {
		double total=0;
		for (int i = 0; i < aviones.length; i++) {
			total+=CalcularAvionGeneral(aviones[i],descuento);
		}
		
		return total;
	}
	
	public double CalcularTotalCazas(double descuento) {
		double total=0;
		for (int i = 0; i < aviones.length; i++) {
			if( aviones[i] instanceof Caza ) {
				total+=CalcularAvionGeneral(aviones[i],descuento);
			}
		}
		
		return total;
	}
	
	public void mostrarListado() {
		for (int i = 0; i < aviones.length; i++) {
			System.out.println();
			System.out.println("ID: "+aviones[i].getId());
			System.out.println("Longitud: "+aviones[i].getLongitud()+"m");
			System.out.println("Año: "+aviones[i].getAnyo());
			System.out.println("Combustible: "+aviones[i].getlCombustible()+"l");
			if(aviones[i] instanceof NaveEspacial) {
				((NaveEspacial) aviones[i]).avisarExtraterrestre();
			}
			System.out.println();
		}
	}
	
}
