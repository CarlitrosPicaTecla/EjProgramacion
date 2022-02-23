package ej1;

import java.util.List;

public class Agenda {

	private int idAgenda;
	List <Nota>Notas;
	
	
	public Agenda(int idAgenda, List<Nota> notas) {
		super();
		this.idAgenda = idAgenda;
		Notas = notas;
	}


	public int getIdAgenda() {
		return idAgenda;
	}


	public void setIdAgenda(int idAgenda) {
		this.idAgenda = idAgenda;
	}


	public List<Nota> getNotas() {
		return Notas;
	}


	public void setNotas(List<Nota> notas) {
		Notas = notas;
	}

	public void addNota(Nota n) {
		Notas.add(n);
	}

	public void mostrarNota(int id) {
		System.out.println(Notas.get(id));
	}
	
	public int nNotas() {
		int num=0;
		
		for (Nota nota : Notas) {
			num++;
		}
		
		return num;
	}
	
	public void removeNota(int id) {
		if(Notas.isEmpty()==false) {
		Notas.remove(id);
		}
	}
	
	
	public void mostrarNotas() {
		for (Nota nota : Notas) {
			Notas.toString();
		}
	}
	@Override
	public String toString() {
		return "Agenda [idAgenda=" + idAgenda + ", Notas=" + Notas + "]";
	}
	
	
	
	
}
