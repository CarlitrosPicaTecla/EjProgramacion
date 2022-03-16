package ej6;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Trabajador> trabajadores= new ArrayList<Trabajador>();

		Trabajador t;
		CrudTrabajador ct= new CrudTrabajador(trabajadores);
		
		
		ct.anyadirTrabajador(t= new Trabajador("Antonio","123456789",350));
		ct.anyadirTrabajador(t= new Trabajador("Maylor","321654987",550));
		ct.anyadirTrabajador(t= new Trabajador("LuisMi","789456123",250));
		ct.anyadirTrabajador(t= new Trabajador("Jero","987423156",50));
		ct.anyadirTrabajador(t= new Trabajador("Carlos","159753456",200));
		ct.anyadirTrabajador(t= new Trabajador("Paco","753357456",520));
		ct.anyadirTrabajador(t= new Trabajador("Antoñito","95115874",400));

		
	}

}
