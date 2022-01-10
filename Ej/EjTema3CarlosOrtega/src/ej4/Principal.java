package ej4;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		String texto;
		
		System.out.println("Introduce un texto");
		texto=Leer.dato();
		System.out.println("Introduce cuantas veces quiere que se repita el texto");
		num=Leer.datoInt();
		
		Copiado c1=new Copiado(texto);
		
		System.out.println(c1.repetirTexto(texto, num));
	}

}
