package ej3;

import java.util.Iterator;
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
	
	
	public void addAlumno(Alumno a) {
		al.add(a);
	}
	
	public void removeAlumno(String dni) {
		Iterator<Alumno> it= al.iterator();
		if(it.next().getDni().equalsIgnoreCase(dni)) {
			it.remove();
		}
	}
	
	public void updateNota(String dni, int nota) {
		Iterator<Alumno> it= al.iterator();
		if(it.next().getDni().equalsIgnoreCase(dni)) {
			it.next().setNota(nota);
		}
	}
	
	public int averageMark() {
		Iterator<Alumno> it= al.iterator();
		int marks = 0;
		
		while(it.hasNext()) {
			marks+=it.next().getNota();
		}
		
		return marks/al.size();
	}
	
	public int suspendMark() {
		Iterator<Alumno> it= al.iterator();
		int suspend = 0;
		
		while(it.hasNext()) {
			if(it.next().getNota()<5) {
				suspend++;
			}
		}
		
		return suspend;
	}
	
	public int averageSuspendMark() {
		int suspendMark = 0;
		Iterator<Alumno> it= al.iterator();
		while(it.hasNext()) {
			if(it.next().getNota()<5) {
				suspendMark+=it.next().getNota();
			}
		}
		
		return suspendMark/al.size();
		
		
	}
	
}
