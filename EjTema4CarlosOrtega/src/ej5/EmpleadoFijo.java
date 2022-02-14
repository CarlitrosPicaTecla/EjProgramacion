package ej5;

public class EmpleadoFijo extends Empleado {


	double impuestos;
	
	public EmpleadoFijo(String nombre, int id, double sueldo, double recaudado, double impuestos) {
		super(nombre, id, sueldo, recaudado);
		this.impuestos=impuestos;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	@Override
	public double calcularSueldo(double porcentaje) {
		return getSueldo()-(getSueldo()*porcentaje)/100;
	}
	
	
	
}
