package ej12;

public class Ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double intensidad=0, resistencia=20, tension=250, K=Math.pow(10, 3);
		intensidad=tension/(resistencia*K);
		System.out.printf("La intensidad es de %.2f",intensidad);
	}

}
