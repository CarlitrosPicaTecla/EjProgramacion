package ej13;

public class Ej13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double cocaCola=0.7, pipas=0.4, espada=150, cantidadCola=1, cantidadPipas=1, cantidadEspada=1, total=0;
		String cliente="Juan Nieves", pCola="Coca-Cola", pPipas="Pipas", pEspada="Espada Garra";
		total=cocaCola+pipas+espada;
		System.out.printf("Cliente: %s\n\n"
				+ "Producto     Cantidad     Precio"
				+ "\n\n%s      %.2f        %.2f€"
				+ "\n%s          %.2f        %.2f€"
				+ "\n%s   %.2f        %.2f€"
				+ "\n\n		           Total: %.2f€",cliente, pCola, cantidadCola, cocaCola,pPipas, cantidadPipas, pipas, pEspada, cantidadEspada,espada,total);
	}

}
