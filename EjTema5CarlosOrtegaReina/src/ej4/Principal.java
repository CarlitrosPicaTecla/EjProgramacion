package ej4;

import java.util.HashMap;
import java.util.Map;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numMenu=0;
		
		String nombre=null, tlf=null;
		
		
		Map<Contacto, String> contactos= new HashMap<Contacto, String>();
		Agenda a = new Agenda(contactos);
		
		
		do {
			System.out.println("1.Añadir contacto");
			System.out.println("2.Eliminar contacto");
			System.out.println("3.Modificar contacto");
			System.out.println("4.Buscar contacto");
			System.out.println("5.Mostrar lista contactos");
			numMenu=Leer.datoInt();
			
			switch (numMenu) {
			case 1:
				
				System.out.println("Introduce nombre");
				nombre=Leer.dato();
				System.out.println("Introduce telefono");
				tlf=Leer.dato();
				a.anyadirContacto(new Contacto(nombre),tlf);
				break;
			case 2:
				System.out.println("Introduce nombre");
				nombre=Leer.dato();
				a.borrarContacto(nombre);
				break;
			case 3:
				System.out.println("Introduce nuevo nombre");
				nombre=Leer.dato();
				a.modificarContacto(nombre);
				break;
			case 4:
				System.out.println("Introduce nombre para buscar");
				nombre=Leer.dato();
				a.buscarContacto(nombre);
				System.out.println(a);
				break;
			case 5:
				a.mostrarAgenda();
				break;
			
			}
			
		} while (numMenu!=0);
	}

}
