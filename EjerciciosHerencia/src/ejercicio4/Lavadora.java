package ejercicio4;

public class Lavadora extends Electrodomestico {

	private double carga= 5;
	
	public Lavadora(double precioBase, double peso) {
		super(precioBase,"blanco", 'F', peso);
	}

	public Lavadora(double carga, double precioBase, String color, 
			char consumoEnergetico, double peso) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}
	
	 public double getCarga() { 
		 return carga; 
	 }
	 
	 public void setCarga(double c) {
		 this.carga = c; 
	 }

	    @Override
	    public double precioFinal() {
	        double precioSuperclase = super.precioFinal();
	        double recargoCarga = (carga > 30) ? 50 : 0;
	        double resultado = precioSuperclase + recargoCarga;

	        return resultado;
	    }
	}
