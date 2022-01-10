package tipoexamen3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dependiente="Carlos Ortega", fecha="07/10/2021", patatasMedianas="Patatas Medianas", 
				bebidaMediana="Bebida Mediana", royal="Hamburguesa Mc Royal";
		int cantPatatas=1, cantBebida=1, cantHamburguesa=1;
		double precioPatatas=2, precioBebida=1.5, precioHamburguesa=5, total=0, dineroEntregado=10, 
				cambio=dineroEntregado-(precioPatatas+precioBebida+precioHamburguesa);
		
		
		System.out.printf("Mc Donals ticket\nAtendido: %s\t\tFecha: %s"
				+ "\n\n\t\t\tPrecio\t\tCantidad\n%s"
				+ "\t%.2f\t\t  %d\n",dependiente, fecha, patatasMedianas,precioPatatas, cantPatatas,bebidaMediana);
		
		
	}

}
