package ej1;

public class Avion implements IAterrizar{

	private int id;
	private double longitud;
	private int anyo;
	private double lCombustible;
	
	public Avion(int id, double longitud, int anyo, double lCombustible) {
		super();
		this.id = id;
		this.longitud = longitud;
		this.anyo = anyo;
		this.lCombustible = lCombustible;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public double getlCombustible() {
		return lCombustible;
	}

	public void setlCombustible(double lCombustible) {
		this.lCombustible = lCombustible;
	}

	@Override
	public double calcularPrecioAterrizaje(double descuento) {
		double dos=2;
		double dosmil=2000;
		double cien=100;
		if(lCombustible>dosmil) {
			return dos*longitud+cien;
		}
		
			return dos*longitud ;
	}
	
 
	
}
