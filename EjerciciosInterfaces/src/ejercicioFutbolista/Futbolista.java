package ejercicioFutbolista;

import java.util.Objects;

public class Futbolista implements Comparable<Futbolista>{

	protected int numCamiseta;
	protected String nombre;
	protected int edad;
	protected int numGoles;
	
	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
		super();
		this.numCamiseta = numCamiseta;
		this.nombre = nombre;
		this.edad = edad;
		this.numGoles = numGoles;
	}

	@Override
	public String toString() {
		return "Futbolista [numCamiseta=" + numCamiseta + ", nombre=" + nombre + ", edad=" + edad + ", numGoles="
				+ numGoles + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Futbolista other = (Futbolista) obj;
		return Objects.equals(nombre, other.nombre) && numCamiseta == other.numCamiseta; //solo si el numcamiseta y el nombre son iguales
	}

	@Override
	public int compareTo(Futbolista otroFutbolista) {
	    int resultado = Integer.compare(this.numCamiseta, otroFutbolista.numCamiseta);
	    
	    if (resultado == 0) {
	        resultado = this.nombre.compareTo(otroFutbolista.nombre);
	    }
	    
	    return resultado;
	}
	
	
	
	
}
//Diseña la clase Futbolista con los siguientes atributos: número de camiseta, nombre, edad y número de goles. Implementar:
//Un constructor con parámetros y los métodos toString() y equals(). Se considera que dos futbolistas son iguales si el número de camiseta y el nombre coinciden.
//La interfaz Comparable que primero tenga en cuenta el número de camiseta, y si dos futbolistas tienen el mismo número de camiseta, entonces se tendrá en cuenta el nombre.
//En una clase independiente, implementa el main
