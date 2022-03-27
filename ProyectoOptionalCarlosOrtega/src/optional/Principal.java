package optional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numMenu=0;
		String id="";

		Usuario u = null;
		Set<Usuario>usuarios= new HashSet<Usuario>();
		Gestion g = new Gestion(usuarios);
		g.anyadirUsuario(u);
		g.anyadirUsuario(u);
		g.anyadirUsuario(u);
		g.anyadirUsuario(u=new Usuario("01","Carlos", "carlos@gmail.com"));
		g.anyadirUsuario(u=new Usuario("02","Paco", "paco@gmail.com"));
		g.anyadirUsuario(u=new Usuario("03","Alex", "drago@gmail.com"));
		g.anyadirUsuario(u=new Usuario("04","Jose Armando", "jagui@gmail.com"));


		
		do {
			System.out.println("1.Mostrar Usuarios");
			System.out.println("2.Mostrar con nulos");
			System.out.println("3.Buscar Usuario");
			numMenu=Leer.datoInt();
			
			switch (numMenu) {
			case 1:
				g.mostrarUsuarios();
				break;
				
			case 2:
				g.mostrarUsuariosNulos();
				break;
				
			case 3:
				System.out.println("Introduce ID");
				id=Leer.dato();
				
					System.out.println(g.buscarOpt(id).map(Usuario::toString).orElse("No encontrado"));

				break;
			}
			
		} while (numMenu!=0);
		

	}
}
