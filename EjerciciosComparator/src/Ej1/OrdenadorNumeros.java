package Ej1;

import java.util.*;
import Ej1.Comparadora;

public class OrdenadorNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        // 20 números aleatorios
        for (int i = 0; i < 20; i++) {
            numeros.add((int)(Math.random() * 100) + 1);
        }
        
        Collections.sort(numeros, new Comparadora());
        // Ahora está ordenado decreciente
        
        System.out.println(numeros.toString());
    }
}
