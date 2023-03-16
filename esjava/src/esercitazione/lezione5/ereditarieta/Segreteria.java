package esercitazione.lezione5.ereditarieta;

public class Segreteria extends Persona {
    private int Stipendio;
    private String agenda;
    private boolean presenza;
    private String orario;

    public Segreteria() {
    }

    public Segreteria(String nome, String cognome, Integer eta, int stipendio, String agenda, boolean presenza, String orario) {
        super(nome, cognome, eta);
        Stipendio = stipendio;
        this.agenda = agenda;
        this.presenza = presenza;
        this.orario = orario;
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

    public boolean isPresenza() {
        return presenza;
    }

    public void setPresenza(boolean presenza) {
        this.presenza = presenza;
    }

    public String getOrario() {
        return orario;
    }

    public void setOrario(String orario) {
        this.orario = orario;
    }

    @Override
    public String toString() {
        return "Segreteria{" +
                "Stipendio=" + Stipendio +
                ", agenda='" + agenda + '\'' +
                ", presenza=" + presenza +
                ", orario='" + orario + '\'' +
                '}';
    }
}
