package esercitazione.lezione5;

import esercitazione.lezione5.ereditarieta.Primino;
import esercitazione.lezione5.ereditarieta.Studente;
import esercitazione.lezione5.ereditarieta.Persona;
import esercitazione.lezione5.ereditarieta.Segreteria;
import esercitazione.lezione5.ereditarieta.Preside;

public class Test {
    public static void main(String[] args) {
        Animale gatto = new Animale();
        gatto.setNome("Pallocchio");
        System.out.println(gatto.getNome());
        Habitat alpi = new Habitat();
        alpi.setBioma("alpino");
        alpi.setClima("montagna-continentale");
        alpi.setTemperaturaMedia(-3);
        alpi.setAltitudine(2200);
        System.out.println(alpi.toString());
        Studente gino = new Studente();
        gino.setTipoScuola("Tecnico Agrario");
        gino.setMediaVoti(5.5);
        gino.setMatricola("216543");
        System.out.println(gino.toString());

    }
}
