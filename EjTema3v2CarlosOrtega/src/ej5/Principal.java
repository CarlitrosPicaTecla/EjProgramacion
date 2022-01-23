package ej5;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Electrodomestico electrodomesticos[];
		Tienda t;
		int tam;
		int numMenu;
		int cont=0;
		System.out.println("Introduce la cantidad de electrodomesticos");
		tam=Leer.datoInt();
		electrodomesticos= new Electrodomestico[tam];
		Electrodomestico e= new Electrodomestico(100, "Blanco", 'F', 5);

		t=new Tienda(electrodomesticos);
		
		do {
			System.out.println("1.Almacenar electrodomestico");
			System.out.println("2.Mostrar precio total de electrodomestico");
			System.out.println("3.Mostrar precio de electrodomestico");
			System.out.println("4.Mostrar media de los productos");
			System.out.println("5.Mostrar Electrodomesticos");

			numMenu=Leer.datoInt();
			
			switch (numMenu) {
			case 1:
				String color;
				char consumo;
				double peso;
				
				System.out.println("Introduce color");
				color=Leer.dato();
				System.out.println("Introduce letra de consumo");
				consumo=Leer.datoChar();
				System.out.println("Introduce peso");
				peso=Leer.datoDouble();
				Electrodomestico j= new Electrodomestico(e.comprobarColor(color), e.comprobarConsumo(consumo),peso);

				t.addLista(cont,j);
			
				t.calcularSuma(cont);
				cont++;
				break;
			case 2:
				t.imprimirSumaPrecios();
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				for (int i = 0; i < electrodomesticos.length; i++) {
					t.imprimirLista(i, electrodomesticos);

				}
				break;

			default:
				break;
			}
		}while(numMenu!=0);
	}

}
