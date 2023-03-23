package esercitazione.lezione6;

import esercitazione.lezione6.interfaces.MisurePoligono;

public abstract class  Triangolo implements MisurePoligono {
    private static final Integer nlati=3;
    @Override
    public abstract double calcolaArea();
    @Override
    public abstract double calcolaMediana();
    @Override
    public abstract double calcolaPerimetro();
}
