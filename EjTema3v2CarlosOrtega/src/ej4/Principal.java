package ej4;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente clientes[];
		Gimnasio g;
		Cliente cliente;
		
		int tam;
		int numMenu;
		
		String nombre;
		String dni;
		double peso;
		double altura;
		int i=0;
		
		double imcMedia;
		
		System.out.println("Introduce la cantidad de clientes");

		tam=Leer.datoInt();
		clientes= new Cliente[tam];
		g= new Gimnasio(clientes);
		
		
		do {
			System.out.println("1.Añadir cliente");
			System.out.println("2.Eliminar cliente");
			System.out.println("3.Mostrar clientes");
			System.out.println("4.Calcular IMC");
			System.out.println("5.Calcular media IMC");
			System.out.println("6.Mostrar lista clientes");
			numMenu=Leer.datoInt();
			
			switch (numMenu) {
			case 1:
				
				System.out.println("Introduce nombre: ");
				nombre=Leer.dato();
				System.out.println("Introduce DNI: ");
				dni=Leer.dato();
				System.out.println("Introduce peso: ");
				peso=Leer.datoDouble();
				System.out.println("Introduce altura: ");
				altura=Leer.datoDouble();

				cliente= new Cliente(nombre, dni, peso, altura, true);
				g.addCliente(cliente, i);
				i++;
				
				break;
			case 2:
				String dniBorrar;
				System.out.println("Introduce DNI para eliminar un usuario");
				dniBorrar=Leer.dato();
				
				for (int j = 0; j < 1; j++) {
					if(g.clientes[j].getDni().equals(dniBorrar)) {
						g.removeCliente(j);
					}
					else {
						System.out.println("Cliente no existente");
					}

				}
				break;
			case 3:
				int tope=0;
				String dniBusca;
				System.out.println("Introduce DNI para imprimir cliente");
				dniBusca=Leer.dato();
				
					for (int j = 0; j < 1; j++) {
						
						if(g.clientes[j].getDni().equals(dniBusca)) {
							g.imprimirCliente(g, j);
						}
						else {
							System.out.println("Cliente no existente");
						}
						

				}
				break;
			case 4:
				System.out.println("Introduce DNI para calcular IMC");
				
				g.calcularIMC(g, i);
				break;
			case 5:
				double suma=0;
				for (int j = 0; j < clientes.length; j++) {
					suma=suma+g.calcularIMC(g, j);
				}
				
				imcMedia=suma/clientes.length;
				System.out.println("La media de IMC es de: "+imcMedia);

				break;
			case 6:
				for (int f = 0; f < clientes.length; f++) {
					g.imprimirCliente(g, f);

				}
				
				break;

			default:
				break;
			}
		}while(numMenu!=0);
	}

}
