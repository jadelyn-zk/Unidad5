package Ej1;

import java.util.Comparator;

	public class Comparadora implements Comparator<Integer> {
	    @Override
	    public int compare(Integer a, Integer b) {
	        // Decreciente: mayor primero
	        return b.compareTo(a);  // o b - a
	    }
	}

