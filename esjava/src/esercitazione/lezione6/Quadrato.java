package esercitazione.lezione6;

import esercitazione.lezione6.interfaces.MisurePoligono;

public class Quadrato implements MisurePoligono {
    public static final Integer nLati=4;
    private double valoreLato;
    public Quadrato(double valoreLato) {
        this.valoreLato = valoreLato;
    }
    public double getValoreLato() {
        return valoreLato;
    }
    public void setValoreLato(double valoreLato) {
        this.valoreLato = valoreLato;
    }
    @Override
    public String toString() {
        return "Quadrato{" +
                "valoreLato=" + valoreLato +
                '}';
    }
    @Override
    public double calcolaArea() {
        return Math.pow(this.valoreLato,2);//return valoreLato *valoreLato
    }
    @Override
    public double calcolaPerimetro() {
        return valoreLato*4;//return valoreLato*4
    }
    @Override
    public double calcolaMediana() {
        return 0;
    }


}
