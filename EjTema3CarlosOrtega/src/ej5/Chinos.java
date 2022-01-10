package ej5;

import java.util.Random;

public class Chinos {


	
	
	public int calcularAleatorio(int hasta, int desde){
		Random random=new Random(System.nanoTime());
		int valor=0;
		valor=random.nextInt(hasta-desde+1)+desde;
		return valor;
	}
	
	public void imprimir(char valor) {
		System.out.println(valor);
	}
	
	public char calcularGanador(int valor) {
		char num;
		
		if(valor>2) {
			num='3';
			return num;
		}
			else if(valor==2) {
				num='2';
				return num;

			}
				else {
					num='1';
					return num;
				}
	}
	
	
	public boolean ganadorPrimitiva(int numG, int numA) {
		boolean result=false;
		
		if(numG==numA) {
			result=true;
		}
		else {
			result= false;
		}
		
		return result;
	}
	
	
	public void mostarGanador(boolean ganador) {
		if(ganador){
			System.out.println("Has ganado");
		}
		else {
			System.out.println("Suerte la proxima vez");
		}
		
	}
	

	
	
}
