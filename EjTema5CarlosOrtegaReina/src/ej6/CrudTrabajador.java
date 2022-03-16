package ej6;

import java.util.List;

public class CrudTrabajador {

	List<Trabajador> trabajadores;

	public CrudTrabajador(List<Trabajador> trabajadores) {
		super();
		this.trabajadores = trabajadores;
	}

	public List<Trabajador> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(List<Trabajador> trabajadores) {
		this.trabajadores = trabajadores;
	}
	
	public void anyadirTrabajador(Trabajador t) {
		trabajadores.add(t);
	}
}
