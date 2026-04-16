package CuentasBancarias;

import java.util.ArrayList;

public class CuentaBancaria {

	
	protected ArrayList<Titular> listaTitulares = new ArrayList<>();	
	protected int numCuenta;
	protected double saldo;
	
	public CuentaBancaria(ArrayList<Titular> listaTitulares, int numCuenta, double saldo) {
		super();
		this.listaTitulares = listaTitulares;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
	}

	public ArrayList<Titular> getListaTitulares() {
		return listaTitulares;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setListaTitulares(ArrayList<Titular> listaTitulares) {
		this.listaTitulares = listaTitulares;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	//metodos
	
	void ingresarDinero(double dineroAIngresar) {
		saldo= saldo + dineroAIngresar;
	}
	
	void retirarDinero(double dineroARetirar) {
		if(saldo>dineroARetirar) {
			saldo = saldo-dineroARetirar;
		}else {
			System.out.println("No se puede retirar más dinero del saldo disponible");
		}
	}
	
	void agregarTitular(ArrayList listaTitulares, Titular titularAñadido ) {
		if(listaTitulares.size()<3) {
			listaTitulares.add(titularAñadido);
		} else {
			System.out.println("Esta cuenta ya tiene 3 titulares");
		}
	}
	
	void quitarTitular(ArrayList listaTitulares, Titular titularEliminado ) {
		if(listaTitulares.size()>1) {
			listaTitulares.remove(titularEliminado);
		} else {
			System.out.println("No puedes borrar el unico titular de la cuenta");
		}
	}
	
	
}//fin
