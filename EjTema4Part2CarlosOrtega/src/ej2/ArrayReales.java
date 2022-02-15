package ej2;

import java.util.Random;

public class ArrayReales implements IEstadisticas {

	private double[] num;

	public ArrayReales(double[] num) {
		super();
		this.num = num;
	}
	
	public ArrayReales() {

	}

	public double[] getNum() {
		return num;
	}

	public void setNum(double[] num) {
		this.num = num;
	}

	@Override
	public double calcularMinimo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularMaximo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularSumatorio() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public double generarAleatorio(int hasta, int desde) {
		double num=0;
		Random r= new Random(System.nanoTime()); 
		return 0;
		
	}
	
}
