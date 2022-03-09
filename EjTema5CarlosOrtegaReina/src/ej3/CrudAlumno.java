package ej3;

import java.util.Set;

public class CrudAlumno {

	private Set<Alumno> al;

	public CrudAlumno(Set<Alumno> al) {
		super();
		this.al = al;
	}

	public Set<Alumno> getAl() {
		return al;
	}

	public void setAl(Set<Alumno> al) {
		this.al = al;
	}
	
	
}
