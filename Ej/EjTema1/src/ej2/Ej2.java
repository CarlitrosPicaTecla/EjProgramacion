package ej2;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double largo=50;
		double ancho=21;
		double profundidad=2.5;
		double precio=1.8;
		double area=0;
		double resultado=0;
		double volumen=0;
		
		area=largo*ancho;
		volumen=area*profundidad;
		resultado=volumen*precio;
		
		System.out.printf("El area de la piscina es de: %.2fm2 ",area);
		System.out.printf("\nPrecio final: %.2f€: ",resultado);
	}

}
