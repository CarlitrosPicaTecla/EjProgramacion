package ej6;

import java.util.List;

public class CrudTrabajador {

	List<Trabajador> trabajadores;

	public CrudTrabajador(List<Trabajador> trabajadores) {
		super();
		this.trabajadores = trabajadores;
	}

	public List<Trabajador> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(List<Trabajador> trabajadores) {
		this.trabajadores = trabajadores;
	}
	
	public void anyadirTrabajador(Trabajador t) {
		trabajadores.add(t);
	}
	
	public void mostrarLista(double sueldoH) {
		System.out.println("DNI	      NOMBRE	     HORAS	     SUELDO");
		for (int i = 0; i < trabajadores.size(); i++) {
			
			
			System.out.print(trabajadores.get(i).getDni()+"     ");
			System.out.print(trabajadores.get(i).getNombre()+"       ");
			System.out.print(trabajadores.get(i).getHorasT()+"         ");
			System.out.println(trabajadores.get(i).calcularSueldo(sueldoH)+"   ");
			
			
		}
	}
}
