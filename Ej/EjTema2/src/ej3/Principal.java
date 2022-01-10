package ej3;
import lectura.Leer;

public class Principal {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dinero=200, retirar=0;
		System.out.println("Introduce cantidad a retirar");
		retirar=Leer.datoDouble();
		
		if(retirar<=dinero) {
			dinero=dinero-retirar;
			System.out.printf("\nRetiraste %.2f€\nTe quedan: %.2f€",retirar,dinero);
		}
		
		else {
			System.out.println("Error, no tienes esa cantidad para retirar");
		}
	}

}
