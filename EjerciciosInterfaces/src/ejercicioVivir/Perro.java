// Perro.java
package ejercicioVivir;

public class Perro extends AnimalDomestico {

    public Perro(String nombre, String raza, double peso, String color) {
        super(nombre, raza, peso, color);
    }

    @Override
    public boolean hacerRuido() {
        System.out.println(nombre + " ladra: woof woof");
        return true;
    }

    @Override
    public boolean hacerCaso() {
        return Math.random() < 0.90; // 90% de las veces
    }

    public void sacarPaseo() {
        System.out.println(nombre + " está disfrutando del paseo.");
    }
}