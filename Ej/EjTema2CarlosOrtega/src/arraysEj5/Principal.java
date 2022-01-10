package arraysEj5;

import java.util.Random;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bienvenido a un programa sobre arrays en el que el usuario debe indicar el tamaña del array y el rango "
				+ "de numeros aleatorios con el que se rellnara el array");
		
		int tamanyo=0, desde=0, hasta=0, mayor=0,menor=1,suma=0;
		Random random=new Random(System.nanoTime());
		System.out.println("Introduce numero de posiciones del array");
		tamanyo=Leer.datoInt();
		int array[]=new int[tamanyo];
		
		System.out.println("Indique rango de numeros aleatorios para rellenar array");
		System.out.println("Desde: ");
		desde=Leer.datoInt();
		System.out.println("Hasta: ");
		hasta=Leer.datoInt();
		
		menor=hasta;
		
		for (int i = 0; i < array.length; i++) {
			array[i]=random.nextInt(hasta+1)+desde;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"| ");
		}
		for (int i = 0; i < array.length; i++) {
			suma=suma+array[i];
		}
		System.out.println();
		System.out.println("La suma del array es de "+suma);
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]>mayor) {
				mayor=array[i];
			}
		}
		for (int i = 0; i < array.length; i++) {
			if(array[i]<menor) {
				menor=array[i];
			}
		}
		System.out.println();
		System.out.println("El mayor es: "+mayor);
		System.out.println("El menor es: "+menor);
	}

}
