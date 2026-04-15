package AgendaTelefonica;

public class Persona extends Contacto {
    private String cumpleaños;

    public Persona(String nombre, int telefono, String cumpleaños) {
        super(nombre, telefono);
        this.cumpleaños = cumpleaños;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cumpleaños: " + cumpleaños;
    }
}