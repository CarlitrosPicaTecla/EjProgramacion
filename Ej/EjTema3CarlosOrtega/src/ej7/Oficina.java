package ej7;

public class Oficina {

	private Cuenta c;
	
	//Metodos
	public void ingresarDinero(double i, Cuenta c) {
		if(i>0) {
			c.setSaldo(c.getSaldo()+i);
		}
		else {
			System.out.println("Debdes ingresar mas de 0€");
		}
	}
	
	public void retirarDinero(double i){
		if(i<=c.getSaldo()) {
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
