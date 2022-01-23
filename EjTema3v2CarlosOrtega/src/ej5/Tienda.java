package ej5;

import java.util.Arrays;

public class Tienda {

	Electrodomestico electrodomesticos[];
	
	public static double sumaPrecios;

	public Tienda(Electrodomestico[] electrodomesticos) {
		super();
		this.electrodomesticos = electrodomesticos;
	}

	public Electrodomestico[] getElectrodomesticos() {
		return electrodomesticos;
	}

	public void setElectrodomesticos(Electrodomestico[] electrodomesticos) {
		this.electrodomesticos = electrodomesticos;
	}

	public static double getSumaPrecios() {
		return sumaPrecios;
	}

	public static void setSumaPrecios(double sumaPrecios) {
		Tienda.sumaPrecios = sumaPrecios;
	}


	public void calcularSuma(int i) {
		
		sumaPrecios=electrodomesticos[i].precioFinal(electrodomesticos[i].getConsumo());
	}
	
	public void addLista(int i, Electrodomestico e) {
		electrodomesticos[i]=e;
	}
	
	public void imprimirSumaPrecios() {
		System.out.println("Total productos: "+sumaPrecios);
	}
	
	public void imprimirLista(int i, Electrodomestico electrodomesticos[]) {
		System.out.println("Precio: "+electrodomesticos[i].precioFinal(electrodomesticos[i].getConsumo()));
		System.out.println("Color : "+electrodomesticos[i].getColor());
		System.out.println("Consumo: "+electrodomesticos[i].getConsumo());
		System.out.println("Peso: "+electrodomesticos[i].getPeso());
		System.out.println();


	}
	

	@Override
	public String toString() {
		return "Tienda [electrodomesticos=" + Arrays.toString(electrodomesticos) + "]";
	}
	
}
