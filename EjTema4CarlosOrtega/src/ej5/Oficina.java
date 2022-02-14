package ej5;

public class Oficina {

	private Empleado[] empleados;
	
	
	
	
	public Oficina(Empleado[] empleados) {
		super();
		this.empleados = empleados;
	}
	
	

	public Empleado[] getEmpleados() {
		return empleados;
	}



	public void setEmpleados(Empleado[] empleados) {
		this.empleados = empleados;
	}



	public double calcularSueldo(Empleado p, double porcentaje) {
		return p.calcularSueldo(porcentaje);
	}
	
	public double calcularTotalSueldos(double porcentaje) {
		double total=0.0;
		
		 for (int i = 0; i < empleados.length; i++) {
			total+=calcularSueldo(empleados[i], porcentaje);
		}
		 
		 return total;
	}
}
