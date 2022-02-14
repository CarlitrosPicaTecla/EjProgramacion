package ej5;

public class EmpleadoAComision extends Empleado{
	private double porcentaje;

	public EmpleadoAComision(String nombre, int id, double sueldo, double recaudado, double porcentaje) {
		super(nombre, id, sueldo, recaudado);
		this.porcentaje=porcentaje;
	}


	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}


	@Override
	public double calcularSueldo(double porcentaje) {
		return getSueldo()+(getSueldo()*porcentaje/100);
	}
	
	
	
	
}
