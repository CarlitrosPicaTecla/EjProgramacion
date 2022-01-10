package ej14;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sueldo=1000, ventas=0, sueldoFinal=0,por=20, div=100;

		
		
		System.out.println("Introduce ganancia en ventas");
		ventas=Leer.datoDouble();
		
		sueldoFinal=(ventas*por)/div;
		sueldoFinal=sueldoFinal+sueldo;
		
		System.out.printf("El vendedor a generado %.2f€, su ganancia sera de %.2f€",ventas,sueldoFinal);
		
	}

}
