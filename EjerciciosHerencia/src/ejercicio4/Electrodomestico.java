package ejercicio4;

public class Electrodomestico {

    private String[] listaColores = {"blanco", "negro", "rojo", "azul", "gris"};
    private char[]   listaConsumo = {'A', 'B', 'C', 'D', 'E', 'F'};

    protected double precioBase        = 100;
    protected String color             = "blanco";
    protected char   consumoEnergetico = 'F';
    protected double peso              = 5;

    public Electrodomestico(double precioBase, String color,
                            char consumoEnergetico, double peso) {
        this.precioBase        = precioBase;
        this.color             = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso              = peso;
    }

    public double getPrecioBase() {
    	return precioBase; 
    	}
    
    public void setPrecioBase(double p) {
    	this.precioBase = p; 
    	}

    public String getColor() {
    	return color; 
    	}
    
    public void setColor(String color) {
    	this.color = color; 
    	}

    public char getConsumoEnergetico() { 
    	return consumoEnergetico; 
    	}
    
    public void setConsumoEnergetico(char c) { 
    	this.consumoEnergetico = c; 
    	}

    public double getPeso() { 
    	return peso; 
    	}
    
    public void setPeso(double peso) { 
    	this.peso = peso; 
    	}

    public boolean comprobarConsumoEnergetico(char letra) {
        boolean letraCorrecta = false;
        char letraMinus = Character.toLowerCase(letra);

        for (char letraEnLista : listaConsumo) {
            if (letraEnLista == letraMinus) {
                letraCorrecta = true;
                setConsumoEnergetico(letraMinus);
            }
        }
        return letraCorrecta;
    }

    public boolean comprobarColor(String color) {
        boolean colorCorrecto = false;
        String colorMinus = color.toLowerCase();

        for (String colorEnLista : listaColores) {
            if (colorEnLista.equals(colorMinus)) {
                colorCorrecto = true;
                setColor(colorMinus);
            }
        }
        return colorCorrecto;
    }

    public double precioFinal() {
        double recargoPorConsumo = 0;
        double recargoPorPeso    = 0;

        switch (consumoEnergetico) {
            case 'A' -> recargoPorConsumo = 100;
            case 'B' -> recargoPorConsumo = 80;
            case 'C' -> recargoPorConsumo = 60;
            case 'D' -> recargoPorConsumo = 50;
            case 'E' -> recargoPorConsumo = 30;
            case 'F' -> recargoPorConsumo = 10;
        }

        if (peso >= 0  && peso <= 19) recargoPorPeso = 10;
        if (peso >= 20 && peso <= 49) recargoPorPeso = 50;
        if (peso >= 50 && peso <= 79) recargoPorPeso = 80;
        if (peso > 80)                recargoPorPeso = 100;

        double resultado = precioBase + recargoPorConsumo + recargoPorPeso;

        return resultado;
    }
}