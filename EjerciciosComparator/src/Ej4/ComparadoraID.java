package Ej4;

import java.util.Comparator;

public class ComparadoraID implements Comparator<Ficha>{

@Override
	public int compare(Ficha o1, Ficha o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareTo(o2.getNombre());
	}
}