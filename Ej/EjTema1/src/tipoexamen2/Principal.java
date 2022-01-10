package tipoexamen2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double espacioInicial=5.5, velocidad=3.2, tiempo=2, espacio=0;
		
		espacio=espacioInicial+(velocidad*tiempo);
		
		System.out.println("Bienvenido a un programa del calculo del recorrido de una zapatilla lanzada por"
				+ " una madre");

		System.out.printf("\nEl espacio inicial es de %.2fm\nLa velocidad de la zapatilla es de %.2fm/s"
				+ "\nEn un tiempo de %.2fs\nEl recorrido total es de %.2f",espacioInicial, velocidad, tiempo,espacio);
		
		
		
		
	}

}
