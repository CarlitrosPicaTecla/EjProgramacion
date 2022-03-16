package ej3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numMenu=0, nota=0;
		
		String nombre, dni;
		
		
		Alumno a;
		Set<Alumno> listaA= new HashSet<Alumno>();
		Iterator<Alumno> it= listaA.iterator();
		CrudAlumno ca = new CrudAlumno(listaA);
		Secretaria s=new Secretaria(listaA);
		
		do{
			
			System.out.println("1.Añadir alumno");
			System.out.println("2.Borrar alumno");
			System.out.println("3.Modificar nota alumnno");
			System.out.println("4.Calcular media curso");
			System.out.println("5.Calcular media suspensos");
			System.out.println("6.Mostrar lista");
			numMenu=Leer.datoInt();
			
			switch (numMenu) {
			case 1:
				
				System.out.println("Introduce dni");
				dni=Leer.dato();
				System.out.println("Introduce nombre");
				nombre=Leer.dato();
				
				a= new Alumno(nombre, dni, 0);
				ca.addAlumno(a);
				break;
			case 2:
				System.out.println("Introduce dni");
				dni=Leer.dato();
				ca.removeAlumno(dni);
				
				break;
			case 3:
				System.out.println("Introduce dni");
				dni=Leer.dato();
				System.out.println("Introduce nota");
				nota=Leer.datoInt();
				ca.updateNota(dni, nota);
				
				break;
			case 4:
				System.out.println("Nota media: "+s.averageMark());
				break;
			case 5:
				System.out.println("Nota media suspensos: "+s.averageSuspendMark());
				break;
			case 6:
				
				break;
			
			}
			
			
			
		}
		while(numMenu!=0);
			
		
	}

}
