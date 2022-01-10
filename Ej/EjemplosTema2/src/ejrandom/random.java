package ejrandom;

import java.util.Random;

public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hasta=10, desde=0;
		Random num= new Random(System.nanoTime());
		int aleatorio=0;
		aleatorio=num.nextInt(hasta+1)+desde;
		System.out.println(aleatorio);
	}

}
