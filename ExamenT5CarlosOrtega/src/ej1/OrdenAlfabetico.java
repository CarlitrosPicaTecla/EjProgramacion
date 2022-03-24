package ej1;

import java.util.Comparator;

public class OrdenAlfabetico implements Comparator<Coche>{

	@Override
	public int compare(Coche o1, Coche o2) {
		
		if(o1.compareTo(o2)==-1) {
			return -1;
		}
		else {
			if(o1.compareTo(o2)==1) {
				return 1;
			}
		}
		
		
		return 0;
	}

}
