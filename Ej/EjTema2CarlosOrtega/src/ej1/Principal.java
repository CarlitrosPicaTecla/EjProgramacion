package ej1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num1=0, num2=0;
		System.out.println("Introduce primer numero: ");
		num1=sc.nextInt();
		System.out.println("Introduce segundo numero");
		num2=sc.nextInt();
		
		if(num1>num2) {
			System.out.println("El numero 1 es mayor al numero 2");
		}
			else if(num1<num2) {
				System.out.println("El numero 2 es mayor al numero 1");
			}
				else {
					System.out.println("Los numero son iguales");
				}
		
		
		
	}

}
