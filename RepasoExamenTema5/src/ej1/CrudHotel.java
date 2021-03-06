package ej1;

import java.util.Iterator;
import java.util.Map;
import java.util.Optional;

public class CrudHotel {

	private Map<String, Habitacion> habitaciones;


	
	
	public CrudHotel(Map<String, Habitacion> habitaciones) {
		super();
		this.habitaciones = habitaciones;
	}




	public Map<String, Habitacion> getHabitaciones() {
		return habitaciones;
	}




	public void setHabitaciones(Map<String, Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}




	public Habitacion buscarHabitacion(String nombre) {
		Iterator<String> it=  habitaciones.keySet().iterator();
		boolean encontrado=false;
		String tmp=null;
		
		while(it.hasNext()&& !encontrado) {
			tmp=it.next();
			if(it.next().equalsIgnoreCase(nombre)) {
				encontrado = true;
				return habitaciones.get(tmp);
			}
				
			
		}
		return null;
	}
	
	public Optional<String> buscarOp(String id){
		Optional<String> op = Optional.empty();
		Iterator<String> it=  habitaciones.keySet().iterator();
	
		
		while(it.hasNext()) {
			op = Optional.ofNullable(it.next());
			if(op.isPresent() && it.next().equals(id)) {
				return op;
			}
		}
		return Optional.empty();
		
	}
	
	public void anyadirHabitacion(Habitacion h, String id) {
		habitaciones.put(id, h);
	}
	
	
	
	
	

}
