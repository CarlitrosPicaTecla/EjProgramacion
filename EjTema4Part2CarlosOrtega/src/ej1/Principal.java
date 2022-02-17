package ej1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double sueldo=1000, iva=21, precio=23.5;
		Trabajador t = new Trabajador();
		Producto p = new Producto();
		
		System.out.println(t.calculoIrpf(sueldo));
		System.out.println(p.calculoIva(precio, iva));
	
		
	}

}
