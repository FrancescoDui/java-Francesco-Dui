package esercitazione.lezione6;

public class Rettangolo extends Triangolo {
    private Double cateto1;
    private Double cateto2;
    private Double ipotenusa;

    public Rettangolo(Double cateto1, Double cateto2, Double ipotenusa) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.ipotenusa = ipotenusa;
    }

    public Double getCateto1() {
        return cateto1;
    }

    public void setCateto1(Double cateto1) {
        this.cateto1 = cateto1;
    }

    public Double getCateto2() {
        return cateto2;
    }

    public void setCateto2(Double cateto2) {
        this.cateto2 = cateto2;
    }

    public Double getIpotenusa() {
        return ipotenusa;
    }

    public void setIpotenusa(Double ipotenusa) {
        this.ipotenusa = ipotenusa;
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "cateto1=" + cateto1 +
                ", cateto2=" + cateto2 +
                ", ipotenusa=" + ipotenusa +
                '}';
    }

    @Override
    public double calcolaArea() {
        return (cateto1*cateto2)/2;
    }
    @Override
    public double calcolaMediana() {
        return 0;
    }
    @Override
    public double calcolaPerimetro() {
        return cateto1+cateto2+ipotenusa;
    }
}
