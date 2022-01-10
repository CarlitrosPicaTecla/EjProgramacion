package ej4;

public class Copiado {

	String palabra;
	
	
	public Copiado(String palabra) {
		this.palabra = palabra;
	}


	public String getPalabra() {
		return palabra;
	}


	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	
	public String repetirTexto(String palabra, int num) {
		int cont=0;
		String resultado = "";
		while(cont<num) {
			resultado=resultado+palabra;
			cont++;
		}
		return resultado;
		
	}
	
	
}
