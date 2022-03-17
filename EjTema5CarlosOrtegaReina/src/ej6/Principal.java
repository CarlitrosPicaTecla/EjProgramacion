package ej6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Trabajador> trabajadores= new ArrayList<Trabajador>();

		CompararSueldo cs;
		Trabajador t;
		CrudTrabajador ct= new CrudTrabajador(trabajadores);
		
		
		ct.anyadirTrabajador(t= new Trabajador("Antonio","123456789",200));
		ct.anyadirTrabajador(t= new Trabajador("Maylor","321654987",150));
		ct.anyadirTrabajador(t= new Trabajador("LuisMi","789456123",120));
		ct.anyadirTrabajador(t= new Trabajador("Jero","987423156",180));
		ct.anyadirTrabajador(t= new Trabajador("Carlos","159753456",200));
		ct.anyadirTrabajador(t= new Trabajador("Paco","753357456",150));
		ct.anyadirTrabajador(t= new Trabajador("Antoñito","95115874",100));

		ct.mostrarLista();
		System.out.println();
		Collections.sort(trabajadores);
		ct.mostrarLista();
		System.out.println();
		
		Collections.sort(trabajadores, new CompararSueldo());
		ct.mostrarLista();
	
	}

}
