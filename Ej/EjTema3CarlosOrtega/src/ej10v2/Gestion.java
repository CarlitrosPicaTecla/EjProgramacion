package ej10v2;

public class Gestion {

	Nota notas[];
	

	public Gestion() {

	}

	public Nota[] getNotas() {
		return notas;
	}

	public void setNotas(Nota[] notas) {
		this.notas = notas;
	}

	public void addLong(int i) {
		
		notas=new Nota[i];
	}
	
	public void addNotas(Nota nota,int i) {
		
		notas[i]=nota;
	}
	
	public double doAverage(Gestion g) {
		double media=0;
		double suma=0;
		
		for (int i = 0; i < notas.length; i++) {
			suma=suma+g.getNotas()[i].getNota();
		}
		media=suma/notas.length;
		return media;
	}
	
	public int nSuspensos(Gestion g) {
		int suspensos=0;
		
		for (int i = 0; i < notas.length; i++) {
			if(g.getNotas()[i].getNota()<5) {
				suspensos++;
			}
		}
		return suspensos;
	}
	
	public void showNotas(Gestion g) {
		for (int i = 0; i < g.getNotas().length; i++) {
			System.out.print(g.getNotas()[i].getNota()+" |");
		}
		System.out.println();
	}	
}
