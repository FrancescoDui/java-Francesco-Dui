package esercitazione.lezione5;
/** @author Francesco Dui
 * In questa classe si va ha costruire un archetipo per quanto riguarda un animale generico.*/
public class Animale {
    private String nome="";
    private String tipo="";
    private String razza="";
    private String genere="";
    private int eta;
    private String habitat="";

    public Animale(String nome, String tipo, String razza, String genere, int eta, String habitat) {
        this.nome = nome;
        this.tipo = tipo;
        this.razza = razza;
        this.genere = genere;
        this.eta = eta;
        this.habitat = habitat;
    }

    @Override
    public  String toString() {
        return "Animale{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", razza='" + razza + '\'' +
                ", genere='" + genere + '\'' +
                ", eta=" + eta +
                ", habitat='" + habitat + '\'' +
                '}';
    }
    /*Nel caso usassi un metodo statico perderei il vantaggio di fare affidamento alle variabili già presenti
    * nella classe e dovrei specificarle ogni volta che istanzio la classe e il suo metodo del tiopo
    *  Animale.toString(nome,tipo...) facendo di che il metodo non sia relativo all'oggetto che ho creato ma
    * propio della classe.
    *   */
    public static void main(String[] args) {
        Animale cane=new Animale("Pluto","cane","Bulldog","maschio",2,"appartamento");
        System.out.println(cane.toString());
    }
}
