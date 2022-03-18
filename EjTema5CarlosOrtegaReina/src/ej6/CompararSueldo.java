package ej6;

import java.util.Comparator;

public class CompararSueldo implements Comparator<Trabajador>{

	@Override
	public int compare(Trabajador o1, Trabajador o2) {
		// TODO Auto-generated method stub
		if(o1.getSueldo() >= o2.getSueldo()) {
			return -1;
		}
		else {
			if(o1.getSueldo() <o2.getSueldo()) {
				return 1;
			}
		}
		
		return 0;
	}

}
