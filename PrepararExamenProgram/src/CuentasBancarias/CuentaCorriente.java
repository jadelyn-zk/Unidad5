package CuentasBancarias;

import java.util.ArrayList;

public class CuentaCorriente extends CuentaBancaria{

	double porcentajeCobradoPorTransaccion;
	int numTransacciones;
	protected ArrayList<Transaccion> listaTransacciones = new ArrayList<>();
	
	public CuentaCorriente(ArrayList<Titular> listaTitulares, int numCuenta, double saldo,
			double porcentajeCobradoPorTransaccion, int numTransacciones, ArrayList<Transaccion> listaTransacciones) {
		super(listaTitulares, numCuenta, saldo);
		this.porcentajeCobradoPorTransaccion = porcentajeCobradoPorTransaccion;
		this.numTransacciones = numTransacciones;
		this.listaTransacciones = listaTransacciones;
	} 
	
	
	void añadirTransaccion(ArrayList listaArrayList, Transaccion transaccion) {
		listaArrayList.add(transaccion);
	}
}
	

