package esercitazione.lezione6;

public class Isoscele extends Triangolo{
    private double lato;
    private double base;
    private double altezza;
    public Isoscele(double lato, double base, double altezza) {
        this.lato = lato;
        this.base = base;
        this.altezza = altezza;
    }
    public double getLato() {
        return lato;
    }
    public void setLato(double lato) {
        this.lato = lato;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltezza() {
        return altezza;
    }
    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }
    @Override
    public String toString() {
        return "isoscele{" +
                "lato=" + lato +
                ", base=" + base +
                ", altezza=" + altezza +
                '}';
    }

    @Override
    public double calcolaArea() {
        return (this.base*this.altezza)/2;
    }

    @Override
    public double calcolaMediana() {
        return 0;
    }

    @Override
    public double calcolaPerimetro() {
        return this.base+this.lato*2;
    }
}
