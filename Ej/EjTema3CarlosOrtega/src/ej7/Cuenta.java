package ej7;

public class Cuenta {

	private Cuenta c;
	
	private int id;
	private String nombre;
	private double saldo;
	
	
	public Cuenta(int id, String nombre, double saldo) {
		this.id = id;
		this.nombre = nombre;
		this.saldo = saldo;
	}


	public Cuenta getC() {
		return c;
	}


	public void setC(Cuenta c) {
		this.c = c;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	@Override
	public String toString() {
		return "Cuenta [c=" + c + ", id=" + id + ", nombre=" + nombre + ", saldo=" + saldo + "]";
	}
	
	
	
	//Metodos
	
	public void ingresarDinero(double i) {
		if(i>0) {
			c.setSaldo(c.getSaldo()+i);
		}
		else {
			System.out.println("Debdes ingresar mas de 0€");
		}
	}
	
	public void retirarDinero(double i){
		if(i<c.getSaldo()) {
			c.setSaldo(c.getSaldo()-i);
		}
		else {
			System.out.println("No tienes ese dinero para retirar");
		}
	}
	
	public double verSaldo() {
		return c.getSaldo();
	}
	
	
}
