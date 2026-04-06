package ejercicio4;

import java.util.ArrayList;

public class ejecutable {

    public static void main(String[] args) {

        ArrayList<Electrodomestico> lista = new ArrayList<>();

        lista.add(new Electrodomestico(100, "blanco", 'F', 10));
        lista.add(new Electrodomestico(200, "rojo",   'A', 60));
        lista.add(new Lavadora(200, 15));
        lista.add(new Lavadora(35, 300, "negro", 'B', 70));
        lista.add(new Television(150, 8));
        lista.add(new Television(400, "gris", 'C', 12 ,55 ,true));
        
        double totalElectro      = 0;
        double totalLavadoras    = 0;
        double totalTelevisiones = 0;

        for (Electrodomestico e : lista) {
            double precio = e.precioFinal();
            System.out.println("Precio base: " + e.getPrecioBase() + "€");

            totalElectro += precio;

            if (e instanceof Lavadora) {
                double acumuladoLavadora = totalLavadoras + precio;
                totalLavadoras           = acumuladoLavadora;
            }

            if (e instanceof Television) {
                double acumuladoTv    = totalTelevisiones + precio;
                totalTelevisiones     = acumuladoTv;
            }
        }

        System.out.println("Total electrodomésticos : " + totalElectro      + "€");
        System.out.println("Total lavadoras         : " + totalLavadoras    + "€");
        System.out.println("Total televisiones      : " + totalTelevisiones + "€");
    }
}