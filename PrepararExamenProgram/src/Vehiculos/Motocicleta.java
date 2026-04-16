package Vehiculos;

public class Motocicleta extends Vehiculo{

	private int cilindrada;

	public Motocicleta(String marca, String modelo, String color, String matricula, 
			int cilindrada) {
		super(marca, modelo, color, matricula);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	//metodos//
	
	boolean seRequiereCarnet() {
		if(this.cilindrada>125) {
			return true;
		}else return false;
	}
	
	
	
	
}//fin
