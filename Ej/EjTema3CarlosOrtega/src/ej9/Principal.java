package ej9;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Maquina maquina=new Maquina();
		Ticket billete=new Ticket();
		double precio=1.5;
		int cant=0;
		int numMenu=0;
		double total=0;
		double dinero;
		double cambio;
		
	

			System.out.println("Introduzca la cantidad de billetes deseados");
			cant=Leer.datoInt();
			total=maquina.comprarBillete(cant, billete=new Ticket(precio));
			
			System.out.println("El precio es de: "+total+"€");
			System.out.println("Introduzca el dinero");
			dinero=Leer.datoDouble();
			
			cambio=maquina.cambioDinero(total, dinero);
			System.out.println("Su cambio: "+cambio+"€");
			
			maquina.imprimirBillete(cant, total);
			
	
	}

}
