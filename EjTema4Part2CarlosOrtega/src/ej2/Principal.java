package ej2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int tam=10, hasta=99, desde=0;
		int i=0;
		
		int num[]= new int[tam];
		
		ArrayReales a = new ArrayReales(num);
		
		a.generarAleatorio(hasta,desde);
		
		a.mostrarArray();
		
		System.out.println("Maximo: "+a.calcularMaximo());

		System.out.println("Minimo: "+a.calcularMinimo());
		
		System.out.println("Total: "+a.calcularSumatorio());
		
	}

}
