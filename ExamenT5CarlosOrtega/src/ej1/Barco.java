package ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Barco  {

	private int id;
	private String nombre;
	private int capacidadCarga;
	
	List<Coche>coches;

	public Barco(int id, String nombre, int capacidadCarga, List<Coche> coches) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.capacidadCarga = capacidadCarga;
		this.coches = coches;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	public List<Coche> getCoches() {
		return coches;
	}

	public void setCoches(List<Coche> coches) {
		this.coches = coches;
	}
	
	public void anyadirCoche(Coche c) {
		coches.add(c);
	}
	
	public Coche buscarCoche(String matricula) {
		Iterator<Coche>it = coches.iterator();
		boolean encontrado=false;
		Coche tmp = null;
		while(it.hasNext() && !encontrado) {
			tmp= it.next();
			
			if(tmp.getMatricula().equalsIgnoreCase(matricula)) {
				encontrado=true;
				return tmp;
				
			}
		}
		
		return null;
	}
	

	public void modificarCoche(String matricula, String colorNuevo) {
		
		buscarCoche(matricula).setColor(colorNuevo);
	
	}
	

	
	
	public List<Coche>mismaMarca(String nombre){
		List<Coche>lista= new ArrayList<Coche>();
		Iterator<Coche>it = coches.iterator();
		Coche tmp=null;
		
		while(it.hasNext()) {
			tmp=it.next();
			if(tmp.getMarca().equalsIgnoreCase(nombre)) {
				lista.add(tmp);
			}
		}
		
		return lista;
		
		}
	
	public Coche buscarCocheCaro() {
		Iterator<Coche>it = coches.iterator();
		double aux=0;
		Coche tmp = null;
		while(it.hasNext()) {
			tmp= it.next();
			
			if(it.next().getPrecio()>aux) {
				
				tmp=it.next();
				
			}
		}
		
		return tmp;
	}
		
	
	public void ordenAlfabetico() {
		Collections.sort(coches, new OrdenAlfabetico());
	}
	
	public void ordenNatural() {
		Collections.sort(coches);
	}
	
	public void mostrarLista() {
		Iterator<Coche>it = coches.iterator();
		while(it.hasNext()) {
			System.out.println();
			System.out.println("Matricula: "+it.next().getMatricula());
			System.out.println("Marca: "+it.next().getMarca());
			System.out.println("Modelo: "+it.next().getModelo());
			System.out.println("Color: "+it.next().getColor());
			System.out.println("Precio: "+it.next().getPrecio());
			System.out.println();
		}
	}
	
	public double totalRecaudado(String marca) {
		double total=0;
		for (Coche coche : coches) {
			
			if(coche.getMarca().equalsIgnoreCase(marca)) {
			total+=coche.getPrecio();
			}
		}
		return total;
	}
	
}
