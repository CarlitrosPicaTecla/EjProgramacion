package ej10;

public class Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precio=100, precioFinal=0, descuento=20, unidades=4, div=100, precioUnidades=0; 
		
		precioUnidades=precio*unidades;
		precioFinal=(precioUnidades*descuento)/div;
		precioFinal=precioUnidades-precioFinal;
		System.out.printf("Precio del producto: %.2f€	Unidades: %.0f	Descuento: %.0f\n"
				+ "Precio sin descuento: %.2f€	Precio con descuento: %.2f€"
				,precio,unidades,descuento,precioUnidades, precioFinal);
	}

}
