package domotica;

public class Altavoces extends DispositivoInteligente implements SubirBajar{
	
	String nombreAsistente;
	int nivelVolumen=30;
	
	public Altavoces(String nombre, String marca, double precio, boolean estaActivo, String nombreAsistente,
			int nivelVolumen) {
		super(nombre, marca, precio, estaActivo);
		this.nombreAsistente = nombreAsistente;
		this.nivelVolumen = nivelVolumen;
	}

	public String getNombreAsistente() {
		return nombreAsistente;
	}

	public int getNivelVolumen() {
		return nivelVolumen;
	}

	public void setNombreAsistente(String nombreAsistente) {
		this.nombreAsistente = nombreAsistente;
	}

	public void setNivelVolumen(int nivelVolumen) {
		this.nivelVolumen = nivelVolumen;
	}

	@Override
	public String toString() {
		return "Altavoces [nombreAsistente=" + nombreAsistente + ", nivelVolumen=" + nivelVolumen + ", nombre=" + nombre
				+ ", marca=" + marca + ", precio=" + precio + ", estaActivo=" + estaActivo + "]";
	}

	@Override
	public boolean subir() {
		return ;
	}

	@Override
	public boolean bajar() {
		return ;
	}
	
	
	
	

	
}
