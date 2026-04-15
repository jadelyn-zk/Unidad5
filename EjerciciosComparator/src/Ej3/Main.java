package Ej3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Futbolista> futbolistas = new ArrayList<>();

        // AÑADIR FUTBOLISTAS
        futbolistas.add(new Futbolista("Lionel Messi", 38, 672));
        futbolistas.add(new Futbolista("Cristiano Ronaldo", 40, 701));
        futbolistas.add(new Futbolista("Kylian Mbappé", 26, 356));
        futbolistas.add(new Futbolista("Erling Haaland", 25, 289));
        futbolistas.add(new Futbolista("Harry Kane", 32, 402));
        futbolistas.add(new Futbolista("Robert Lewandowski", 36, 644));

        System.out.println("Original:");
        for (Futbolista f : futbolistas) {
            System.out.println(f);
        }

        // Ordenar por goles (mayor a menor)
        Collections.sort(futbolistas, new ComparadoraGoles());
        System.out.println("\nPor goles (mayor a menor):");
        for (Futbolista f : futbolistas) {
            System.out.println(f);
        }
        
        // Ordenar por edad (mayor a menor)
        Collections.sort(futbolistas, new ComparadoraEdad());
        System.out.println("\nPor Edad (menor a mayor");
        for (Futbolista f : futbolistas) {
        	System.out.println(f);
        }

    }
}