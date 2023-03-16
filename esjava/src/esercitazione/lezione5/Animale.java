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
    private  String comportamento="";

    public Animale() {
    }

    public String getNome() {
        return nome;
    }

    public String getRazza() {
        return razza;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getComportamento() {
        return comportamento;
    }

    public void setComportamento(String comportamento) {
        this.comportamento = comportamento;
    }

    public Animale(String nome, String tipo, String razza, String genere, int eta, String habitat, String comportamento) {
        this.nome = nome;
        this.tipo = tipo;
        this.razza = razza;
        this.genere = genere;
        this.eta = eta;
        this.habitat = habitat;
        this.comportamento=comportamento;
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
        Animale cane=new Animale("Pluto","cane","Bulldog","maschio",2,"appartamento","tranquillo");
        System.out.println(cane.toString());
    }
}
