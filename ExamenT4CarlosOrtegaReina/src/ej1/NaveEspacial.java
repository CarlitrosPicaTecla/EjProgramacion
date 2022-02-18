package ej1;

public class NaveEspacial extends Avion {

	
	private int nMotores;
	
	public NaveEspacial(int id, double longitud, int anyo, double lCombustible, int nMotores) {
		super(id, longitud, anyo, lCombustible);
		// TODO Auto-generated constructor stub
		this.nMotores=nMotores;
	}

	public int getnMotores() {
		return nMotores;
	}

	public void setnMotores(int nMotores) {
		this.nMotores = nMotores;
	}


	public double calcularPrecioAterrizaje(double descuento) {
		
		if(nMotores>4) {
			return super.calcularPrecioAterrizaje(descuento)+(super.calcularPrecioAterrizaje(descuento)*descuento/100);
		}
		
		return super.calcularPrecioAterrizaje(descuento);
		
	}
	
	public void avisarExtraterrestre() {
		System.out.println("Nave espacial, llamen a los men in black");
	}
	
}
