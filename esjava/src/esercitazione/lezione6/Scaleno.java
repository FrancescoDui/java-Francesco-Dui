package esercitazione.lezione6;

public class Scaleno extends Triangolo{
    private double base;
    private double lato2;
    private double lato3;
    private double altezza;

    public Scaleno(double lato1, double lato2, double lato3 ,double altezza) {
        this.base = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
        this.altezza=altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLato2() {
        return lato2;
    }

    public void setLato2(double lato2) {
        this.lato2 = lato2;
    }

    public double getLato3() {
        return lato3;
    }

    public void setLato3(double lato3) {
        this.lato3 = lato3;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public String toString() {
        return "Scaleno{" +
                "base=" + base +
                ", lato2=" + lato2 +
                ", lato3=" + lato3 +
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
        return this.base+this.lato2+this.lato3;
    }
}
