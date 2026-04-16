package Ej3;

public class Futbolista {

	String nombre;
	int edad;
	int goles;
	
	public Futbolista(String nombre, int edad, int goles) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.goles = goles;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public int getGoles() {
		return goles;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	@Override
	public String toString() {
		return "Futbolista [nombre=" + nombre + ", edad=" + edad + ", goles=" + goles + "]";
	}
	
	
}
