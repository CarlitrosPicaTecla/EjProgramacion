package ejemploLeer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String apellidos;
		
		System.out.println("Hola, introduzca sus apellidos");
		apellidos=Leer.dato();
		System.out.println(apellidos);
		int num;
		num=Leer.datoInt();
		System.out.println(num);
		double sueldo;
		sueldo=Leer.datoDouble();
		System.out.println(sueldo);
	}

}
