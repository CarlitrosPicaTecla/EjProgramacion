package ej11;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0,b=0, res=1;
		
		System.out.println("Introduce 2 numero, el primero sera la base y el segundo es exponente");
		
		System.out.println("Introduce base");
		a=Leer.datoInt();
		System.out.println("Introduce exponente");
		b=Leer.datoInt();
		
		for (int i = 0; i < b; i++) {
			res=res*a;
		}
		
		System.out.printf("El resultado es %d",res);
	}

}
