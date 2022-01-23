package ej5;

public class Electrodomestico {

	private double precioBase;
	private String color;
	private char consumo;
	private double peso;
	
	
	public Electrodomestico(double precioBase, String color, char consumo, double peso) {
		super();
		this.precioBase = 100;
		this.color = "Blanco";
		this.consumo = 'F';
		this.peso = 5;
	}
	
	


	public Electrodomestico(double precioBase, double peso) {
		super();
		this.precioBase = 100;
		this.color = "Blanco";
		this.consumo = 'F';
		this.peso = peso;
	}
	
	

	public Electrodomestico(String color, char consumo, double peso) {
		super();
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}




	public Electrodomestico() {

	}


	public double getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public char getConsumo() {
		return consumo;
	}


	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	//Metodos
	
	public char comprobarConsumo(char consumo) {
		char[] consumos= {'A','B','C','D','E','F'};
		
		for (int i = 0; i < consumos.length; i++) {
			if(consumos[i]==consumo) {
				return consumo;
			}

		}
		return consumos[5];
	}
	
	public String comprobarColor(String color) {
		String[] colores= {"Blanco","Negro","Rojo","Azul","Gris"};
		

		for (int i = 0; i < colores.length; i++) {
			if(colores[i].equals(color)) {
				return color;
			}

		}
		return colores[0];
	}
	
	public double precioFinal(char consumo) {
		double precioFinal=0;
		if(consumo=='A') {
			precioFinal=this.precioBase+100;
		}
		else if(consumo=='B') {
			precioFinal=this.precioBase+80;
		}
		else if(consumo=='C') {
			precioFinal=this.precioBase+60;
		}
		else if(consumo=='D') {
			precioFinal=this.precioBase+50;
		}
		else if(consumo=='E') {
			precioFinal=this.precioBase+30;
		}
		else if(consumo=='F') {
			precioFinal=this.precioBase+10;
		}
		
		return precioFinal;
		
		
	}
	
	
	
}
