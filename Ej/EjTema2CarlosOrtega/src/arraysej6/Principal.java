package arraysej6;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lista[][]=new int [4][5];
		int media=0;
		int suma=0;
		int tres=3;
		int cont=0;
		Random random=new Random(System.nanoTime());

		for (int i = 0; i < lista.length-1; i++) {
			for (int j = 0; j < lista.length+1; j++) {
				lista[i][j]=random.nextInt(20+1)+10;
			}
		}
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista.length+1; j++) {
				System.out.print("|"+lista[i][j]);
			}
			System.out.println();

		}

			
		for (int i = 0; i < lista.length+1; i++) {
			for (int j = 0; j < lista.length-1; j++) {
				suma+=lista[j][i];
			}
			media=suma/3;
			lista[lista.length-1][i]=media;
			media=0;
			suma=0;
		}
		
		
		System.out.println();
		
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista.length+1; j++) {
				System.out.print("|"+lista[i][j]);
			}
			System.out.println();

		}

	}

}
