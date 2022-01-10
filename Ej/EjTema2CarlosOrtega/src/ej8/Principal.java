package ej8;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num=0, suma=0, mult=1, tope=10;

		
		System.out.println("Introduce 10 numeros para mostar su suma y prouducto");
		
		for (int i = 0; i <tope ; i++) {
			System.out.println("Introduce número "+(i+1));
			num=Leer.datoDouble();
			suma=suma+num;
			mult=mult*num;
		}
		
		System.out.printf("Resultado suma: %.0f\n", suma);
		System.out.printf("Resultado producto: %.0f",mult);
	}

}
