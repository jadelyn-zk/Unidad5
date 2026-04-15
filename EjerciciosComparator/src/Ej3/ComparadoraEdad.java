package Ej3;

import java.util.Comparator;

public class ComparadoraEdad implements Comparator<Futbolista>{

	@Override
	public int compare(Futbolista o1, Futbolista o2) {
		// TODO Auto-generated method stub
		return o1.getEdad() - o2.getEdad();
	}

}
