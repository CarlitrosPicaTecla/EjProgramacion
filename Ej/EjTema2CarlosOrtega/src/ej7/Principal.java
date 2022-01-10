package ej7;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0, tope=10;
		
		System.out.println("Introduce numero para hacer la tabla de multiplicar");
		num=Leer.datoInt();
		
		for (int i = 0; i <= tope; i++) {
			System.out.println(num+"x"+i+"="+num*i);
		}
	}

}
