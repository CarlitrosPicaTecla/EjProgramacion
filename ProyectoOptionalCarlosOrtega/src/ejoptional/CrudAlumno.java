package ejoptional;

import java.util.ArrayList;
import java.util.List;

public class CrudAlumno {

	List <Alumno>alumnos;
	


	public CrudAlumno(List<Alumno> alumnos) {
		super();
		this.alumnos = alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	
	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public void comprobarNulos(Alumno p) {
		p.getNombre().map(String::toLowerCase).orElse("Nombre sin rellenar");
		p.getDni().map(String::toLowerCase).orElse("DNI sin rellenar");
		p.getCurso().map(String::toLowerCase).orElse("sin curso");
		p.getEmail().map(String::toLowerCase).orElse("E-mail sin rellenar");
	}
	
	
	public void comprobarTodosNulos() {
		for (int i = 0; i < alumnos.size(); i++) {
			comprobarNulos(alumnos.get(i));
		}
		
	}
	
	public void mostrarAlumnos() {
		for (int i = 0; i < alumnos.size(); i++) {
			System.out.println("DNI: "+alumnos.get(i).getDni());
			System.out.println("Nombre: "+alumnos.get(i).getNombre());
			System.out.println("Curso: "+alumnos.get(i).getCurso());
			System.out.println("E-Mail"+alumnos.get(i).getEmail());
			System.out.println("Media: "+alumnos.get(i).getNotaMedia());


		}
	}
}
