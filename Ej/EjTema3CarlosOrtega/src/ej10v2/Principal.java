package ej10v2;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numMenu;
		Nota nota=new Nota();
		Gestion g= new Gestion();
		double media;
		int suspensos;
		int pos=0;
		int nNotas = 0;
		double num;

		
		
		do {
			System.out.println("1.Introducir numero de notas");
			System.out.println("2.Introducir Notas");
			System.out.println("3.Actualizar nota");
			System.out.println("4.Mostrar notas");
			System.out.println("5.Mostar media de notas");
			System.out.println("6.Mostrar numero de suspensos");
			System.out.println("0.Salir");
			numMenu=Leer.datoInt();
			
			switch (numMenu) {
			case 1:

				System.out.println("¿Cuantas notas desea añadir?");
				nNotas=Leer.datoInt();
				g.addLong(nNotas);
				
				break;
			case 2:
				for (int i = 0; i < nNotas;) {
					System.out.println("Introduzca una nota:");
					num=Leer.datoDouble();
					g.addNotas(nota=new Nota(num), i);
					 i++;
				}
				break;
			case 3:
				System.out.println("¿Que posicion desear cambiar?");
				pos=Leer.datoInt();
				System.out.println("¿Que numero desea poner?");
				num=Leer.datoDouble();
				g.addNotas(nota, pos);
				break;
			case 4:
				g.showNotas(g);				
				break;
			case 5:
				media=g.doAverage(g);
				System.out.println("La media es: "+media);
				break;
			case 6:
				suspensos=g.nSuspensos(g);
				System.out.println("El numero de suspensos es de: "+suspensos);
				
				break;

			default:
				break;
			}
		}while(numMenu!=0);
	}

}
