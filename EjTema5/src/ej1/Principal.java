package ej1;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Nota>Notas= new ArrayList<Nota>();
		
		Agenda a = new Agenda(1, Notas);
		a.addNota(new Nota(0, "Lista compra", "Huevos, azucar, pan", true));
		
		
		
		a.mostrarNota(0);
		
	}

}
