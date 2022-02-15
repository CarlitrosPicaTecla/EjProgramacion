package ej5;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam=5, numMenu=0, i=0;
		Empleado listaEmp[]= new Empleado[tam];

		listaEmp[0]= new EmpleadoFijo("Carlos",1,1500,100,20);
		listaEmp[1]= new EmpleadoAComision("Luis",1,1500,100,20);
		listaEmp[2]= new EmpleadoFijo("Juan",1,2500,100,30);
		listaEmp[3]= new EmpleadoAComision("Jose",1,2000,100,30);
		listaEmp[4]= new EmpleadoAComision("Miguel",1,1900,100,30);


		Oficina o= new Oficina(listaEmp);

		do {
			
			System.out.println("1.Calcular sueldo empleado");
			i=Leer.datoInt();
t 			System.out.println("2.Calcualr total sueldos");
			numMenu=Leer.datoInt();
			
		}while(numMenu!=0);
		
	}

}
