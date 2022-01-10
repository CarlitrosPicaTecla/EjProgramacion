package ej6;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double peso=0, eMercurio=0.38, eVenus=0.91, eTierra=1, eMarte=0.38, eJupiter=2.53, 
				eSaturno=1.06, eUrano=0.92, eNeptuno=1.2, pesoF=0;
		int planeta=0;
		
		System.out.printf("Elige planeta para comparar peso\n");
		System.out.println("1.Mercurio");
		System.out.println("2.Venus");
		System.out.println("3.Tierra");
		System.out.println("4.Marte");
		System.out.println("5.Jupiter");
		System.out.println("6.Saturno");
		System.out.println("7.Urano");
		System.out.println("8.Neptuno");
		planeta=Leer.datoInt();
		
		System.out.println("Introduce peso");
		peso=Leer.datoDouble();
		
		switch (planeta) {
		case 1:
			pesoF=peso*eMercurio;
			break;
		case 2:
			pesoF=peso*eVenus;

			break;
		case 3:
			pesoF=peso*eTierra;

			break;
		case 4:
			pesoF=peso*eMarte;
			
			break;
		case 5:
			pesoF=peso*eJupiter;

			break;
		case 6:
			pesoF=peso*eSaturno;

			break;
		case 7:
			pesoF=peso*eUrano;

			break;
		case 8:
			pesoF=peso*eNeptuno;

			break;

		}
		
		System.out.printf("Tu peso seria de %.2fkg",pesoF);
	}

}
