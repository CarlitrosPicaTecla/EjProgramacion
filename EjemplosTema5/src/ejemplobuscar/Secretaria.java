package ejemplobuscar;

import java.util.ArrayList;
import java.util.List;



public class Secretaria {

	
	List<Alumno>al= new ArrayList<Alumno>();

	public Secretaria(List<Alumno> al) {
		this.al = al;
	}

	public List<Alumno> getAl() {
		return al;
	}

	public void setAl(List<Alumno> al) {
		this.al = al;
	}
	
	public boolean agregAlumno(Alumno a) {
		return al.add(a);
	}
	
	public int buscarAlum(String dni) {
		int temp=-1;
		boolean salir = false;
		for (int i = 0; i < al.size() && !salir; i++) {
			if(al.get(i).getDni().equalsIgnoreCase(dni)) {
				temp=i;
				salir = true;
			}
		}
		return temp;
	}
	
	public Alumno buscarAlum2(String dni) {
		Alumno temp=null;
		boolean salir = false;
		for (int i = 0; i < al.size() && !salir; i++) {
			if(al.get(i).getDni().equalsIgnoreCase(dni)) {
				temp=al.get(i);
				salir = true;
			}
		}
		return temp;
	}
	
	public List<Alumno> buscarAlum3(String dni) {
		List<Alumno> listaAux = new ArrayList<Alumno>();

	
		for (int i = 0; i < al.size(); i++) {
			if(al.get(i).getDni().equalsIgnoreCase(dni)) {
				listaAux.add(al.get(i));
				
			}
		}
		return listaAux;
	}
	
	public void modificarAlumno(String dni, String nombreNuevo) {
		int index = buscarAlum(dni);
		
		if(index >=0) {
			al.get(index).setNombre(nombreNuevo);
		}
	}
	
} 
