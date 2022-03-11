package prueba;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Persona> l = new ArrayList<Persona>();
		l.add(new Persona("Carlos", "1ºDAM"));
		l.add(new Persona("Paco", null));
		l.add(new Persona("Luis", null));



		
		Gestion g = new Gestion(l);
		
		g.cursoNulo(l.get(1));
		
		System.out.println(l);
	}

}
