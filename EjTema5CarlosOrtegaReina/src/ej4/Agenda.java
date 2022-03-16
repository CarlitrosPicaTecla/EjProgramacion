package ej4;

import java.util.HashMap;
import java.util.Iterator;

public class Agenda {

	HashMap<Contacto, String> contactos;

	public Agenda(HashMap<Contacto, String> contactos) {
		super();
		this.contactos = contactos;
	}

	public HashMap<Contacto, String> getContactos() {
		return contactos;
	}

	public void setContactos(HashMap<Contacto, String> contactos) {
		this.contactos = contactos;
	}
	
	public Contacto buscarContacto(String nombre) {
		Iterator<Contacto> it = contactos.keySet().iterator();
		Contacto tmp=null;
		boolean encontrado = false;
		while(it.hasNext() && !encontrado) {
			tmp=it.next();
			if(tmp.getNombre().equalsIgnoreCase(nombre)) {
				encontrado = true;
				return tmp;
			}
		}
		return null;
	}
	
	public void anyadirContacto(Contacto c) {
		contactos.keySet().add(c);
	}
	
	public void borrarContacto(String nombre) {
		
		if(buscarContacto(nombre).getNombre().equalsIgnoreCase(nombre)) {

			contactos.remove(buscarContacto(nombre));
		}
		
	}
	
	public void modificarContacto() {
		
	}
	
	
}
