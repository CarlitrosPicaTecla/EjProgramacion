package ejemplo1;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String>lista = new ArrayList<String>();
		Alumno a = new Alumno("Luis", 17, 7.8);
		
		lista.add("Carlos");
		lista.add("Igna");
		
		System.out.println(lista);
		
		List<Integer>lista2 = new ArrayList<Integer>();
		lista2.add(20);
		
		List<Alumno>listaA= new ArrayList<Alumno>();
		
		
		listaA.add(new Alumno("Carlos", 18, 8.5));
		listaA.add(a);
		
		System.out.println(listaA.get(1));
		
		
		
	}

}
