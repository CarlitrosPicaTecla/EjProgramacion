package ej4;

import java.util.Iterator;
import java.util.Map;
public class Agenda {

	private Map<Contacto, String> contactos;

	public Agenda(Map<Contacto, String> contactos) {
		super();
		this.contactos = contactos;
	}

	public Map<Contacto, String> getContactos() {
		return contactos;
	}

	public void setContactos(Map<Contacto, String> contactos) {
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
	
	public void anyadirContacto(Contacto c, String tlf) {
		contactos.put(c, tlf);
	}
	
	public void borrarContacto(String nombre) {
		
			contactos.remove(buscarContacto(nombre));
		
		
		
	}
	
	public void modificarContacto(String nombre) {
		
		buscarContacto(nombre).setNombre(nombre);
	}
	
	public void mostrarAgenda() {
		Iterator<Contacto> it= contactos.keySet().iterator();
		while(it.hasNext()) {
			System.out.println();
			System.out.println(it.next().getNombre());
			System.out.println(contactos.get(it));
			System.out.println();
		}
	}
	
	
	
}
