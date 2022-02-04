package ej3;

public class Dgt {

	private Vehiculo vehiculos[];

	
	
	public Dgt(Vehiculo[] vehiculos) {
		super();
		this.vehiculos = vehiculos;
	}

	public Vehiculo[] getVehiculos() {
		return vehiculos;
	}

	public void setVvehiculos(Vehiculo[] v) {
		this.vehiculos = vehiculos;
	}
	//Metodos
	public void addVehiculo(Vehiculo v, int i) {
		vehiculos[i]=v;
	}
	
	public String comprobrarCombustible(int i) {
		if(vehiculos[i].getCombustible()==1) {
			return "Gasolina";
		}
		else if(vehiculos[i].getCombustible()==2) {
			return "Diesel";
		}
		else if(vehiculos[i].getCombustible()==3) {
			return "Hibrido";
		}
		else if(vehiculos[i].getCombustible()==4) {
			return "Electrico";
		}
		return "Hamster en una rueda";
	}
	
	public void mostrarLista(int i) {
		System.out.println(vehiculos[i].getMarca()+" "+vehiculos[i].getModelo());
		System.out.println("Cilindrada: "+vehiculos[i].getCilindrada()+"cc");
		System.out.println("Caballos: "+vehiculos[i].getCv()+"cv");
		System.out.println("Combustible: "+comprobrarCombustible(i));
		System.out.println();
	}
	public double calcularUno(Vehiculo v, double cant) {
		return v.calcularImpuesto(cant);
	}
	public double calcularTotal(double cant) {
		double total=0;
		for (int i = 0; i < vehiculos.length; i++) {
			total+=calcularUno(vehiculos[i], cant);
			total+=vehiculos[i].calcularImpuesto(i);
		}
		
		return total;
	}
}
