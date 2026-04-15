package CuentasBancarias;

import java.util.ArrayList;

public class CuentaAhorro extends CuentaBancaria{

	double cuotaMantenimiento=20;
	double interesAnual;
	
	public CuentaAhorro(ArrayList<Titular> listaTitulares, int numCuenta, double saldo, double cuotaMantenimiento,
			double interesAnual) {
		super(listaTitulares, numCuenta, saldo);
		this.cuotaMantenimiento = cuotaMantenimiento;
		this.interesAnual = interesAnual;
	}
	
	double calcularSaldoInteres() {
		return saldo * interesAnual;
	};
	
	void cobrarMantenimiento() {
		saldo = saldo - cuotaMantenimiento;
	};
	

}
