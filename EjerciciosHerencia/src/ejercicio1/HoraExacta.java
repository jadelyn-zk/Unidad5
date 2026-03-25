package ejercicio1;

public class HoraExacta extends Hora {
    private int segundo;

    public HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);
        if (segundo < 0 || segundo > 59) {
            throw new IllegalArgumentException("Segundo no válido");
        }
        this.segundo = segundo;
    }

    public boolean setSegundo(int valor) {
        if (valor < 0 || valor > 59) return false;
        this.segundo = valor;
        return true;
    }

    @Override
    public void incrementarMinuto() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            super.incrementarMinuto(); // incrementa los minutos (y horas si toca)
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", getHora(), getMinuto(), segundo);
    }
}