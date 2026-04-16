package ejercicioVivir;

public abstract class AnimalDomestico implements Animal, Vivir {

    String nombre;
    String raza;
    double peso;
    String color;

    public AnimalDomestico(String nombre, String raza, double peso, String color) {
        super();
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.color = color;
    }

    public boolean vacunar() { return true; }
    public boolean dormir()  { return true; }
    public boolean comer()   { return true; }

    public abstract boolean hacerRuido();
    public abstract boolean hacerCaso();
}