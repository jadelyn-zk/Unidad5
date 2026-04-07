package ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Poligono> listaPoligonos = new ArrayList<>();
        int opcion;

        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Introducir triangulo \n "
                             + "2. Introducir Rectangulo \n"
                             + "3. Mostrar Polígonos \n"
                             + "0. Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduce lado A: ");
                    double ladoA = sc.nextDouble();
                    System.out.println("Introduce lado B: ");
                    double ladoB = sc.nextDouble();
                    System.out.println("Introduce lado C: ");
                    double ladoC = sc.nextDouble();
                    Triangulo triangulo = new Triangulo(3, ladoA, ladoB, ladoC);
                    listaPoligonos.add(triangulo);
                }
                case 2 -> {
                    System.out.println("Introduce base: ");
                    double ladoA = sc.nextDouble();
                    System.out.println("Introduce altura: ");
                    double ladoB = sc.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(2, ladoA, ladoB);
                    listaPoligonos.add(rectangulo);
                }
                case 3 -> {
                    for (Poligono p : listaPoligonos) {
                        System.out.println(p.toString() + " - Área: " + p.calcularArea());
                    }
                }
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Número fuera de rango");
            }

        } while (opcion != 0);

        sc.close();
    }
}