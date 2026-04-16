// Gato.java
package ejercicioVivir;

public class Gato extends AnimalDomestico {

    public Gato(String nombre, String raza, double peso, String color) {
        super(nombre, raza, peso, color);
    }

    @Override
    public boolean hacerRuido() {
        System.out.println(nombre + " maúlla: meow");
        return true;
    }

    @Override
    public boolean hacerCaso() {
        return Math.random() < 0.05; // 5% de las veces
    }

    public void toserBolaPelo() {
        System.out.println(nombre + " vomita una bola de pelo.");
    }
}