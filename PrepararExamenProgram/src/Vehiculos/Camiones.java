package Vehiculos;

public class Camiones extends Vehiculo{

	double pesoMaxAutorizado;
	boolean mercanciaPeligrosa;
	
	public Camiones(String marca, String modelo, String color, String matricula, double pesoMaxAutorizado,
			boolean mercanciaPeligrosa) {
		super(marca, modelo, color, matricula);
		this.pesoMaxAutorizado = pesoMaxAutorizado;
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}
	
	
	
}
