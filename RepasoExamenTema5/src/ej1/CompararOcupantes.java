package ej1;

import java.util.Comparator;

public class CompararOcupantes implements Comparator<Habitacion> {

	@Override
	public int compare(Habitacion o1, Habitacion o2) {
		// TODO Auto-generated method stub
		if(o1.getnOcupantes()>=o2.getnOcupantes()) {
			return -1;
		}
		else {
			if(o1.getnOcupantes()<=o2.getnDias()) {
				return 1;
			}
		}
		return 0;
	}

}
