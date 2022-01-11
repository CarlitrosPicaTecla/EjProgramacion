package ej8;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hasta=99999;
		int desde=0;
		int decimo = 0;
		int num;
		int premiado=0;
		Gestion g = new Gestion();
		Sorteo s= new Sorteo(decimo);
		do {
			System.out.println("1.Comprar decimo");
			System.out.println("2.Hacer sorteo");
			System.out.println("3.Comprobar premio");
			num=Leer.datoInt();	
			
			switch (num) {
			case 1:
				decimo=Leer.datoInt();
				g.comprarDecimo(decimo);
				
				break;
			case 2:
				g.generarSorteo(premiado, hasta, desde);
				
				break;
			case 3:
				if(g.comprobarPremio(num, premiado)) {
					System.out.println("Has ganado!!");
				}
				else {
					System.out.println("Suerte el año que viene");
				}
				
			default:
				break;
			}
		}while(num!=0);
	}

}
