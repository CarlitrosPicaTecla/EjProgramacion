package ej1;

import java.util.ArrayList;
import java.util.List;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numMenu=0, id=1, capacidad=10 ;
		String nombre="Barco Don Bosco";
		String aux, aux2;
		Coche c;
		List<Coche>coches=new ArrayList<Coche>();
		
		Barco b = new Barco(id, nombre,capacidad, coches);
		
		b.anyadirCoche(c=new Coche("FBP1234", "Seat", "Ibiza", "Rojo", 3000));
		b.anyadirCoche(c=new Coche("CDP4566", "Toyota", "Corolla", "Gris", 8000));
		b.anyadirCoche(c=new Coche("BGF321", "Mazda", "MX-5", "Azul", 5000));
		b.anyadirCoche(c=new Coche("LMA7899", "Audi", "A-4", "Negro", 10000));

		
		
		do {
			System.out.println("1.Buscar coche por matricula");
			System.out.println("2.Buscar coche mas caro");
			System.out.println("3.Buscar todos los coches de una marca");
			System.out.println("4.Modificar color coche");
			System.out.println("5.Ordenar por orden alfabetico(No natural)");
			System.out.println("6.Ordenar por matricula");
			System.out.println("7.Total recaudado de una marca");
			System.out.println("8.Imprimir lista coches");
			
			numMenu=Leer.datoInt();
			
			switch (numMenu) {
			case 1:
				System.out.println("Introduce matricula para buscar");
				aux=Leer.dato();
				System.out.println(b.buscarCoche(aux));
				break;
			case 2:
				//System.out.println("Coche mas caro: "+b.buscarCocheCaro());
				break;
			case 3:
				System.out.println("Introduce marca para buscar");
				aux=Leer.dato();
				System.out.println(b.mismaMarca(aux));
				break;
			case 4:
				System.out.println("Introduce matricula y nuevo color");
				aux=Leer.dato();
				aux2=Leer.dato();
				b.modificarCoche(aux, aux2);
				break;
			case 5:
				b.ordenAlfabetico();
				System.out.println(coches);
				break;
			case 6:
				b.ordenNatural();
				System.out.println(coches);
				break;
			case 7:
				System.out.println("Introduce marca");
				aux=Leer.dato();
				
				System.out.println(b.totalRecaudado(aux));
				break;
			case 8:
				//b.mostrarLista();
				break;

			default:
				break;
			}
			
			
		} while (numMenu!=0);
		
	}

}
