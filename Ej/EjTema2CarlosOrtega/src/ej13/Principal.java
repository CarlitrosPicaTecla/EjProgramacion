package ej13;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int horas=0, horasNormales=40, horasExtra=0;
		double pago=16, pagoExtra=20,cobro=0, cobroExtra=0;
		
		System.out.println("Introduce el numero de horas trabajadas");
		horas=Leer.datoInt();
		
		if(horas<=horasNormales) {
			cobro=horas*pago;
		}
		else {
			cobroExtra=(horas-horasNormales)*pagoExtra;
			cobro=(horasNormales*pago)+cobroExtra;
			
		}
		
		System.out.printf("El trabajador a trabajado %dh, pasara a ganar %.2f€",horas,cobro);
	}

}
