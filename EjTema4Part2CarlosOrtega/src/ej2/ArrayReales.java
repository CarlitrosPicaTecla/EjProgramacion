package ej2;

import java.util.Random;

public class ArrayReales implements IEstadisticas {

	private int[] num;

	public ArrayReales(int[] num) {
		super();
		this.num = num;
	}
	
	public ArrayReales() {

	}

	public int[] getNum() {
		return num;
	}

	public void setNum(int[] num) {
		this.num = num;
	}

	@Override
	public int calcularMinimo() {
		// TODO Auto-generated method stub
		int minimo=999999;
		for (int i = 0; i < num.length; i++) {
			if(num[i]<minimo) {
				minimo=num[i];
			}
		}
		return minimo;
	}

	@Override
	public int calcularMaximo() {
		int maximo=-1;
		for (int i = 0; i < num.length; i++) {
			if(num[i]>maximo) {
				maximo=num[i];
			}
		}
		return maximo;
	}
	
	public void mostrarArray() {
		for (int j = 0; j < num.length; j++) {

			System.out.print(num[j]+"|");
		}
		System.out.println();
	}

	@Override
	public int calcularSumatorio() {
		int total=0;
		for (int i = 0; i < num.length; i++) {
			total+=num[i];
		}
		
		return total;
	}
	
	public void generarAleatorio(int hasta, int desde) {
		Random r= new Random(System.nanoTime());
		for (int i = 0; i < this.num.length; i++) {
			num[i]=	r.nextInt(hasta-desde+1)+desde;
		}
		
	}
	
}
