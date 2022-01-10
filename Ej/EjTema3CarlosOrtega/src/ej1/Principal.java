package ej1;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double area=0;
		double radio=0;
		
		System.out.println("Introduce radio del circulo");
		radio=Leer.datoDouble();
		
		Circulo c1=new Circulo(radio);
		
		area=c1.calcularCirculo(radio);
		
		System.out.printf("El area es: %.2fcm",area);
	}

}
