package pruebas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OptionalApp app = new OptionalApp();
		System.out.println("Introducimos valor nulo y pone uno predeterminado");
		app.orElse(null);
		System.out.println("Introducimos valor no nulo y lo pone");
		app.orElse("Prueba");
		
		System.out.println("Nos dice mediante un booleano si es nulo o no");
		app.isPresent(null);
		app.isPresent("Prueba");
		

	}

}
