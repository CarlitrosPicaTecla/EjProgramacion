package ej3;

import java.util.Iterator;
import java.util.Set;

public class Secretaria {
	private Set<Alumno> al;
	


	public Secretaria(Set<Alumno> al) {
		super();
		this.al = al;

	}

	public Set<Alumno> getAl() {
		return al;
	}

	public void setAl(Set<Alumno> al) {
		this.al = al;
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
		Iterator<Alumno> it= al.iterator();
		int suspendMark = 0;
		
		while(it.hasNext()) {
			if(it.next().getNota()<5) {
				suspendMark+=it.next().getNota();
			}
		}
		
		return suspendMark/al.size();
		
		
	}
}
