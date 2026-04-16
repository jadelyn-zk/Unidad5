package Ej2;

public class Socio {

	String nombre;
	int edad;
	
	public Socio(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {return nombre;}

	public int getEdad() {return edad;}

	public void setNombre(String nombre) {this.nombre = nombre;}

	public void setEdad(int edad) {this.edad = edad;}

	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
	
	
}
