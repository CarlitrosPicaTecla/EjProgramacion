package ej9;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0, suma=0;
		
		System.out.println("Introduce numeros para sumarlos hasta introducir uno negativo");
		
		
		while(num>=0) {
			System.out.println("Introduce un numero");
			suma=suma+num;
			num=Leer.datoInt();
		}
		
		System.out.println("Suma total:"+suma);
	}

}
