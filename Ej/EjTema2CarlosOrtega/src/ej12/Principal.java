package ej12;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int asignaturas=6, suspensos=0;
		double nota=0,media=0;
		
		System.out.println("Introduce las notas del alumno para calcular su media");
		
		for (int i = 1; i <=asignaturas ; i++) {
			System.out.println("Introduce nota de asignatura "+i);
			nota=Leer.datoDouble();
			
			if(nota<5) suspensos++;
			media=media+nota;
			
		}
			media=media/asignaturas;
			
			System.out.printf("La nota media del alumno es de %.1f y tiene %d suspensos",media, suspensos);
	}

}
