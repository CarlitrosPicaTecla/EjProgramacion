package ej15;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		double saldo=500, entrada=50,retirar=0,ingresar=0;
		int orden=0;
		
		
		
		do{
			System.out.println("1.Ver saldo");
			System.out.println("2.Retirar dinero");
			System.out.println("3.Ingresar dinero");
			System.out.println("4.Comprar entrada");
			System.out.println("0.Salir");
		
			orden=Leer.datoInt();
			
			switch (orden) {
			case 1:
				for (int i = 0; i < 30; i++)System.out.println();
				System.out.printf("Saldo:%.2f€\n ",saldo);
		        Thread.sleep(2500);
				for (int i = 0; i < 30; i++)System.out.println();

				break;
			case 2:
				System.out.printf("Introduce cantidad a retirar\n");
				retirar=Leer.datoDouble();
				if(saldo>=retirar) {
					saldo=saldo-retirar;
				}
				else {
					System.out.println("No puede retirar mas de lo que tiene");
				}
				System.out.printf("Tu saldo ahora es de %.2f€\n",saldo);
		        Thread.sleep(2500);
				for (int i = 0; i < 30; i++)System.out.println();
				break;
			case 3:
				System.out.printf("Introduce cantidad a ingresar\n");
				ingresar=Leer.datoDouble();
				saldo=saldo+ingresar;
				System.out.printf("Tu saldo ahora es de %.2f€\n",saldo);
		        Thread.sleep(2500);
				for (int i = 0; i < 30; i++)System.out.println();
				break;				
			case 4:
				for (int i = 0; i < 30; i++)System.out.println();
				System.out.printf("Comprando entrada...\n");
				saldo-=entrada;
				System.out.printf("Su saldo ahora es de %.2f€",saldo);
		        Thread.sleep(2500);
				for (int i = 0; i < 30; i++)System.out.println();
				break;

			}
		
		}while(orden!=0);
		
		for (int i = 0; i < 30; i++)System.out.println();

		System.out.println("Gracias, un saludo");
	}

}
