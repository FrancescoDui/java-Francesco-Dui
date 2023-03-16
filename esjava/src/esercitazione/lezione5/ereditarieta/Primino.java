package esercitazione.lezione5.ereditarieta;

public class Primino extends Studente{
    private Integer anno;
    private String classe;

    public Primino(Integer anno, String classe) {
        this.anno = anno;
        this.classe = classe;
    }

    public Primino(String nome, String cognome, Integer eta, String tipoScuola, double mediaVoti, String matricola) {
        super(nome, cognome, eta, tipoScuola, mediaVoti, matricola);
    }

    public Primino(String nome, String cognome, Integer eta, String tipoScuola, double mediaVoti, String matricola, Integer anno, String classe) {
        super(nome, cognome, eta, tipoScuola, mediaVoti, matricola);
        this.anno = anno;
        this.classe = classe;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}
