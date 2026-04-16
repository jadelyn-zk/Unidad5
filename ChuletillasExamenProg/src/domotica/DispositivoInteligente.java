package domotica;

import java.util.Objects;

public abstract class DispositivoInteligente {

	String nombre;
	String marca;
	double precio;
	boolean estaActivo=false;
	
	/**
	 * Constructor de la clase Dispositivo inteligente
	 * @param nombre del dispositivo
	 * @param marca del dispositivo
	 * @param precio del dispositivo
	 * @param estaActivo, indica si el dispositivo esta activo o no
	 */
	public DispositivoInteligente(String nombre, String marca, double precio, boolean estaActivo) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.estaActivo = estaActivo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getMarca() {
		return marca;
	}

	public double getPrecio() {
		return precio;
	}

	public boolean isEstaActivo() {
		return estaActivo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setEstaActivo(boolean estaActivo) {
		this.estaActivo = estaActivo;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(estaActivo, marca, nombre, precio);
	}
	
/**
 * Equals que solo compare la marca y nombre para determinar si dos objetos son iguales
 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DispositivoInteligente other = (DispositivoInteligente) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(nombre, other.nombre);
	}

	/**
	 * To string abstracto ya que en cada dispositivo será diferente
	 */
	@Override
	public abstract String toString();
	
	
}
