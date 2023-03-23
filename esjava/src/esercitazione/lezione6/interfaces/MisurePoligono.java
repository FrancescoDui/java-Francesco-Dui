package esercitazione.lezione6.interfaces;

public interface MisurePoligono {
    /**
     * metodo che calcola l'area di un determinato poligono
     * @return area del poligono
     */
    public double calcolaArea();
    /**
     * metodo che calcola perimetro di un determinato poligono
     * @return perimetro del poligono
     */
    public double calcolaPerimetro();

    /**
     * metodo che calcola la mediana di un determinato poligono
     * @return mediana di un poligono
     */
    public double calcolaMediana();

}
