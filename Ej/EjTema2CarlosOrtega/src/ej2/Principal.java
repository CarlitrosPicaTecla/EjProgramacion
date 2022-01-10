package ej2;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double num1=0, num2=0, res=0;
		System.out.println("Introduce primer numero:");
		num1=sc.nextDouble();
		System.out.println("Introduce segundo numero:");
		num2=sc.nextDouble();
		if(num2!=0) {
			
		res=num1/num2;
		System.out.printf("Resultado: %.2f",res);

		}
		else {
			System.out.println("Error, el segundo numero es cero");
		}
	}

}
