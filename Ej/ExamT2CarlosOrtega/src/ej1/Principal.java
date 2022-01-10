package ej1;
import java.util.Random;

import lectura.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random(System.nanoTime());
		int tamanyo=0;
		int num=0;
		int clases[];

		
		int hasta=0;
		int desde=0;
		int pos=0;
		int limite=0;
		int cont=0;
		int suma=0;
		int media=0;
		int dineroMedia=90;
		int cien=100;
		int numClase=0;
		int porc = 0;
		System.out.println("Bienvenido a un programa sobre la gestión del dinero en la campaña domund");
		System.out.println("Introduce el numero de clases");
		tamanyo=Leer.datoInt();
		clases=new int[tamanyo];
		do {

			System.out.println("1.Generar números de recogida");
			System.out.println("2.Mostrar euros de una clase");
			System.out.println("3.Mostrar numero de clases que superan el limite");
			System.out.println("4.Calcular y mostrar media ");
			System.out.println("5.Mostrar datos por columna");
			System.out.println("6.Porcentaje de recaudacion");
			System.out.println("0.Salir");
			num=Leer.datoInt();
			
			switch (num) {
				case 1:
					
					System.out.println("Introduce rango de numeros aleatorios");
					System.out.println("Hasta:");
					hasta=Leer.datoInt();
					System.out.println("Desde:");
					desde=Leer.datoInt();
					
					
					for (int i = 0; i < clases.length; i++) {
						clases[i]=random.nextInt(hasta+1)+desde;
					}
					
					break;
				case 2:

					while(pos!=-1) {
						System.out.println("Introduce número de clases para ver dinero");
						System.out.println("Pulsa -1 para salir");
						pos=Leer.datoInt();
						if(pos<=tamanyo && pos>0){
							System.out.println(clases[pos-1]+"€");
						}
						else {
						
							System.out.println("Introduce un número dentro del rango");
						}
					}
					pos=0;
					break;
				case 3:
					System.out.println("Introduce un límite de dinero para comprobar cuantas clases superan el límite");
					limite=Leer.datoInt();
					for (int i = 0; i < clases.length; i++) {
						if(clases[i]>=limite) {
							cont++;
						}
					}
					System.out.println("El número de clases que han superado el límite es de: "+cont);
					break;
				case 4:
					for (int i = 0; i < clases.length; i++) {
						suma=suma+clases[i];
					}
					media=suma/clases.length;
					System.out.printf("La media total de las clases es de %d€\n ",media);
					break;
				case 5:
					System.out.printf("Clase\t\tCantidad\n");
					for (int i = 0; i < clases.length; i++) {
						System.out.printf("%d\t\t%d€\n",i+1,clases[i]);
					}
					break;
				case 6:
					while(numClase!=-1) {
						System.out.println("Escoge una clase para calcular la media recaudada");
						System.out.println("Introduce -1 para salir");
						numClase=Leer.datoInt();
					if(numClase>0 && numClase<=clases.length) {
					porc=(clases[numClase-1]*dineroMedia)/cien;
					
						System.out.println("La recaudación de la clase "+numClase+ " es de un "+porc+"% respecto a la anterior");
					}
					else {
						System.out.println("Introduce un número de clase que exista");
					}
					}
					numClase=0;
					break;
				case 0:	
					num=0;
					System.out.println("Adiós");
				default:
					break;
			}
			
			
						
		}while(num!=0);
	}

}
