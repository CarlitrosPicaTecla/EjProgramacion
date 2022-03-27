package optional;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Gestion {
	
	Set<Usuario>usuarios;

	public Gestion(Set<Usuario> usuarios) {
		super();
		this.usuarios = usuarios;
	}

	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
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
			if(optionalUser.isPresent()&& !usuario.getId().equalsIgnoreCase("NO ID")) {
				System.out.println("ID: "+usuario.getId());
				System.out.println("Nombre: "+usuario.getNombre());
				System.out.println("E-mail: "+usuario.getEmail());
				System.out.println();
				
			}
		}
	}
	
	
	public void mostrarUsuariosNulos() {
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
	
	public Optional<Usuario> buscarOpt(String id){
		Optional<Usuario> optionalUser= Optional.empty();
		
		for (Usuario usuario : usuarios) {
			optionalUser= Optional.ofNullable(usuario);
			if(optionalUser.isPresent() && usuario.getId().equalsIgnoreCase(id)) {
				return optionalUser;
			}
		}
		
		return Optional.empty();
	}
	

	
}
