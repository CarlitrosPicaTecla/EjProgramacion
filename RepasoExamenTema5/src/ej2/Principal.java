package ej2;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Producto p;
			Map<Producto, String>productos = new HashMap<Producto, String>(); 
			
			
			CrudProducto cp= new CrudProducto(productos);
			
		
			
			cp.anyadirProducto(p=new Moviles("Movil", 2, 300, "Iphone", "X"), "1");
			cp.anyadirProducto(p=new Moviles("Movil", 5, 200, "POCO", "X3"), "2");
			cp.anyadirProducto(p=new EspadaLaser("Skywalker", 3, 175, "doble"), "3");
			
			System.out.println("lista normal");
			cp.mostrarProducto(21);
			System.out.println();
			SortedMap<Producto, String>smap=new TreeMap<Producto, String>();
			smap.putAll(productos);
			System.out.println();
			System.out.println("lista ordenada por cantidad");
			System.out.println(smap);
			System.out.println();
			System.out.println("lista ordenada por precio");
			System.out.println(cp.compararPrecio());
			System.out.println();
			System.out.println("lista de iguales");
			System.out.println(cp.nombreIgual("Movil"));
			
			System.out.println("lista con Entry");
			cp.mostrarMapa(productos);
			
			
			
			
	}
	

}
