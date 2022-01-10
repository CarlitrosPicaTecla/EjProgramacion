package ej3;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radio;
		double altura;
		double volumen;
		
		System.out.println("Introduce radio:");
		radio=Leer.datoDouble();
		System.out.println("Introduce altura: ");
		altura=Leer.datoDouble();
		
		Cilindro c1=new Cilindro(radio,altura);
		
		volumen=c1.volumenCilindro(radio, altura);
		System.out.printf("El volumen del cilindro es de %.2fcm3",volumen);
	}

}
