package domotica;

public class Luces extends DispositivoInteligente implements SubirBajar{

	String color;
	int nivelBrillo=50;
	
	public Luces(String nombre, String marca, double precio, boolean estaActivo, String color, int nivelBrillo) {
		super(nombre, marca, precio, estaActivo);
		this.color = color;
		this.nivelBrillo = nivelBrillo;
	}

	public String getColor() {
		return color;
	}

	public int getNivelBrillo() {
			return nivelBrillo;

	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setNivelBrillo(int nivelBrillo) {
		if(nivelBrillo>0 && nivelBrillo<=100) {
			this.nivelBrillo = nivelBrillo;
		} else {
			this.nivelBrillo = 30;
		}
	}

	@Override
	public String toString() {
		return "Luces [color=" + color + ", nivelBrillo=" + nivelBrillo + ", nombre=" + nombre + ", marca=" + marca
				+ ", precio=" + precio + ", estaActivo=" + estaActivo + "]";
	}

	
	@Override
	public boolean subir() {
		boolean brilloAumentado=false;
		if(this.estaActivo) {
			this.nivelBrillo+=10;
			brilloAumentado=true;
		};
		return brilloAumentado;
	}

	@Override
	public boolean bajar() {
		boolean brilloDisminuido=false;
		if(this.estaActivo) {
			this.nivelBrillo-=10;
			brilloDisminuido=true;
		};
		return brilloDisminuido;
	}
	
}//fin
	
	
