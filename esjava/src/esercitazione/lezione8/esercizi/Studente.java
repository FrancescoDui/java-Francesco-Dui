package esercitazione.lezione8.esercizi;

import java.util.ArrayList;
import java.util.List;

/*Dichiarare una classe studente e calcolare la media di ogni studente
*   calcolare la media di tutte le medie*/
public class Studente{
    private String nome;
    private String cognome;
    private ArrayList<Double> voti;

    public void setVoti(ArrayList<Double> voti) {
        this.voti = voti;
    }

    public Studente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.voti=new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void addVoti(double voto){
        voti.add(voto);
    }

    public ArrayList<Double> getVoti() {
        return voti;
    }
    public void showVoti()
    {
        for(Double v:this.voti)
            System.out.println("I voti sono: "+"\t " + v);
    }
    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome +
                '}';
    }

}
