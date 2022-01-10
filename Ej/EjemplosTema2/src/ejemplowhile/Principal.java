package ejemplowhile;

import ejemploLeer.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0, tope=0;
		tope=Leer.datoInt();
		while(n<tope) {
			n++;
			System.out.println(n);
		}
	}

}
