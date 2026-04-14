package Vehiculos;

public class Vehiculo {

	private String marca;
	private String modelo;
	private String color;
	private String matricula;
	private boolean arrancado = false;
	

	private int marchaActual = 0;
	private int velocidadInicial = 0;
	private int velocidadInputUsuario = 0;

	public Vehiculo(String marca, String modelo, String color, String matricula) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.matricula = matricula;
	}
	
	public boolean isArrancado() {
		return arrancado;
	}

	public int getMarchaActual() {
		return marchaActual;
	}

	public int getVelocidadInicial() {
		return velocidadInicial;
	}

	public int getVelocidadInputUsuario() {
		return velocidadInputUsuario;
	}

	public void setArrancado(boolean arrancado) {
		this.arrancado = arrancado;
	}

	public void setMarchaActual(int marchaActual) {
		this.marchaActual = marchaActual;
	}

	public void setVelocidadInicial(int velocidadInicial) {
		this.velocidadInicial = velocidadInicial;
	}

	public void setVelocidadInputUsuario(int velocidadInputUsuario) {
		this.velocidadInputUsuario = velocidadInputUsuario;
	}
	
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getColor() {
		return color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	// metodos comprobacion vehiculo//

	// si esta parado arranca
	void parar() {
		arrancado = false;
		marchaActual=0;
	}

	// si esta arrancado, para
	void arrancar() {
			arrancado = true;
	}

	void saberMarchaSegunVelocidad(int velocidad) {
		if (velocidad > 0 && velocidad < 30) {
			marchaActual = 1;
		} else if (velocidad >= 30 && velocidad < 50) {
			marchaActual = 2;
		} else if (velocidad >= 50 && velocidad < 70) {
			marchaActual = 3;
		} else if (velocidad >= 70 && velocidad < 100) {
			marchaActual = 4;
		} else if (velocidad >= 100) {
			marchaActual = 5;
		}
	}

//	Acelera e irá subiendo marchas hasta llegar a una 
//  velocidad que se ha pedido por teclado al usuario.
	void subirMarcha(int velocidad) {
		for (int marcha = 1; marcha <= marchaActual; marcha++) {
			System.out.println("Subiendo de marcha: " + marcha);
			System.out.println("----");
		}
		System.out.println();
		System.out.println("Velocidad: " + velocidad + " Marcha: " + marchaActual);
		
	}

	void mantenerTiempo(int segundos) {
		System.out.println("Se mantiene esa velocidad durante: " + segundos + " segundos");
	}

//Se va desacelerando y bajando marchas hasta que el coche se pare.

	void bajarMarcha() {
		for (int marcha = marchaActual; marcha <= 0; marcha--) {
			System.out.println("Bajando de marcha: " + marcha);
		}
	}

	@Override
	public String toString() {
		return "El Vehiculo: " + marca + " " + modelo + " de color: " + color + " con matricula: " + matricula;
	}
	
	
	
	
	
	
	
}//fin
