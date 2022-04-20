package ejemplos;
import java.util.Scanner;

public class ejemplo1 {

	
	public static int dividir(int denominador, int numerador) {
		return numerador/denominador;
	}
	
	public static void comprobrarEdad(int edad) throws EdadNegativaExp{
		if(edad<0) {
			throw new EdadNegativaExp("No puede haber edad negativa");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String aux;
		int numerador=0, denominador=0, result=0, edad=0;


		try {
			
		aux=sc.nextLine();
		edad= Integer.parseInt(aux);
		comprobrarEdad(edad);
		}catch(EdadNegativaExp en) {
			System.out.println(en.getMessage());
		}
		
		/*
		try {
			  

		System.out.println("Introduce numerador");
		aux=sc.nextLine();
		numerador = Integer.parseInt(aux);
		System.out.println("Intoduce denominador");
		aux=sc.nextLine();
		denominador = Integer.parseInt(aux);
		
		result= dividir(denominador, numerador);
		
		System.out.println(result);
		}
		catch(ArithmeticException e) {
		  System.out.println("Las liao "+e);
		}catch(NumberFormatException e) {
			System.out.println("La has vuelto a liar "+e);
		}
		*/
	}
	

}
