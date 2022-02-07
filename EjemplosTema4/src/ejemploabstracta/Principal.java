package ejemploabstracta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Figura cuadrado = new Cuadrado(1,2,2);
		Figura rectangulo = new Rectangulo(1,2,3,2);
		Cuadrado c = new Cuadrado(1,3,3);
		Rectangulo r = new Rectangulo(1,2,4,6);
		
		System.out.println(cuadrado.calcularArea());
		System.out.println(rectangulo.calcularArea());
	}

}
