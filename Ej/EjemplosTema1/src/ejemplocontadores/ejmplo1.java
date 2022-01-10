package ejemplocontadores;

public class ejmplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double saldo=100, reintegro=50, resultado=0;
		
		resultado=saldo-reintegro;
		
		System.out.printf("Tienes %.2f, sacas %.2f ", saldo, reintegro);
		
		saldo-=reintegro;
		
		System.out.printf("\nTu nuevo saldo es de: %.2f ", saldo);

		
		
	}

}
