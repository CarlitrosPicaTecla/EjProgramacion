package arraysEj4;
import java.util.Random;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bienvenido a un programa que consiste en un array que se rellena de forma aleatoria y ahora al que "
				+ "le pedimos al usuario que introduzca numeros para mostrar la posicion de array");
		
		int[] num=new int[10];
		int desde=0, hasta=99, pos=1; 
		Random random=new Random(System.nanoTime());
		
		 for (int i = 0; i < num.length; i++) {
			
			 num[i]=random.nextInt(hasta+1)+desde;
		}
		 
		 for (int i = 0; pos > 0; i++) {
			System.out.println("Introduce posicion a mostrar");
			pos=Leer.datoInt();
			if(pos<=10 && pos>0) {
				System.out.println(num[pos-1]);

			}
			else {
				System.out.println("No existe esa posicion");
			}
		}
		
		
	}

}
