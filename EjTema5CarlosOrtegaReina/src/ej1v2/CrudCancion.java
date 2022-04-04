package ej1v2;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Optional;
import java.util.Set;

public class CrudCancion {

	
	Set<Cancion>lista;

	public CrudCancion(Set<Cancion> lista) {

		this.lista = lista;
	}

	public Set<Cancion> getLista() {
		return lista;
	}

	public void setLista(Set<Cancion> lista) {
		this.lista = lista;
	}
	
	public Optional<Cancion> buscarCancionNombre(String nombre) {
		
		return Optional.ofNullable(lista.stream()
		.filter(cancion->cancion.getNombre().equalsIgnoreCase(nombre))
		.findAny()
		.get());
	}
	
	public Optional<Cancion> buscarCancionDuracion(Duration duracion) {
		
		return Optional.ofNullable(lista.stream()
		.filter(cancion->cancion.getDuracion().equals(duracion))
		.findAny()
		.get());
	}
	
	public Optional<Cancion> buscarCancionAutor(String autor) {
		
		return Optional.ofNullable(lista.stream()
		.filter(cancion->cancion.getAutor().equalsIgnoreCase(autor))
		.findAny()
		.get());
	}
	
	
	public int nCancionesGenero(String genero) {
		
		int nGeneros=(int) lista.stream()
		.filter(cancion->cancion.getGenero().equalsIgnoreCase(genero))
		.count();
		
		return nGeneros;
	}
	
	
	/*public void duracionMayor(Duration duracion) {
		lista.stream()
		.filter(cancion->cancion.getDuracion()>duracion)
		.toString();
	}*/
	
	
	
	
}
