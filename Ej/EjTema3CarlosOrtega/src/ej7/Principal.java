package ej7;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		double saldo;
		int id;
		String nombre;
		
		System.out.println("Introduce ID");
		id=Leer.datoInt();
		System.out.println("Introduce Nombre");
		nombre=Leer.dato();
		System.out.println("Introduce Saldo");
		saldo=Leer.datoDouble();
		
		Cuenta c = new Cuenta(id, nombre, saldo);
		
		do {
			System.out.println("1.Ingresar");
			System.out.println("2.Retirar");
			System.out.println("3.Ver saldo");
			
		}while(num!0);

	}

}
