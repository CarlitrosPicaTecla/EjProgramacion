package ej2;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=0;
		
		System.out.println("Introduce numero");
		num1=Leer.datoInt();
		
		Operaciones op1=new Operaciones();
		
		System.out.println(	op1.posNeg(num1));
		System.out.println(	op1.parImapr(num1));
	}

}
