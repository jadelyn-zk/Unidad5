package ejercicio5;

public class Rectangulo extends Poligono {

	private double ladoA;
	private double ladoB;

/**
 * constructor de rectangulo
 * @param numerolados heredado de poligonos, pondremos 2 pues es un 
 * rectangulo y con eso nos sirve para calcular su area
 * @param ladoA medida del lado A
 * @param ladoB medida del lado B
 */
	public Rectangulo(int numerolados, double ladoA, double ladoB) {
		super(3);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}

//getters y setrers
	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	@Override
	
	public double calcularArea() {
	        return ladoA*ladoB;
	    }

	@Override
	public String toString() {
		return "Rectangulo: [ladoA=" + ladoA + ", ladoB=" + ladoB + "] \n Area= " + calcularArea();
	}



}



	
	

