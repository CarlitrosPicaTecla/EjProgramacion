package ej2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class CrudProducto {

	private Map<Producto, String>productos;

	public CrudProducto(Map<Producto, String> productos) {
		super();
		this.productos = productos;
	}

	public Map<Producto, String> getProductos() {
		return productos;
	}

	public void setProductos(Map<Producto, String> productos) {
		this.productos = productos;
	}
	
	public void anyadirProducto(Producto p, String n) {
		productos.put(p, n);
	}
	
	public double calcularPVP(Producto p,double descuento) {
		return p.calcularPVP(descuento);
	}
	
	public double calcularTotal(double descuento) {
		double total=0;
		
		Iterator<Producto>it = productos.keySet().iterator();
		while(it.hasNext()) {
			total+=it.next().calcularPVP(descuento);
		}
		
		return total;
	}
	
	public void mostrarProducto(double descuento) {
		Iterator<Producto>it = productos.keySet().iterator();

		System.out.printf("NOMBRE\t\t      UNIDADES\t      PRECIO BASE\tPRECIO");
		System.out.println();
		while(it.hasNext()) {
			it.next().mostrarProdcto(descuento);
		}
		System.out.println();
		System.out.printf("\nPrecio: %.2f € ",calcularTotal(descuento));
		
	}
	
	public SortedMap<Producto, String> compararPrecio() {
		SortedMap<Producto, String>pmap=new TreeMap<Producto, String>(new CompararSueldo());
		pmap.putAll(productos);
		return pmap;
	}
	
	public List<Producto>nombreIgual(String nombre){
		List<Producto> lista = new ArrayList<Producto>();
		Producto p;
		Iterator<Producto> it= productos.keySet().iterator();
		while(it.hasNext()) {
			p=it.next();
			if(p.getNombre().equalsIgnoreCase(nombre)) {
				lista.add(p);
			}
		}
		
		return lista;
		
	}
	
	public void mostrarMapa(Map<Producto, String>mapa) {
		for (Map.Entry<Producto, String> entry : mapa.entrySet()) {
		Producto key = entry.getKey();
		String value = entry.getValue();
		System.out.print(value);
		key.mostrarProdcto(20);
		}
	}
}
