package ej8;

public class Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*. Haz un programa que calcule la longitud de una circunferencia de radio 3 metros y el área 
			de un círculo de radio 5.2 metros.*/
		
		double longitud=0, radio1=3, radio2=5.2, area=5.2;
		
		longitud=2*Math.PI*radio1;
		area=Math.PI*Math.pow(radio2, 2);
		
		System.out.printf("Bienvenido a un programa del cálculo de la longitud de una circunferencia y el area de un circulo\n"
				+ "\nLa longitud de la circunferencia es de %.2fm\ny el area del circulo es de %.2fm",longitud ,area);
	}

}
