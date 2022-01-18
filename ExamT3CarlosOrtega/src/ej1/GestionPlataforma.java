package ej1;

import java.util.Random;

public class GestionPlataforma {

	private int idPlataforma;
	private int litros[]= new int[7];
	private Deposito deposito;
	public int getIdPlataforma() {
		return idPlataforma;
	}
	
	
	
	
	public GestionPlataforma(int idPlataforma, int[] litros, Deposito deposito) {
		this.idPlataforma = idPlataforma;
		this.litros = litros;
		this.deposito = deposito;
	}

	public GestionPlataforma() {
	}



	public void setIdPlataforma(int idPlataforma) {
		this.idPlataforma = idPlataforma;
	}
	public int[] getLitros() {
		return litros;
	}
	public void setLitros(int[] litros) {
		this.litros = litros;
	}
	public Deposito getDeposito() {
		return deposito;
	}
	public void setDeposito(Deposito deposito) {
		this.deposito = deposito;
	}
	
	//Metodos
	
	public double calcularVolumen(GestionPlataforma g) {
		double litros;
		
		litros=g.deposito.getAltura()*Math.PI*Math.pow(g.deposito.getRadio(), 2);
		
		
		return litros;
	}
	
	public void rellenarArray(double volumen,int desde, int litros[],int i) {
		Random random=new Random(System.nanoTime());
		int valor=0;
		valor=random.nextInt((int)volumen-desde+1)+desde;
		litros[i]=valor;
	}
	
	public double calcularPrecioVenta(double precio, GestionPlataforma g) {
		double total;
		double ganancia;
		ganancia=g.deposito.getPrecio()*0.2;
		total=g.deposito.getPrecio()+ganancia;
		return total;
	}
	
	public double mediaLitros(GestionPlataforma g) {
		double media;
		double suma = 0;
		for (int i = 0; i < litros.length; i++) {
			suma=suma+g.litros[i];
		}
		
		media=suma/litros.length;
		return media;
	}
	
	public void imprimirDeposito(GestionPlataforma g) {
		System.out.println("ID deposito:"+g.deposito.getId());
		System.out.println("Volumen deposito: "+g.deposito.getAltura()*Math.PI*Math.pow(g.deposito.getRadio(), 2));
		System.out.println("Precio deposito: "+g.deposito.getPrecio());
		System.out.println();
	}
	

	
}
