package ej8;

import java.util.Random;


public class Gestion {

	private Billete s;
	 
	
	//Metodos
	
	
	public Gestion() {
		
	}
	
	public int comprarDecimo(int decimo, int cantidad) {
	

			if(decimo>0 && decimo<100000) {
				return decimo;
			}
			else {
				System.out.println("Escoga un numero posible");
				return -1;
			}
	}
			
	
	public void generarSorteo(int i, int hasta, int desde) {
		
		Random random=new Random(System.nanoTime());
		i=random.nextInt(hasta-desde+1)+desde;
		
		s.setNumero(i);
		
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
