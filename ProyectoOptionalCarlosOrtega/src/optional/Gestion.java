package optional;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Gestion {
	
	List<Usuario>usuarios;

	public Gestion(List<Usuario> usuarios) {
		super();
		this.usuarios = usuarios;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	
	public void anyadirUsuario(Usuario u) {
		Optional<Usuario> optionalUser= Optional.ofNullable(u);
		Usuario tmp = optionalUser.orElse(new Usuario("NO ID", "NO NAME", "NO MAIL"));
		usuarios.add(tmp);
	}
	
	public void mostrarUsuarios() {
		Optional<Usuario> optionalUser;
		
		for (Usuario usuario : usuarios) {
			optionalUser= Optional.ofNullable(usuario);
			if(optionalUser.isPresent()) {
				System.out.println("ID: "+usuario.getId());
				System.out.println("Nombre: "+usuario.getNombre());
				System.out.println("E-mail: "+usuario.getEmail());
				System.out.println();
				
			}
		}
	}
	
}
