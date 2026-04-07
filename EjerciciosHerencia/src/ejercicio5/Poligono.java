package ejercicio5;

abstract class Poligono {

	protected int numerolados;
	


/**
 * constructor de poligono
 * @param numerolados numero de lados del poligono que sera mas o menos segun el tipo 
 */
	public Poligono(int numerolados) {
		super();
		this.numerolados = numerolados;
	}

	//getters y setters
	public int getNumerolados() {
		return numerolados;
	}

	public void setNumerolados(int numerolados) {
		this.numerolados = numerolados;
	}
	
	
/**
 * metodo abstracto para calcular el area de cada poligono segun su tipo
 * @return
 */
	public abstract double calcularArea();
	
}
