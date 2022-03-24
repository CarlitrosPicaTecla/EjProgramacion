package optional;

import java.util.Optional;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Usuario u = null;
		
		Optional<Usuario> optionalUser= Optional.ofNullable(u);
	
		Usuario usuarioFinal = optionalUser.orElse(new Usuario("01", "Carlos", "carlos@gmail.com"));
		
		System.out.println(usuarioFinal);
		
		optionalUser.map(Usuario::getNombre).filter(Usuario -> Usuario.
	}

}
