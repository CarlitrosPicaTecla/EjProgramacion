package ej8;

import java.util.Random;


public class Gestion {

	private Sorteo s;
	
	
	//Metodos
	
	
	public Gestion() {
		
	}
	
	public void comprarDecimo(int i) {
		
		if(i>0 && i<100000) {
			s.setNumero(i);
		}
		else {
			System.out.println("Escoga un numero posible");
		}
	}
	
	public int generarSorteo(int i, int hasta, int desde) {
		
		Random random=new Random(System.nanoTime());
		i=random.nextInt(hasta-desde+1)+desde;
		
		return i;
		
	}
	
	public boolean comprobarPremio(int num, int numPremiado) {
		
		if(num==numPremiado) {
			return true;
		}
		else {
			return false;
		}
	}
}
