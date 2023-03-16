package esercitazione.lezione5.ereditarieta;

public class Studente extends Persona {
    private String TipoScuola;
    private double mediaVoti;
    private String matricola;
    public Studente() {
    }
    public String getTipoScuola() {
        return TipoScuola;
    }
    public void setTipoScuola(String tipoScuola) {
        TipoScuola = tipoScuola;
    }
    public double getMediaVoti() {
        return mediaVoti;
    }
    public void setMediaVoti(double mediaVoti) {
        this.mediaVoti = mediaVoti;
    }
    public String getMatricola() {
        return matricola;
    }
    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }
    public Studente(String nome, String cognome, Integer eta) {
        super(nome, cognome, eta);
    }
    public Studente(String nome, String cognome, Integer eta, String tipoScuola, double mediaVoti, String matricola) {
        super(nome, cognome, eta);
        TipoScuola = tipoScuola;
        this.mediaVoti = mediaVoti;
        this.matricola = matricola;
    }
    @Override
    public String toString() {
        return "Studente{" +
                "TipoScuola='" + TipoScuola + '\'' +
                ", mediaVoti=" + mediaVoti +
                ", corsiSegiti='" + matricola + '\'' +
                '}';
    }

}
