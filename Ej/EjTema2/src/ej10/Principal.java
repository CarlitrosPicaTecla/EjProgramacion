package ej10;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0,fact=1;
		
		System.out.println("Inserte numero para calcular su factorial");
		num=Leer.datoInt();
		
		for (int i = num; i >0 ; i--) {
			
			fact=fact*i;
		}
		
		System.out.printf("El factorial de %d es %d",num,fact);
		
	}

}
