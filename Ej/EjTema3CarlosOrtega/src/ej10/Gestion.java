package ej10;

import java.util.Iterator;

public class Gestion {

	private Nota a[];
	
	public Gestion() {
		
	}
	
	//METODOS
	
	
	public void nNotas(int nNotas) {
		
		a=new Nota[nNotas];
	}
	
	public Nota[] getA() {
		return a;
	}

	public void setA(Nota[] a) {
		this.a = a;
	}

	public void addNotas(Nota nota, int i) {
				
			a[i]=nota;
		
	}
	
	public void updateNota(int pos, Nota nota) {
		a[pos]=nota;
	}
	
	public double doAverage(Gestion g) {
		double media=0;
		double suma=0;
		
		for (int i = 0; i < a.length; i++) {
			
			suma=suma+g.getA()[i].getNotas();
			media=suma/a.length;
		}
		return media;
		
		
	}
	
	public int nSuspensos(Gestion g) {
		int nSuspensos=0;
		for (int i = 0; i < a.length;i++ ) {
		if(g.getA()[i].getNotas()<5) {
				nSuspensos++;
				
			}
		}
		return nSuspensos;
	}
	
	public void showNotas(Gestion g) {
		for (int i = 0; i < g.getA().length; i++) {
			System.out.print(g.getA()[i].getNotas()+"| ");
		}
		System.out.println();
	}
	
	
	
	
}
