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
	
	public void actualizarDni(String dni) {
		
		socios.get(buscarSocio(dni)).setDni(dni);
		
	}
	
	public void actualizarNombre(String nombre, String dni) {
		socios.get(buscarSocio(dni)).setNombre(nombre);
	}
}
