package esercitazione.lezione9.eccezioni;

import java.util.*;

public class testStudente {
    public static void main(String[] args) {
        Studente pino= new Studente();
        pino.setNome("Pino");
        pino.setCognome("Lemuri");
        pino.setEta(20);
        ArrayList<Double> voti=new ArrayList<>();
        voti.add(7.5);
        voti.add(6.5);
        voti.add(4.0);
        voti.add(9.25);
        voti.add(3.0);
        pino.setVotiMAteria(voti);
        //pino.setVotiMAteria(new ArrayList<>(Arrays.asList(7.5,6.5,4,9.25,3.0)));
        /*//Giusto per controllare se i dat isono stati inseriti correttamente
        for(Double v:pino.getVotiMAteria())
            System.out.println("Il voto é: "+v);*/
        System.out.println("La media è: "+pino.calcolaMediaVoti());
        //test eccezioni
        Studente s2=new Studente();
        s2.setNome("ciccio");
        s2.setCognome("lol");
        s2.setVotiMAteria(new ArrayList<>(Arrays.asList(7.5,6.5,4.0,2.0,3.0)));
        System.out.println(s2.calcolaMediaVoti());
    }
}
