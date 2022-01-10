package ej16;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double suma=0,resta=0,div=1,mult=1,parImpar=0, n1=0,n2=0;
		int orden=0;
		
		do {
			System.out.println("1.Sumar");
			System.out.println("2.Resta");
			System.out.println("3.Multiplicación");
			System.out.println("4.División");
			System.out.println("5.Par o Impar");
			System.out.printf("\n0.Salir\n");
			orden=Leer.datoInt();
			
			switch (orden) {
			case 1:
				System.out.println("Introduce numeros para sumar, pulsar 0 para salir");
				do {
					suma+=n1;
					n1=Leer.datoDouble();
				}while(n1!=0);
				System.out.printf("Resultado suma: %.1f\n",suma);
				break;
			case 2:
				System.out.println("Introduce numeros para restar, pulsar 0 para salir");
				
				do{
					System.out.println("Introduce primer numero");
					n1=Leer.datoDouble();
					System.out.println("Introduce segundo numero");
					n2=Leer.datoDouble();
					
					resta=n1-n2;
					System.out.printf("Resultado resta: %.1f\n",resta);

				}while(n1!=0 || n2!=0 );
				break;
			case 3:
				System.out.println("Introduce numeros para multiplicar, pulsar 0 para salir");
				do {
					System.out.println("Introduce primer numero");
					n1=Leer.datoDouble();
					System.out.println("Introduce segundo numero");
					n2=Leer.datoDouble();
					
					mult=n1*n2;
					System.out.printf("Resultado multiplicación: %.1f\n",mult);
				}while(n1!=0);
				
				break;
			case 4:
				System.out.println("Introduce numeros para dividir, pulsar 0 para salir");
				do {
					System.out.println("Introduce primer numero");
					n1=Leer.datoDouble();
					System.out.println("Introduce segundo numero");
					n2=Leer.datoDouble();
					
					if(n1!=0 || n2!=0) {
						div=n1/n2;
						System.out.printf("Resultado multiplicación: %.1f\n",div);

					}else {
						System.out.println("No se puede dividir por cero");
					}
					
				}while(n1!=0);
				System.out.printf("Resultado division: %.1f\n",div);
				break;
			case 5:
				System.out.println("Introduce numeros para comprobar si son par o impar, pulsa 0 para salir");
				do {
					n1=Leer.datoDouble();
					if(n1%2==0) {
						System.out.println("Par");
					}
					else {
						System.out.println("Impar");
					}
					
				}while(n1!=0);
				
				break;
			}
		
		}while(orden!=0);
		for (int i = 0; i < 30; i++)System.out.println();

		System.out.println("Gracias, un saludo");
	}

}
