package ejercicio2;

public class Administrativo extends Empleado {
    public Administrativo(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Administrativo " + getNombre();
    }
}