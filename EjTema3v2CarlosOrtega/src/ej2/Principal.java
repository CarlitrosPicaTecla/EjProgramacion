package ej2;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam;
		Hotel h;
		Habitacion lista[];
		Habitacion habitacion;
		int numMenu;
		
		int tipoHabitacion;
		double precioHabitacion;
		int servicioExtraHabitacion;
		String clienteHabitacion;
		int nDiasHabitacion;
		boolean limpioHabitacion;
		boolean ocupadaHabitacion;
		
		
		int i=0;
		System.out.println("Bienvenido al hotel");
		
		System.out.println("¿Cuantas habitaciones vas a alquilar?");
		tam=Leer.datoInt();

		lista=new Habitacion[tam];
		h= new Hotel(lista);
		
		do {
			System.out.println("1.Dar de alta una habitacion");
			System.out.println("2.Dar de baja una habitacion");
			System.out.println("3.Cambiar estado de limpieza");
			System.out.println("4.Cambiar estado de ocupacion");
			System.out.println("5.Mostrar habitacion");
			System.out.println("6.Precio final");
			numMenu=Leer.datoInt();
			
			
			switch (numMenu) {
			case 1:

				System.out.println("Introduce numero de habitacion");
				i=Leer.datoInt();
				i--;
				System.out.println("Selecione tipo de habitacion");
				System.out.println("1.Grande, 2.Mediana 3.Pequeña");
				tipoHabitacion=Leer.datoInt();
				System.out.println("Introduzca precio por dias");
				precioHabitacion=Leer.datoDouble();
				System.out.println("Introducir serrvicios extras");
				System.out.println("1.Si 2.No");
				servicioExtraHabitacion=Leer.datoInt();
				System.out.println("Introduzca nombre del cliente");
				clienteHabitacion=Leer.dato();
				System.out.println("Introduzca numero de dias que va a estar");
				nDiasHabitacion=Leer.datoInt();
	
				habitacion = new Habitacion(tipoHabitacion, precioHabitacion, servicioExtraHabitacion, clienteHabitacion, nDiasHabitacion, true , true);
				
				h.altaHabitacion(habitacion, i);
				
				
				break;
			case 2:
				int j=0;
				System.out.println("Introduce habitacion a dar de baja");
				j=Leer.datoInt();
				j--;
				h.bajaHabitacion(h, j);
				
				break;
			case 3:
				System.out.println("");
				break;
			case 4:
				
				break;
			case 5:
				int f=0;
				System.out.println("Introduce habitacion que quieres mostrar");
				f=Leer.datoInt();
				f--;
				h.mostarDatos(h, f);
				break;
			case 6:
				
				break;
			default:
				break;
			}
		}while(numMenu!=0);
}		

	}
