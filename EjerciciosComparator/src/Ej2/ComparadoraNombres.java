package Ej2;

import java.util.Comparator;

public class ComparadoraNombres implements Comparator<Socio>{

	@Override
	public int compare(Socio o1, Socio o2) {
		return o1.getNombre().compareToIgnoreCase(o2.getNombre()) ;
	}

}
