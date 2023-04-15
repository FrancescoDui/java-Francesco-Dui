package esercitazione.lezione9.heshmap;

import java.util.ArrayList;
import java.util.HashMap;

public class Studente {
    private String nome;
    private String cognome;
    private HashMap<String, ArrayList<Double>> pagella;
    public Studente() {
    }
    public Studente(String nome, String cognome, HashMap<String, ArrayList<Double>> pagella) {
        this.nome = nome;
        this.cognome = cognome;
        this.pagella = pagella;
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
    public HashMap<String, ArrayList<Double>> getPagella() {
        return pagella;
    }
    public void setPagella(HashMap<String, ArrayList<Double>> pagella) {
        this.pagella = pagella;
    }
    public void calcolaMediaVotiPerMAteria(){
        double somma=0.0;
        for(String materia:this.pagella.keySet()) {
            for (Double voti : this.pagella.get(materia)) {
                somma = somma + voti;
            }
            System.out.println("La media dei voti di "+materia+" : "+somma/(double)this.pagella.get(materia).size());
        }
    }
}
