package tipoexamen1;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double costeFabricacion=12500, porGanancia=15, porImpuestos=12.5, precioFinal=0, div=100, ganancia=0, impuestos=0;
		
		ganancia=(costeFabricacion*porGanancia)/div;
		impuestos=(costeFabricacion*porImpuestos)/div;
		
		precioFinal=costeFabricacion+ganancia+impuestos;
		
		System.out.println("Bienvenido a un programa del calculo del precio final de un vehiculo para su salida al mercado");
		
		System.out.printf("\nEl coste de fabricación es de %.2f€\nLas ganancias para la empresa seran de %.2f�\nLos impuestos son un total de %.2f€\n"
				+ "Esto hace un total de %.2f€",costeFabricacion, ganancia, impuestos, precioFinal);
		
	}

}
