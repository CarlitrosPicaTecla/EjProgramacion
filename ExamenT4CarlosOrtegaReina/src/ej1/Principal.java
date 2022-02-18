package ej1;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numMenu=0, tam=3, i=0;
		double porc=10;
		//Le doy valor al porcentaje desde el principio para no volver a introducirlo
		Avion[] aviones=new Avion[tam];
		
		aviones[0]=new Avion(1, 5, 2010, 1500);
		aviones[1]=new Caza(2, 10, 2015, 1000, 500, 12);
		aviones[2]=new NaveEspacial(3, 12, 1999, 3000, 5);
		
		Aeropuerto a=new Aeropuerto("Aeropuerto Don Bosco",aviones);
		
		do {
			System.out.println("1.Mostrar total recaudado");
			System.out.println("2.Mostrar total Cazas");
			System.out.println("3.Mostrar Aviones");
			System.out.println("4.Mostrar precio avion");
			numMenu=Leer.datoInt();
			
			switch (numMenu) {
			case 1:
				
				System.out.println("Total recaudado: "+a.CalcularTotalAviones(porc)+"€");
				
				break;

			case 2:
				System.out.println("Total cazas: "+a.CalcularTotalCazas(porc)+"€");
				
				break;

			case 3:
				a.mostrarListado();
				break;


			case 4:
				System.out.println("Introduce posicion para calcular avion");
				i=Leer.datoInt();
				System.out.println("Precio: "+a.CalcularAvionGeneral(aviones[i-1], porc)+"€");
				
				break;

			case 0:
				System.out.println("Adios");
				break;
			}
			
		}while(numMenu!=0);
		
	}

}
