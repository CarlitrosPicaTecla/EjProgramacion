package ej4;

public class Gimnasio {

	Cliente clientes[];

	public Gimnasio(Cliente[] clientes) {
		super();
		this.clientes = clientes;
	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}
	
	//Metodos
	
	public void addCliente(Cliente c, int i) {
		if(i<=clientes.length) {
			clientes[i]=c;
		}
		else {
			System.out.println("Lista de clientes completa");
		}
	}
	
	public void removeCliente(int i) {
		clientes[i].setActividad(false);;
	}
	
	public double calcularIMC(Gimnasio g, int i) {
		
		double imc=0;
		
		imc=g.clientes[i].getPeso()/g.clientes[i].getAltura();
		
		return imc;
	}
	
	public boolean comprobarActividad(int i) {
		return clientes[i].isActividad();
	}
	
	public void imprimirActividad(int i) {
		if(comprobarActividad(i)) {
			System.out.print("Activo");
		}
		else {
			System.out.print("Inactivo");
		}
	}
	
	public void imprimirCliente(Gimnasio g, int i) {
		System.out.println("Nombre: "+g.clientes[i].getNombre());
		System.out.println("DNI: "+g.clientes[i].getDni());
		System.out.println("Peso: "+g.clientes[i].getPeso()+"Kg");
		System.out.println("Altura: "+g.clientes[i].getAltura()+"cm");
		System.out.print("Actividad: ");imprimirActividad(i);
		System.out.println();
		System.out.println();
	}
	
}
