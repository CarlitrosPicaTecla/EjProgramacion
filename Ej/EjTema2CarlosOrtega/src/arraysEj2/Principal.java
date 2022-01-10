package arraysEj2;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bienvenido a un programa que guarda en cada espacio del array el valor doble de su indice");
		
		int[] num= new int [10];
		int dos=2;
		
		for (int i = 0; i < num.length; i++) {
			
			num[i]=i*dos;
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" | ");
		}
	}

}
