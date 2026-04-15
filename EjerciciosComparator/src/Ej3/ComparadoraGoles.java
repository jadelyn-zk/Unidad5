package Ej3;

import java.util.Comparator;

public class ComparadoraGoles implements Comparator<Futbolista>{

	@Override
	public int compare(Futbolista o1, Futbolista o2) {
		return o2.getGoles() - o1.getGoles();
	}

	

}
