package ejercicio5;

public class Triangulo extends Poligono {

	private double ladoA;
	private double ladoB;
	private double ladoC;
	
/**
 * constructor de triangulo
 * @param numerolados heredado de poligonos, pondremos 3 pues es un triangulo
 * @param ladoA medida del lado A
 * @param ladoB medida del lado B
 * @param ladoC medida del lado C
 */
	public Triangulo(int numerolados, double ladoA, double ladoB, double ladoC) {
		super(3);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
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

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}
	
	@Override
	
	public double calcularArea() {
	        double semiPerimetro = (ladoA + ladoB + ladoC) / 2.0;
	        return Math.sqrt(semiPerimetro * (semiPerimetro - ladoA) * (semiPerimetro - ladoB) * (semiPerimetro - ladoC));
	    }

	@Override
	public String toString() {
		return "Triangulo [ladoA=" + ladoA + ", ladoB=" + ladoB + ", ladoC=" + ladoC + "] \n Area= "+ calcularArea();
	}
	
	
	
}
	
	

