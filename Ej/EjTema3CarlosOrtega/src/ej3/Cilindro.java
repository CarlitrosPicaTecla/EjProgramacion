package ej3;

public class Cilindro {

	private double radio;
	private double altura;
	
	public Cilindro(double radio, double altura) {
		this.radio = radio;
	}


	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura= altura;
	}


	
	public double volumenCilindro(double radio, double altura) {
		double volumen=0;
		
		volumen=Math.PI*Math.pow(radio, 2)*altura;
		
		return volumen;
		
		
	}
	
}
