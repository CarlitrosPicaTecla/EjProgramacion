package ej3;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movil moviles[]=new Movil[10] ;
		Movil movil;
		Vendedor v=new Vendedor(moviles);
		
		int numMenu=0;
	
		 String marca;
		String modelo;
		double precio;

	
	do {
		System.out.println("1.Añadir nuevo movil");
		System.out.println("2.Vender movil");
		System.out.println("3.Mostrar lista moviles");
		System.out.println("4.Ofrecer cambio");
		numMenu=Leer.datoInt();
		
		switch (numMenu) {
		case 1:
			System.out.println("Introduce marca del movil");
			marca=Leer.dato();
			System.out.println("Introduce modelo");
			modelo=Leer.dato();
			System.out.println("Itroduce precio");
			precio=Leer.datoDouble();
			movil= new Movil(marca,modelo,precio,false);			
			int i=0;
			v.addMovil(movil, numMenu);
			break;
		case 2:
			
			break;
		case 3:
		
			int j=0;
				v.mostarListaMovil(j, v);
			

			break;
		case 4:
			
			break;

		default:
			break;
		}
	}while(numMenu!=0);
}
	}
