package ej10;

import java.util.Iterator;

public class Gestion {

	Nota a[];
	
	public Gestion() {
		
	}
	
	//METODOS
	
	public void nNotas(int nNotas) {
		
		a=new Nota[nNotas];
	}
	
	public void addNotas(Nota nota) {
		
		for (int i = 0; i < a.length; i++) {
				
			a[i]=nota;
		}
	}
	
	public void updateNota(int pos, Nota nota) {
		a[pos]=nota;
	}
	
	//public double doAverage(Nota a[]) {
		//double media;
		//double suma;
		
		//for (int i = 0; i < a.length; i++) {
			
			//suma=suma+a[i];//
			//media=suma/a.length;
		//}
		//return media;
		
		
	//}
	
	//public int nSuspensos(Nota a[]) {
		//int n=0;
		//for (int i = 0; i < a.length; ) {
			//if(a[i]<5) {
			//	n++;
			//	i++;
			//}
		//	else {
				
			//}
			//return n;
		//}
	//}
	
	public void showNotas(Gestion g) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(this.a[i]+"| ");
		}
	}
	
	
	
	
}
