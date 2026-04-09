// Main.java
package ejercicioVivir;

public class Main {

    public static void main(String[] args) {

        Perro perro = new Perro("Willyrex",   "Labrador", 30, "Amarillo");
        Gato  gato  = new Gato ("Mandarina",  "Naranja",    4, "Blanco");

        // Métodos comunes
        System.out.println("=== Métodos comunes ===");
        System.out.println("Vacunar perro: " + perro.vacunar());
        System.out.println("Dormir gato:   " + gato.dormir());
        System.out.println("Comer perro:   " + perro.comer());

        // hacerRuido
        System.out.println("\nRuidos");
        perro.hacerRuido();
        gato.hacerRuido();

        // hacerCaso
        System.out.println("\nHacer Caso (5 intentos cada uno)");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Perro intento " + i + ": " + perro.hacerCaso());
            System.out.println("Gato  intento " + i + ": " + gato.hacerCaso());
        }

        // Métodos propios
        System.out.println("\nMétodos propios");
        perro.sacarPaseo();
        gato.toserBolaPelo();
    }
}