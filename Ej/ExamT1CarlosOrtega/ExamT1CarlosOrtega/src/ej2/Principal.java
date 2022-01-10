package ej2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precioSuite=120, precioJackDaniels=8, precioCantina=32.50, nDescuento=5, precio=0, div=100,
				descuento=0, precioFinal=0, totalSuite=0, totalWisky=0, totalCantina=0, dineroCuenta=500;
		int noches=5, cantWisky=3, cantCantina=2;
		String suite="Suite Google", jackDaniels="Jack Daniels", cantina="La Cantina Facebook", 
				cliente="Carlos Ortega";
		int dia=8,mes=10,anyo=2021;
		
		totalSuite=precioSuite*noches;
		totalWisky=precioJackDaniels*cantWisky;
		totalCantina=precioCantina*cantCantina;
		
		precio=totalSuite+totalWisky+totalCantina;
		descuento=(nDescuento*precio)/div;
		precioFinal=precio-descuento;
		
		dineroCuenta=dineroCuenta-precioFinal;
		
		System.out.printf("Bienvenido a un programa sobre el cálculo de una factura de una estancia en un hotel\n\n");

		System.out.println("Silicom Valley Hotel");
		System.out.printf("\nCliente: %s\t\tFecha: %d/%d/%d",cliente,dia,mes,anyo);
		System.out.printf("\n----------------------------------------------------------------");
		System.out.printf("\nConcepto\t\tUnidad\t\tPrecio\t\tTotal");
		System.out.printf("\n%s\t\t  %d\t\t%.2f€\t\t%.2f€",suite,noches,precioSuite,totalSuite);
		System.out.printf("\n%s\t\t  %d\t\t%.2f€\t\t%.2f€",jackDaniels,cantWisky,precioJackDaniels,totalWisky);
		System.out.printf("\n%s\t  %d\t\t%.2f€\t\t%.2f€",cantina,cantCantina,precioCantina,totalCantina);
		System.out.printf("\n----------------------------------------------------------------");
		System.out.printf("\n\t\t\t Total sin descuento: %.2f€ ",precio);
		System.out.printf("\n\t\t\t Por descuento: %.0f",nDescuento);
		System.out.print("%");
		System.out.printf("\n\t\t\t Descuento: %.2f€ ",descuento);
		System.out.printf("\n\t\t\t Total a pagar: %.2f€", precioFinal);
		System.out.printf("\n-----------------------------------------------------------------");
		System.out.printf("\nDinero en cuenta: %.2f€",dineroCuenta);
		
	}

}
