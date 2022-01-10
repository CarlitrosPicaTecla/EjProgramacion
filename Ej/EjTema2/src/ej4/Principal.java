package ej4;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0;
		System.out.println("Introduce numero para comprobar si es par o impar");
		num=Leer.datoInt();
		
		if(num%2==0) {
			System.out.printf("El numero %d es par",num);
			
		}
		else {
			System.out.printf("El numero %d es impar",num);
		}
	}

}
