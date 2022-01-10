package ej11;

public class Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double caudal=8, tiempo=86400, metros3=0, mil=1000;
		
		metros3=(caudal*tiempo)/mil;
		System.out.printf("Bienvenido a un programa para calcular la capacidad de extraccion del pozo"
				+ "\n\nEl pozo puede sacar un caudal de 8L/s\nsi esta funcionando durante "
				+ "24h el pozo puede sacar %.2fm³",metros3);
	}

}
