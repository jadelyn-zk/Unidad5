package ejercicio4;

public class Television extends Electrodomestico {

	private int resolucion= 20;
	private boolean sintonizadorTDT= false;
	
	public Television(double precioBase, double peso) {
		super(precioBase,"blanco",'F',peso);
	}
	
	public Television(double precioBase, String color, char consumoEnergetico, double peso, 
			int resolucion, boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	@Override
	public double precioFinal() {
		double precioSuperclase = super.precioFinal();
		double factorResolucion = (resolucion>40) ? precioSuperclase * 0.30 : 0;
		double recargosSintonizador= sintonizadorTDT ? 50 : 0;
		double resultado = precioSuperclase + factorResolucion + recargosSintonizador;
		
		return resultado;
		
		
	}
}
