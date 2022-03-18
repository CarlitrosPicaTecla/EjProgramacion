package ejoptional;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno a;
		
		List<Alumno> lista = new ArrayList<Alumno>();
		
		lista.add(a=new Alumno(null, null, null, null, 0));
		lista.add(a=new Alumno(null, null, null, null, 0));
		lista.add(a=new Alumno("123456789d", "Carlos",  "1ºdam", "carlos@gmail.com", 8));
		
		CrudAlumno ca = new CrudAlumno(lista);
		
		
		ca.comprobarTodosNulos();
		ca.mostrarAlumnos();
	}

}
