package ej1;

public class Circulo {

	private double radio;
	
	
	public Circulo( double radio) {
		this.radio = radio;
	}



	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}




	public double calcularCirculo(double radio) {
		double pi=Math.PI;
		double area = 0;
		
		area=pi*Math.pow(radio, 2);
		
		return area;
	}
	
}
