package domotica;

public class Termostato extends DispositivoInteligente implements EmitirAlerta{

	double temperaturaObjetivo;
	String modoFuncionamiento;
	boolean alertaActiva;
	String mensajeAlerta;
	
	public Termostato(String nombre, String marca, double precio, boolean estaActivo, double temperaturaObjetivo,
			String modoFuncionamiento, boolean alertaActiva, String mensajeAlerta) {
		super(nombre, marca, precio, estaActivo);
		this.temperaturaObjetivo = temperaturaObjetivo;
		this.modoFuncionamiento = modoFuncionamiento;
		this.alertaActiva = alertaActiva;
		this.mensajeAlerta = mensajeAlerta;
	}
	
	public double getTemperaturaObjetivo() {
		return temperaturaObjetivo;
	}
	public String getModoFuncionamiento() {
		return modoFuncionamiento;
	}
	public boolean isAlertaActiva() {
		return alertaActiva;
	}
	public String getMensajeAlerta() {
		return mensajeAlerta;
	}
	public void setTemperaturaObjetivo(double temperaturaObjetivo) {
		this.temperaturaObjetivo = temperaturaObjetivo;
	}
	public void setModoFuncionamiento(String modoFuncionamiento) {
		this.modoFuncionamiento = modoFuncionamiento;
	}
	public void setAlertaActiva(boolean alertaActiva) {
		this.alertaActiva = alertaActiva;
	}
	public void setMensajeAlerta(String mensajeAlerta) {
		this.mensajeAlerta = mensajeAlerta;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void activarAlerta(String mensaje) {
		if(this.alertaActiva==false) {
			this.alertaActiva=true;
			System.out.println("Alerta activa");
		}
	}

	@Override
	public void desactivarAlerta() {
		if(this.alertaActiva==true) {
			this.alertaActiva=false;
			System.out.println("Alerta desactivada");
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
}
