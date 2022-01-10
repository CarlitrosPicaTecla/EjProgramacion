package ejemplo1;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad;
		String nombre, apellidos;
		double notaMedia;
		Alumno a1=new Alumno(19,"Carlos","Ortega Reina",8.5);
		Alumno aEditado, aEditado2;
		double puntos=0;

		System.out.println("Diga la edad");
		edad=Leer.datoInt();
		System.out.println("Diga su nombre");
		nombre=Leer.dato();
		System.out.println("Diga sus apellidos");
		apellidos=Leer.dato();
		System.out.println("Diga su nota media");
		notaMedia=Leer.datoDouble();
		
		aEditado=new Alumno(edad,nombre,apellidos,notaMedia);
		
		System.out.println("Su edad es: "+aEditado.getEdad());
		System.out.println("Tu nombre es: "+aEditado.getNombre()+" "+aEditado.getApellidos());
		System.out.println("Tu nota media es de: "+aEditado.getNotaMedia());
		
		System.out.println("Introduce nueva nota media");
		notaMedia=Leer.datoDouble();
		aEditado.setNotaMedia(notaMedia);
		
		System.out.println("Cuantos puntos quiere sumar?");
		puntos=Leer.datoDouble();
		aEditado.sumarMedia(puntos);
		System.out.println("La nota media es: "+aEditado.getNotaMedia());

	}

}
