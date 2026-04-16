package AgendaTelefonica;

public class Empresa extends Contacto {
    private String paginaWeb;

    public Empresa(String nombre, int telefono, String paginaWeb) {
        super(nombre, telefono);
        this.paginaWeb = paginaWeb;
    }

    @Override
    public String toString() {
        return super.toString() + ", Web: " + paginaWeb;
    }
}
	

