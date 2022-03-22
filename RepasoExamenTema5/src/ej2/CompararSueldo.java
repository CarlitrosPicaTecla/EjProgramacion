package ej2;

import java.util.Comparator;

public class CompararSueldo implements Comparator<Producto>{

	@Override
	public int compare(Producto o1, Producto o2) {
		if(o1.calcularPVP(21)>=o2.calcularPVP(21)) {
			return -1;
		}
		else {
			if(o1.calcularPVP(21)<=o2.calcularPVP(21)) {
				return 1;
			}
		}
		return 0;
	}

}
