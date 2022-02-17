package ej2;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numMenu=0, tam=4, i=0;
		
		double entregado=1000;
		double porc=10;
		
		
		Producto p[]= new Producto[tam];
		
		p[0]= new Movil("Galaxy X", "Samsung", 300, 1, true);
		p[1]= new EspadaLaser("Darth Maul", "Doble", 100, 2, false);
		p[2]= new Movil("X", "Iphone", 280, 1, false);
		p[3]= new Movil("X3", "POCO", 200, 1, false);
		
		Ventas v = new Ventas(p);
		
		
		do {
			System.out.println("1.Productos sin vender");
			System.out.println("2.Cantidad reacudada");
			System.out.println("3.Calcular cambio");
			System.out.println("4.Mostrar lista");
			numMenu=Leer.datoInt();
			
			switch (numMenu) {
			case 1:
				System.out.println("Cantidad de productos sin vender: "+v.sinVender());
				System.out.println();
				break;
			case 2:
				System.out.println("Total recaudado: "+v.totalRecaudaddo()+"€");
				System.out.println();
				break;
			case 3:
				
				
				System.out.println("Su cambio: "+v.calcularCambio(entregado, porc, i)+"€");
				System.out.println();
				;
				
				break;
			case 4:
				
				v.mostrarLista();
				
				break;

			default:
				break;
			}
			
			
		}while(numMenu!=0);
	}

}
