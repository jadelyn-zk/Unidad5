package ejercicioFutbolista;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Futbolista f1 = new Futbolista(10, "Messi",  35, 20);
        Futbolista f2 = new Futbolista(7,  "Ronaldo", 38, 18);
        Futbolista f3 = new Futbolista(10, "Neymar", 31, 15);

        // Comprobación compareTo
        System.out.println("=== Comparaciones ===");
        System.out.println("f1.compareTo(f2) F1: Messi n10 F2:Ronaldo n7 → " + f1.compareTo(f2)); // >0 (10 > 7)
        System.out.println("f2.compareTo(f1) F1: Messi n10 F2:Ronaldo n7 →" + f2.compareTo(f1)); // <0 (7 < 10)
        System.out.println("f1.compareTo(f3) F1: Messi n10 F3:Neymar n10 (compara x nombre) →" + f1.compareTo(f3)); // mismo número, M antes que N → <0

        // Ordenación
        ArrayList<Futbolista> lista = new ArrayList<>();
        lista.add(f1);
        lista.add(f2);
        lista.add(f3);

        System.out.println("\nANTES:");
        for (Futbolista f : lista) System.out.println(f);

        Collections.sort(lista);

        System.out.println("\nDESPUÉS:");
        for (Futbolista f : lista) System.out.println(f);
    }
}