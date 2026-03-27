package ejercicio3;

public class Perecedero extends Producto {
    private int diasACaducar;

    public Perecedero(String nombre, double precio, int diasACaducar) {
        super(nombre, precio);
        this.diasACaducar = diasACaducar;
    }

    public int getDiasACaducar()            { 
    	return diasACaducar; 
    	}
    
    public void setDiasACaducar(int dias)   {
    	this.diasACaducar = dias; 
    }
    
    @Override
    public double calcular(int cantidad) {
        double total = super.calcular(cantidad);
        if (diasACaducar == 1) {
        	total= total / 4;
        }
        else if (diasACaducar == 2) {
        	total= total / 3;
        }
        else if (diasACaducar == 3) {
        	total= total / 2;
        }
        return total;
    }

    @Override
    public String toString() {
        return "Producto perecedero: " + getNombre() + ", Precio: " + getPrecio()
             + ", Días para que caduque: " + diasACaducar;
    }
}