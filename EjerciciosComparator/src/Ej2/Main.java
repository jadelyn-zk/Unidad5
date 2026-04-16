package Ej2;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        ArrayList<Socio> socios = new ArrayList<>();
        
        // AÑADIR SOCIOS
        socios.add(new Socio("Ana García", 25));
        socios.add(new Socio("Carlos López", 30));
        socios.add(new Socio("Beatriz Ruiz", 28));
        socios.add(new Socio("David Pérez", 22));
        socios.add(new Socio("Eva Martínez", 35));
        socios.add(new Socio("Ana Torres", 27));
        
        System.out.println("Original:");
        socios.forEach(System.out::println);
        
        // 1. Ordenar por nombre (alfabético)
        Collections.sort(socios, new ComparadoraNombres());
        System.out.println("\nPor nombre (alfabético):");
        for (Socio socioEnLista : socios) {
        	System.out.println(socioEnLista);
        }
        
        // 2. Ordenar por edad (mayor a menor)
        Collections.sort(socios, new ComparadoraEdad());
        System.out.println("\nPor edad (mayor a menor):");
        for (Socio socioEnLista : socios) {
        	System.out.println(socioEnLista);
        }
        
    }
}