package ej1;

public class Caza extends Avion{


	private double cv;
	private int nMisiles;
	
	public Caza(int id, double longitud, int anyo, double lCombustible, double cv, int nMisiles) {
		super(id, longitud, anyo, lCombustible);
		this.cv=cv;
		this.nMisiles=nMisiles;
	}
	
	
	public double calcularPrecioAterrizaje(double extraMisil) {
		extraMisil=10;
		
		return super.calcularPrecioAterrizaje(extraMisil)+extraMisil*nMisiles;
		
			
		}
	}
		

