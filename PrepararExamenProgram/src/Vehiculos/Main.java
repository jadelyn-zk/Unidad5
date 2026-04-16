package Vehiculos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Vehiculo vehiculo= new Vehiculo("Renault", "clio", "rosa", "2017ABC");
		
		
		System.out.println("");
//		Añade además todos aquellos constructores y métodos que veas necesarios para que se puedan llevar a cabo las siguientes acciones:
//			1 El coche parte de una situación de reposo.
//			2 Arranca.
//			3 Acelera e irá subiendo marchas hasta llegar a una velocidad que se ha pedido por teclado al usuario.
//			4 Se mantiene esa velocidad un tiempo que se ha pedido al usuario por teclado.
//			5 Se va desacelerando y bajando marchas hasta que el coche se pare.
//			6 Punto muerto y paramos el motor.

		System.out.println(vehiculo.toString());
		
		//1 presentar
		System.out.println("El vehiculo parte de una situación de reposo.");
		
		//2 arrancar
		vehiculo.arrancar();
		System.out.println("El vehiculo arranca");

		
		//3 pedir velocidad al user(scanner asignar variable)
		//poner trycatch
		System.out.println("Introduce la velocidad a la que quieres llegar");
		int velocidadPedida= sc.nextInt();
		vehiculo.setVelocidadInputUsuario(velocidadPedida);
		vehiculo.saberMarchaSegunVelocidad(velocidadPedida); //set marcha
		vehiculo.subirMarcha(velocidadPedida);
		
		//4 mantener velocidad
		System.out.println("Introduce los segundos que vas a mantener esta velocidad");
		int segundosMantener= sc.nextInt();
		vehiculo.mantenerTiempo(segundosMantener);
		
		// 5 Se va desacelerando y bajando marchas hasta que el coche se pare.

		System.out.println("Pasado el tiempo, desacelera el coche.");
		vehiculo.bajarMarcha();
		System.out.println("El coche llega a punto muerto");
		vehiculo.parar();
		System.out.println("El vehiculo se ha detenido");


		
	}

}
