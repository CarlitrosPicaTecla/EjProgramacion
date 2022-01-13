package ej10;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nota n=new Nota();
		Gestion g= new Gestion();
		int num;
		int nNotas = 0;
		int pos=0;
		double nota=0;
		int cont=0;
		double media=0;
		int suspensos=0;
		double numNuevo=0;
		
		do {
			System.out.println("1.Elegir numero de notas");
			System.out.println("2.Añadir Notas");
			System.out.println("3.Actualizar nota");
			System.out.println("4.Mostrar notas");
			System.out.println("5.Calcular media de notas");
			System.out.println("6.Ver numero de suspensos");
			System.out.println("0.Salir");
			num=Leer.datoInt();
			
			switch (num) {
			case 1:
				
				System.out.println("Diga cuantas notas desea añadir");
				nNotas=Leer.datoInt();
				g.nNotas(nNotas);
				System.out.println("Has elegido poner "+nNotas+" notas");
				break;
			case 2:
				
				for (int i = 0; i < nNotas; ) {
				System.out.println("Introduzca la nota ");
				nota=Leer.datoDouble();
				g.addNotas(new Nota(nota),i);
				i++;
				}
				break;			
			case 3:
				System.out.println("¿Que posicion quiere cambiar?");
				pos=Leer.datoInt();
				System.out.println("Escribe la nueva nota: ");
				numNuevo=Leer.datoDouble();
				g.updateNota(pos, new Nota(numNuevo));
				System.out.println("El numero se ha cambiado correctamente");
				break;
			case 4:
				g.showNotas(g);
				break;
			case 5:
				media=g.doAverage(g);
				System.out.println("La media de las notas es: "+media);
				break;
			case 6:
				suspensos=g.nSuspensos(g);
				System.out.println("El numero de suspensos es de: "+suspensos);
				break;
			default:
				break;
			}
			
			
		}while(num!=0);
	}

}
