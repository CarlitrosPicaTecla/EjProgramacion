package arraysEj3;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bienvenido a un programa que consiste en rellenar por teclado las posiciones 1 a 1 de un array "
				+ "y imprimir su media y cuantos ceros hay");
		
		double[] num=new double[8];
		double suma=0.0,media=0.0, div=num.length;
		int cont=0;
		int cero=0;
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("Introduce numero en posicion: "+(i+1));
			num[i]=Leer.datoDouble();

		}
		for (int i = 0; i < num.length; i++) {
			if(num[i]==cero) {
				cont++;
			}
				
		}
		for (int i = 0; i < num.length; i++) {
			
			suma=suma+num[i];
		}
		media=suma/div;
		System.out.println("La media es: "+media);
		System.out.printf("\nHay %d ceros",cont);
	}

}
