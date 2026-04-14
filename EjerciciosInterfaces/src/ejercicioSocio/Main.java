package ejercicioSocio;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

    ArrayList<Socio> listaSocios = new ArrayList<>();

        // --- Comprobación de compareTo ---
        Socio s1 = new Socio(10, "Ana",  30);
        Socio s2 = new Socio(3,  "Luis", 25);

        System.out.println("Socio1:Ana | ID:10 comparar a Socio2: Luis ID:3 → "
        		+ "\n SI ES MAYOR EL PRIMERO DARÁ POSITIVO= " + s1.compareTo(s2)); //positivo si es mayor el 1 
        System.out.println("Socio2:LUIS | ID:3 comparar a Socio2: ANA ID:10 → "
        		+ "\n SI ES MENOR EL PRIMERO DARÁ NEGATIVO" + s2.compareTo(s1)); // negativo pq el primero es MENOR
        System.out.println("COMPARA ANA CON ANA, MISMO ID: 10."
        		+ "\n si soniguales dara 0= " + s1.compareTo(s1)); // IGUALES PQ COMPARA EL MISMO

        listaSocios.add(new Socio(42, "Carlos", 22));
        listaSocios.add(new Socio(5,  "Lucía",  35));
        listaSocios.add(new Socio(18, "Pedro",  28));
        listaSocios.add(new Socio(1,  "Sofía",  19));
        listaSocios.add(new Socio(9,  "Javier", 45));

        System.out.println("\n=== ArrayList ANTES de ordenar ===");
        for (Socio s : listaSocios) System.out.println(s);

        Collections.sort(listaSocios); // usa compareTo internamente, igual que Arrays.sort

        System.out.println("\n=== ArrayList DESPUÉS de ordenar ===");
        for (Socio s : listaSocios) System.out.println(s);
    }
}