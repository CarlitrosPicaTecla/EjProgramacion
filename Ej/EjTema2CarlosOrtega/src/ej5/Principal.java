package ej5;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sala=0, personas=0;
		double precioVip=6, precio3d=5, precioNinios=3.5, total=0;
		String nombreSala="";
		
		System.out.printf("Eliga la sala deseada\n");
		System.out.println("1.Sala VIP\n");
		System.out.println("2.Sala 3D\n");
		System.out.println("3.Sala para niños");
		sala=Leer.datoInt();

		System.out.println("¿Cuantas entradas quiere?");
		personas=Leer.datoInt();
		
		switch (sala) {
		case 1:
			total=precioVip*personas;
			nombreSala="Sala VIP";
			break;
		case 2:
			total=precio3d*personas;
			nombreSala="Sala 3D";
			break;
		case 3:
			total=precioNinios*personas;
			nombreSala="Sala niños";
			break;
		}
		
		System.out.printf("Precio Final\n");
		System.out.printf("%d entradas en %s: %.2f€",personas,nombreSala,total );
		
		
	}

}
