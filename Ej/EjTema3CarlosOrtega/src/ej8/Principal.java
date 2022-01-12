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
		Billete s= new Billete();
		do {
			System.out.println("1.Comprar decimo");
			System.out.println("2.Hacer sorteo");
			System.out.println("3.Comprobar premio");
			System.out.println("4.Mostar premio");
			num=Leer.datoInt();	
			
			switch (num) {
			case 1:
				System.out.println("Eligue un numero: ");
				decimo=Leer.datoInt();
				decimo=g.comprarDecimo(decimo);
				System.out.println("Tu numero es: "+decimo);
				
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
				break;
			case 4:
				System.out.println("El numero premiado es: "+s.getNumero());
				break;
			default:
				break;
			}
		}while(num!=0);
	}

}
