package esercitazione.lezione9.eccezioni;
import esercitazione.lezione9.eccezioni.mieEccezioni.*;

import java.util.List;
public class Studente {
    private String nome;
    private String cognome;
    private Integer eta;
    private List<Double> votiMAteria;
    public Studente(String nome, String cognome, Integer eta, List<Double> votiMAteria) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.votiMAteria = votiMAteria;
    }
    public Studente() {}
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
    public Integer getEta() {
        return eta;
    }
    public void setEta(Integer eta) {
        this.eta = eta;
    }
    public List<Double> getVotiMAteria() {
        return votiMAteria;
    }
    public void setVotiMAteria(List<Double> votiMAteria) {
        this.votiMAteria = votiMAteria;
    }
    public Double calcolaMediaVoti(){
        try{
            if(this.votiMAteria.isEmpty( ) || this.votiMAteria==null)
                throw new EmptyVotiException("Non posso calcolare la media se non ci sono voti");
            Double somma=0.0;
            //questo è un foreach
            for(Double voto: this.votiMAteria)
                somma=somma+voto;
            Double media=somma/(double) this.votiMAteria.size();
            if(media<6)
                throw new MediaInsufficienteException("Media Insufficiente. Capra!");
            return media;
        }catch (MediaInsufficienteException ex){
            System.out.println(ex.getMessage());
        }catch (EmptyVotiException ex){
            System.out.println(ex.getMessage());
        }
        return Double.NEGATIVE_INFINITY;
    }

}
