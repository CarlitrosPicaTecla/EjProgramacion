package ej2;

import java.util.ArrayList;
import java.util.List;

public class CrudSocio {

	
	List<Socio>socios= new ArrayList<Socio>();
	
	
	
	
	public CrudSocio(List<Socio> socios) {
		this.socios = socios;
	}
	
	
	public CrudSocio() {
		this.socios=new ArrayList<Socio>();
	}
	

	public void anyadirSocio(Socio s) {
		socios.add(s);
	}
	
	public void borrarSocio(String dni) {
		socios.removeIf(s->(s.getDni().equals(dni)));
	}
	
	public int buscarSocio(String dni) {
		for (Socio socio : socios) {
			if(socio.getDni().equalsIgnoreCase(dni)) {
				return socios.indexOf(socio);
			}
		}
		return -1;
	}
	
	public void actualizarDni(String dniNuevo, String dni) {
		
		socios.get(buscarSocio(dni)).setDni(dniNuevo);
		
	}
	
	public void actualizarNombre(String nombre, String dni) {
		socios.get(buscarSocio(dni)).setNombre(nombre);
	}
	
	public void mostrarSocios() {
		for (Socio socio : socios) {
			System.out.println();
			System.out.println("Nombre: "+ socio.getNombre());
			System.out.println("DNI: "+socio.getDni());
			System.out.println();
		}
	}
		
		public void mostrarSocio(int pos) {
			System.out.println();
			System.out.println("Nombre: "+socios.get(pos).getNombre());
			System.out.println("DNI: "+socios.get(pos).getDni());
			System.out.println();
		}
		
	
	
}
