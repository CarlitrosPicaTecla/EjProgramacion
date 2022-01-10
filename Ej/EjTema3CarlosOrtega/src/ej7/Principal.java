package ej7;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
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

	}

}
