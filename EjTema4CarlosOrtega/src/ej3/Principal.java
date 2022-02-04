package ej3;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		/*Vehiculo vPrueba= new Vehiculo("Toyota","Corolla",2000, 110, 2);
		Turismo tPrueba= new Turismo("Seat", "Ibiza",1900, 105,2);
		Motocicleta mPrueba= new Motocicleta("KTM","Duke R", 890, 120, 1);
		Furgoneta fPrueba= new Furgoneta("Man","TGE",2000, 110,2);
		
		fPrueba.calcularImpuesto(100);*/
		
		Vehiculo lista[]=new Vehiculo[3];
		Vehiculo v;
		Dgt d= new Dgt(lista);
		
		int numMenu;
		int cont=0;
		
		String modelo, marca;
		double cv, cc;
		int combustible;
		
		do {
			System.out.println("1.Añadir Turismo");
			System.out.println("2.Añadir Motocicleta");
			System.out.println("3.Añadir Furgoneta");
			System.out.println("4.Calcular impuesto de circulacion");
			System.out.println("5.Mostrar lista de vehiculos");
			numMenu=Leer.datoInt();
			
			 switch (numMenu) {
			case 1:
				System.out.println("Introduce marca");
				marca=Leer.dato();
				System.out.println("Introduce modelo");
				modelo=Leer.dato();
				System.out.println("Introduce cilindrada");
				cc=Leer.datoDouble();
				System.out.println("Introduce caballos");
				cv=Leer.datoDouble();
				System.out.println("Introduce combustible");
				System.out.println("1.Gasolina, 2.Diesel, 3.Hibrido, 4.Electrico");
				combustible=Leer.datoInt();
				v=new Turismo(marca, modelo, cc, cv, combustible);
				d.addVehiculo(v, cont);
				cont++;
				break;
			case 2:
				System.out.println("Introduce marca");
				marca=Leer.dato();
				System.out.println("Introduce modelo");
				modelo=Leer.dato();
				System.out.println("Introduce cilindrada");
				cc=Leer.datoDouble();
				System.out.println("Introduce caballos");
				cv=Leer.datoDouble();
				System.out.println("Introduce combustible");
				System.out.println("1.Gasolina, 2.Diesel, 3.Hibrido, 4.Electrico");
				combustible=Leer.datoInt();
				v=new Motocicleta(marca, modelo, cc, cv, combustible);
				d.addVehiculo(v, cont);
				cont++;
				break;
			case 3:
				System.out.println("Introduce marca");
				marca=Leer.dato();
				System.out.println("Introduce modelo");
				modelo=Leer.dato();
				System.out.println("Introduce cilindrada");
				cc=Leer.datoDouble();
				System.out.println("Introduce caballos");
				cv=Leer.datoDouble();
				System.out.println("Introduce combustible");
				System.out.println("1.Gasolina, 2.Diesel, 3.Hibrido, 4.Electrico");
				combustible=Leer.datoInt();
				v=new Furgoneta(marca, modelo, cc, cv, combustible);
				d.addVehiculo(v, cont);
				cont++;
				break;
			case 4:
				int num;
				double base=150;
				double total;
				System.out.println("Introduce posicion para calcular el impuesto");
				num=Leer.datoInt();
				num--;
				total=lista[num].calcularImpuesto(base);
				System.out.println("Impuesto: "+total+"€");
				break;
			case 5:
				for (int i = 0; i < lista.length; i++) {
					d.mostrarLista(i);
				}
				break;
			default:
				break;
			}
		}while(numMenu!=0);
		
		
	}

}
