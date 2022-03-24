package optional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numMenu=0;

		Usuario u = null;
		List<Usuario>usuarios= new ArrayList<Usuario>();
		Gestion g = new Gestion(usuarios);
		g.anyadirUsuario(u);
		g.anyadirUsuario(u);
		g.anyadirUsuario(u=new Usuario("01","Carlos", "tucu@gmail.com"));
		g.anyadirUsuario(u=new Usuario("02","Paco", "paco@gmail.com"));
		
		
		
		
		do {
			System.out.println("1.Mostrar Usuarios");
			numMenu=Leer.datoInt();
			
			switch (numMenu) {
			case 1:
				g.mostrarUsuarios();
				break;
			}
			
		} while (numMenu!=0);
		
	
	
		

		
	
		
		//Optional<Usuario> optionalUser= Optional.ofNullable(u);
	
		//Usuario usuarioFinal = optionalUser.orElse(new Usuario("01", "Carlos", "carlos@gmail.com"));
		
		//System.out.println(usuarioFinal.getNombre());
		
		//optionalUser.map(Usuario::getNombre).filter(Usuario -> Usuario.
	}

}
