package ej1;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int id=0;
		double coste=0;
		double radio=0.0;
		double altura=0.0;
		double litrosDeposito = 0;
		GestionPlataforma g=new GestionPlataforma();
		Deposito deposito= new Deposito(id,altura,radio,coste);
		int numMenu;
		int litros[]=new int[7];
		int desde=0;
		int cont=0;
		double precio=100;
		double precioTotal;
		double media;

		do {
			System.out.println("1.Generar deposito");
			System.out.println("2.Calcular volumen de deposito");
			System.out.println("3.Generar litros semnales");
			System.out.println("4.Calcular precio de venta");
			System.out.println("5.Imprimir datos");
			System.out.println("6.Calcular media de litros");
			numMenu=Leer.datoInt();
			
			
			switch (numMenu) {
			case 1:
				System.out.println("Introduce ID: ");
				id=Leer.datoInt();
				deposito.setId(id);
				System.out.println("Introduce altura: ");
				altura=Leer.datoDouble();
				deposito.setAltura(altura);
				System.out.println("Introduce radio: ");
				radio=Leer.datoDouble();
				deposito.setRadio(radio);
				System.out.println("Introduce coste: ");
				coste=Leer.datoDouble();
				deposito.setPrecio(coste);
				
				g.setDeposito(deposito);

				
				break;
			case 2:
				
				litrosDeposito=g.calcularVolumen(g);
				System.out.println("La capacidad del deposito es de: "+litrosDeposito+"L");
				
				break;
			case 3:
				System.out.println("Rellenando lista de litros semanales");
				for (int i = 0; i < litros.length;) {
					g.rellenarArray(litrosDeposito, desde, litros, i);
					i++;
				}
				
				break;
			case 4:
				System.out.println("Calculando precio total de venta");
				precioTotal=g.calcularPrecioVenta(precio, g);
				System.out.println("El precio de venta es de: "+precioTotal);
				
				break;
			case 5:
				g.imprimirDeposito(g);
				break;
			case 6:
				media=g.mediaLitros(g);
				System.out.println("La media es de: "+media);
				break;

			default:
				break;
			}
		}while(numMenu!=0);
		
		
		
		
	}

}
