package ejemplo1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trabajador t=new Trabajador("Carlos", "Tucu-Tucu");
		Empleado e=new Empleado("Manolo", "Jefe de departamento", 1500, 20);
		
		System.out.println(	t.toString());

		System.out.println(e.toString());
	}

}
