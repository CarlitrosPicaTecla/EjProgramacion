package ej2;

import java.util.ArrayList;
import java.util.List;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numMenu=0;
		
		
		List<Socio>socios= new ArrayList<Socio>();
		
		CrudSocio cs = new CrudSocio(socios);
		
		do {
			System.out.println("1.Buscar Socio");
			System.out.println("2.Actualizar DNI");
			System.out.println("3.Actualizar nombre");
			System.out.println("4.Mostrar socios");
			numMenu=Leer.datoInt();
			
		} while (numMenu!=0);
		
	}

}
