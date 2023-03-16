package esercitazione.lezione5.ereditarieta;

public class Preside extends Persona{
    private int Stipendio;
    private String agenda;
    private String classe;
    private boolean presenza;
    public Preside() {}
    public Preside(String nome, String cognome, Integer eta, int stipendio, String agenda, String classe, boolean presenza) {
        super(nome, cognome, eta);
        Stipendio = stipendio;
        this.agenda = agenda;
        this.classe = classe;
        this.presenza = presenza;
    }

    public int getStipendio() {
        return Stipendio;
    }

    public void setStipendio(int stipendio) {
        Stipendio = stipendio;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public boolean isPresenza() {
        return presenza;
    }

    public void setPresenza(boolean presenza) {
        this.presenza = presenza;
    }

    @Override
    public String toString() {
        return "Preside{" +
                "Stipendio=" + Stipendio +
                ", agenda='" + agenda + '\'' +
                ", classe='" + classe + '\'' +
                ", presenza=" + presenza +
                '}';
    }
}
