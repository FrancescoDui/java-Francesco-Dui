package esercitazione.lezione5;

public class Persona {
    private String nome;
    private String cognome;
    private Integer eta;

    /**
     * Empty constructor
     */
    public Persona()
    {}

    /**
     * Full constructor
     * @param nome
     * @param cognome
     * @param eta
     */
    public Persona(String nome, String cognome, Integer eta) //variabili locali
    {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    @Override
    public String toString()
    {
        return "Le caratterstiche dell'oggetto persona sono: \n" +
                "\t NOME: " + this.nome + "\n" +
                "\t COGNOME: " + this.cognome + "\n" +
                "\t ETA': " + this.eta + "\n";
    }

    public static void main(String[] args)
    {
        Persona p = new Persona("Ciccio", "Graziani", 40);
        System.out.println(p.toString());
    }
}
