package domotica;

public interface EmitirAlerta {

//	Los termostatos y las cámaras de seguridad comparten la capacidad de emitir alertas, 
//	activándolas con un mensaje o desactivándolas, y de informar si hay una alerta activa.
//	Activar y desactivar una alerta requiere que el dispositivo esté encendido;
//	si no lo está, se producirá el mismo error.
	
	 void activarAlerta(String mensaje);
	 void desactivarAlerta();
	 boolean hayAlertaActiva();	
	

}
