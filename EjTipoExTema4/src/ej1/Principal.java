package ej1;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numMenu=0,i=0,tam=4;
		double porc=0.0;
		double precio=0.0;
		
		Habitacion listaH[]=new Habitacion[tam];
		listaH[0]=new Habitacion("Xopin",20, true, 5, 1);
		listaH[1]=new Suite("Maylor",30, true, 5, 1, 80, 100);
		listaH[2]=new Apartamento("Carlos",10, false, 10, 1, 80);
		listaH[3]=new Apartamento("Paco",12, false, 5, 1, 50);

		
		Gestion g= new Gestion(listaH);
		
		do{
			System.out.println("1.Calcular precio Habitacion");
			System.out.println("2.Calcular total recuadado");
			System.out.println("3.Mostrar factura");
			System.out.println("4.Mostrar habitaciones libres");
			numMenu=Leer.datoInt();
			
			switch (numMenu) {
			case 1:
				i=0;
				System.out.println("Introduce numero de habitacion");
				i=Leer.datoInt();
				System.out.println("Introduce descuento");
				porc=Leer.datoDouble();

				System.out.println("Precio: "+g.calcularHabitacion(listaH[i-1], porc)+"€");
				break;
			case 2:
				i=0;

				g.gananciaTotal(porc,tam);
				System.out.println(g.getTotalRecaudado());
				
				break;
			case 3:
				i=0;
				System.out.println("Introduce numero de habitacion");
				i=Leer.datoInt();
				g.mostrarHabitacion(i-1);
				break;
			case 4:
				g.mostrarOcupacion();
				break;

			default:
				break;
			}
		}while(numMenu!=0);
		
	}

}
