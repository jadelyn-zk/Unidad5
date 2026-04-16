package AgendaTelefonica;

import java.util.Objects;

public abstract class Contacto {
    private String nombre;
    private int telefono;

    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() { return nombre; }
    public int getTelefono() { return telefono; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setTelefono(int telefono) { this.telefono = telefono; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contacto other = (Contacto) obj;
        return Objects.equals(nombre, other.nombre) || telefono == other.telefono;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, telefono);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Teléfono: " + telefono;
    }
}