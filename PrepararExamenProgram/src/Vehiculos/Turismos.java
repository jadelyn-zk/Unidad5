package Vehiculos;

public class Turismos extends Vehiculo {

	int numPlazas;
	String tipoUso;
	
	public Turismos(String marca, String modelo, String color, String matricula, int numPlazas, String tipoUso) {
		super(marca, modelo, color, matricula);
		this.numPlazas = numPlazas;
		this.tipoUso = tipoUso;
	}
	
	
	public int getNumPlazas() {
		return numPlazas;
	}

	public String getTipoUso() {
		return tipoUso;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	public void setTipoUso(String tipoUso) {
		if (tipoUso.equalsIgnoreCase("particular")  
				|| tipoUso.equalsIgnoreCase("profesional")) {
			this.tipoUso = tipoUso;
		}
	}

	



	
}
