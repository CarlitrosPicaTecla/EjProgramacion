package ej1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Habitacion h;
		
		Map<String, Habitacion> habitaciones=new HashMap<String, Habitacion>();
		
		CrudHotel ch=new CrudHotel(habitaciones);
		
		ch.anyadirHabitacion(h=new Habitacion("Maylor", true, 10, 2, 12), "Humilde morada");
		ch.anyadirHabitacion(h=new Suite("Antonio", true, 15, 1, 30, 120, 100), "Maylor Suit");
		ch.anyadirHabitacion(h=new Suite("Manuel", true, 10, 4, 25, 45, 50), "San Pedro");
		ch.anyadirHabitacion(h=new Apartamento("Carlos", true, 5, 1, 15, 20), "Montellano");
		ch.anyadirHabitacion(h=new Apartamento("Mario", true, 9, 3, 16, 10), "Don Bosco");
		
		//ch.mostrarHabitaciones();
	
		SortedMap<String, Habitacion>ordena=new TreeMap<String, Habitacion>();
		
		System.out.println(habitaciones);
		
		
		System.out.println(ch.buscarOp("Humilde morada"));
	}

}
