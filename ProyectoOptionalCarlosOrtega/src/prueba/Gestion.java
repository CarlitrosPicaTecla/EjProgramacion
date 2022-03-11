package prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Gestion {

	private List<Persona> l = new ArrayList<Persona>();
	
	public Gestion() {
	
	}

	public Gestion(List<Persona> l) {
		super();
		this.l = l;

	}
	
	public void cursoNulo(Persona p) {
		 Optional<String> op = Optional.ofNullable(p.getCurso());
		 
		 p.setCurso(op.orElse("Alumno"));

	}
	
	

}
