package ej7;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double consumoCoche=6, precioGasolina=1.45, km=60, div=100, consumoTotal=0, costo=0;
		
		consumoTotal=(consumoCoche*km)/div;
		costo=consumoTotal*precioGasolina;
		System.out.println("Bienvenido/a a un programa de cálculo de consumo de combustible");
		System.out.printf("Nuestro coche en unos %.1fkm gastará una media de %.2fL\n"
				+ "y el coste será de %.2f€", km, consumoTotal, costo);
	}

}
