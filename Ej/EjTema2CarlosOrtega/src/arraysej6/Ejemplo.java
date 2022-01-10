package arraysej6;

import java.util.Iterator;
import java.util.Random;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lista[][]=new int[5][5];
		Random random=new Random(System.nanoTime());
		
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista.length; j++) {
				lista[i][j]=random.nextInt(20+1)+1;
			}
		}
		
		
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista.length; j++) {
				System.out.print(lista[i][j]+"|");
			}
			System.out.println();
		}
	}

}
