package ej2;

public class Operaciones {

	
	
	public String posNeg(int num) {
		String resultado;
		
		if(num>0) {
			resultado="Positivo";
		}
		else {
			resultado="Negativo";
		}
		return resultado;
	}
	
	
	public String parImapr(int num) {
		String resultado;
		if(num%2==0) {
			resultado="Par";
		}
		else {
			resultado="Impar";
		}
		return resultado;
	}
}
