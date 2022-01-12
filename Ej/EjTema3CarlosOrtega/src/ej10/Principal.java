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
		
		do {
			System.out.println("1.Elegir numero de notas");
			System.out.println("2.Añadir Notas");
			System.out.println("3.Actualizar nota");
			System.out.println("4.Mostrar notas");
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
				
				for (int i = 0; i < nNotas; i++) {
				System.out.println("Introduzca la nota ");
				nota=Leer.datoDouble();
				g.addNotas(new Nota(nota));
				}
				break;			
			case 3:
				g.updateNota(pos, n);
				break;
			case 4:
				g.showNotas();
				break;
			default:
				break;
			}
			
			
		}while(num!=0);
	}

}
