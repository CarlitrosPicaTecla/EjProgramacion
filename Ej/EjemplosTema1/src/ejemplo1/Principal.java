package ejemplo1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad = 19;
		double sueldo = 1000.567;
		double extra = 150.689;
		String nombre = "Carlos";
		String apellido1 ="Ortega";
		String apellido2 ="Reina";
		
		
		System.out.printf("Tu sueldo es: %.2f \nEl extra es: %.2f",sueldo,extra);
		System.out.printf("\nMi edad es de: %d años", edad);
		System.out.printf("\nMi nombre es: %s \nMi apellido es: %s \nMi segundo apellido es: %s"
				+ "", nombre,apellido1,apellido2);
	}

}
