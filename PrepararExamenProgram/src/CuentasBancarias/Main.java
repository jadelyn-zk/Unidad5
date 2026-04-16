package CuentasBancarias;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		        // --- TITULARES ---
		        Titular t1 = new Titular("12345678A", "Juan", "García", 600111222);
		        Titular t2 = new Titular("87654321B", "María", "López", 600333444);
		        Titular t3 = new Titular("11111111C", "Pedro", "Martínez", 600555666);

		        ArrayList<Titular> titulares = new ArrayList<>();
		        titulares.add(t1);

		        // --- CUENTA CORRIENTE ---
		        ArrayList<Transaccion> transacciones = new ArrayList<>();
		        CuentaCorriente cc = new CuentaCorriente(titulares, 1001, 1000.0, 0.02, 0, transacciones);

		        System.out.println("=== CUENTA CORRIENTE ===");
		        System.out.println("Saldo inicial: " + cc.getSaldo());

		        cc.ingresarDinero(500);
		        System.out.println("Tras ingresar 500: " + cc.getSaldo());

		        cc.retirarDinero(200);
		        System.out.println("Tras retirar 200: " + cc.getSaldo());

		        cc.retirarDinero(5000); // retirar más de lo que hay

		        // Añadir transacción
		        Transaccion tr1 = new Transaccion(14, 4, 2026, "Compra supermercado", 85.50);
		        cc.añadirTransaccion(cc.listaTransacciones, tr1);
		        System.out.println("Transacciones en cuenta: " + cc.listaTransacciones.size());

		        // Añadir y quitar titulares
		        cc.agregarTitular(cc.listaTitulares, t2);
		        cc.agregarTitular(cc.listaTitulares, t3);
		        System.out.println("Titulares tras añadir: " + cc.getListaTitulares().size());

		        cc.quitarTitular(cc.listaTitulares, t3);
		        System.out.println("Titulares tras quitar uno: " + cc.getListaTitulares().size());

		        // --- CUENTA AHORRO ---
		        ArrayList<Titular> titulares2 = new ArrayList<>();
		        titulares2.add(t2);
		        CuentaAhorro ca = new CuentaAhorro(titulares2, 2001, 5000.0, 20.0, 0.03);

		        System.out.println("\n=== CUENTA AHORRO ===");
		        System.out.println("Saldo inicial: " + ca.getSaldo());

		        double interes = ca.calcularSaldoInteres();
		        System.out.println("Interés anual generado: " + interes);

		        ca.cobrarMantenimiento();
		        System.out.println("Saldo tras cobrar mantenimiento: " + ca.getSaldo());

		        // Intentar quitar el único titular
		        ca.quitarTitular(ca.listaTitulares, t2);
	}
}
