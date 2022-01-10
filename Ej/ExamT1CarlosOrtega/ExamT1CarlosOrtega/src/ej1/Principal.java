package ej1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double altura=0, valor1=61.412, valor2=2.317, longitudTibia=40, tasaPorAnyo=0.06, edad=63, decFinal=0,
				edadDec=30, alturaFinal=0;
		int dia=8,mes=10,anyo=2021;
		String nombre="Sofia Reina";
		
		altura=valor1+valor2*longitudTibia;
		decFinal=(edad-edadDec)*tasaPorAnyo;
		alturaFinal=altura-decFinal;
		
		System.out.println("Bienvenido a un programa sobre el cálculo de la altura mediante la longitud"
				+ " de la tibia y el de decrecimiento de una persona por el paso de los años");
		
		System.out.printf("\nForenses Salesianos\t\t%d/%d/%d",dia,mes,anyo);
		System.out.printf("\n----------------------------------------------");
		System.out.printf("\nNombre: %s",nombre);
		System.out.printf("\nEdad: %.0f",edad);
		System.out.printf("\nLongitud de Tibia: %.2fcm",longitudTibia);
		System.out.printf("\nEstatura sin decrecimiento: %.2fcm",altura);
		System.out.printf("\nEstatura con decrecimiento: %.2fcm",alturaFinal);

		

		
	}

}
