package ej2;

import java.util.ArrayList;
import java.util.List;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numMenu=0;
		String dni;
		String nombre;
		String dniNuevo;
		String nombreNuevo;
		
		
		List<Socio>socios= new ArrayList<Socio>();
		socios.add(new Socio("Carlos", "123456789P"));
		socios.add(new Socio("Paco", "987654321C"));
		socios.add(new Socio("Manuel", "123789456L"));
		socios.add(new Socio("Javier", "369258147K"));
		CrudSocio cs = new CrudSocio(socios);
		
		do {
			System.out.println("1.Buscar Socio");
			System.out.println("2.Actualizar DNI");
			System.out.println("3.Actualizar nombre");
			System.out.println("4.Mostrar socios");
			numMenu=Leer.datoInt();
			
			switch (numMenu) {
			case 1:
				System.out.println("Introduce DNI para buscar");
				dni=Leer.dato();
				cs.mostrarSocio(cs.buscarSocio(dni));
				break;
			case 2:
				System.out.println("Introduce DNI cliente");
				dni=Leer.dato();
				System.out.println("Introduce DNI nuevo");
				dniNuevo=Leer.dato();
				cs.actualizarDni(dniNuevo, dni);
				break;
			case 3:
				System.out.println("Introduce DNI para actualizar");
				dni=Leer.dato();
				System.out.println("Introduce nuevo nombre");
				nombre=Leer.dato();
				cs.actualizarNombre(nombre, dni);
				break;
			case 4:
				cs.mostrarSocios();
				break;

			default:
				break;
			}
			
		} while (numMenu!=0);
		
	}

}
