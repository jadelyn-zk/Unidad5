package ejercicio1;

public class Hora {
    private int hora;
    private int minuto;

    public Hora(int hora, int minuto) {
        if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Hora o minuto no válidos");
        }
        this.hora = hora;
        this.minuto = minuto;
    }

    public void incrementarMinuto() {
        minuto++;
        if (minuto == 60) {
            minuto = 0;
            hora = (hora + 1) % 24;
        }
    }

    public boolean setMinutos(int valor) {
        if (valor < 0 || valor > 59) return false;
        this.minuto = valor;
        return true;
    }

    public boolean setHora(int valor) {
        if (valor < 0 || valor > 23) return false;
        this.hora = valor;
        return true;
    }

    public int getHora()   { return hora; }
    public int getMinuto() { return minuto; }

    @Override
    public String toString() {
        return hora + ":" + String.format("%02d", minuto);
    }
}