package domotica;

public class Camaras extends DispositivoInteligente implements EmitirAlerta{

	boolean grabando=false;
	int resolucion;
	boolean alertaActiva;
	String mensajeAlerta;
	
	
	public Camaras(String nombre, String marca, double precio, boolean estaActivo, boolean grabando, int resolucion,
			boolean alertaActiva, String mensajeAlerta) {
		super(nombre, marca, precio, estaActivo);
		this.grabando = grabando;
		this.resolucion = resolucion;
		this.alertaActiva = alertaActiva;
		this.mensajeAlerta = mensajeAlerta;
	}

	
	public boolean isGrabando() {
		return grabando;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isAlertaActiva() {
		return alertaActiva;
	}

	public String getMensajeAlerta() {
		return mensajeAlerta;
	}

	public void setGrabando(boolean grabando) {
		this.grabando = grabando;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public void setAlertaActiva(boolean alertaActiva) {
		this.alertaActiva = alertaActiva;
	}

	public void setMensajeAlerta(String mensajeAlerta) {
		this.mensajeAlerta = mensajeAlerta;
	}


	@Override
	public String toString() {
		return "Camaras [grabando=" + grabando + ", resolucion=" + resolucion + ", alertaActiva=" + alertaActiva
				+ ", mensajeAlerta=" + mensajeAlerta + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio
				+ ", estaActivo=" + estaActivo + "]";
	}


	@Override
	public void activarAlerta(String mensaje) {
		if(this.alertaActiva==false) {
			this.alertaActiva=true;
			this.mensajeAlerta="Alerta activada";
			System.out.println(mensajeAlerta);
		}
	}

	@Override
	public void desactivarAlerta() {
		if(this.alertaActiva==true) {
			this.alertaActiva=false;
			this.mensajeAlerta="Alerta desactivada";
			System.out.println(mensajeAlerta);
			
		} 
	}

	
	@Override
	public boolean hayAlertaActiva() {
		boolean alertaActiva=false;
		if(this.alertaActiva=true) {
			alertaActiva=true;
		}
		return alertaActiva;
	}

	public boolean alternarGrabacion() {
		this.grabando = !this.grabando;
		return this.grabando;
		
	}
	
	
}//fin

