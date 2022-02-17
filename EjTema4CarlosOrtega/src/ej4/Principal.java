package ej4;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numMenu=0, i=0, tam=4;
		
		LineaVenta l[]=new LineaVenta[tam];

		
		l[0]= new LineaVenta(new Alimentacion(1, 2.5, "Galletas Maria", 60), 2);
		l[1]= new LineaVenta(new Alimentacion(2, 1.5, "Monster Energy", 1), 10);
		l[2]= new LineaVenta(new Electronica(20,3,200,"Samsumg TV"), 1);
		l[3]= new LineaVenta(new Electronica(20, 4, 900,"RTX 2080Ti"), 3);
		Producto p;
		Venta v=new Venta(l);
		
		v.imprimirTicket(0);
		

		
		
	}

}
