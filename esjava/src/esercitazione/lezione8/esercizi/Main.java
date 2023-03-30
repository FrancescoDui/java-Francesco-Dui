package esercitazione.lezione8.esercizi;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Studente Paolo=new Studente("Paolo","Rossi");
        Paolo.addVoti(7.0);
        Paolo.addVoti(4.0);
        Paolo.addVoti(6.0);
        Paolo.addVoti(2.0);
        //Paolo.showVoti();
        Studente Gino=new Studente("Gino","Bianchi");
        Gino.addVoti(7.0);
        Gino.addVoti(8.0);
        Gino.addVoti(6.0);
        Gino.addVoti(9.0);
        Studente Pino=new Studente("Pino","Neve");
        Pino.addVoti(6.0);
        Pino.addVoti(3.0);
        Pino.addVoti(2.0);
        Pino.addVoti(1.0);
        System.out.println(avg(Paolo.getVoti()));
        System.out.println(avg(Gino.getVoti()));
        System.out.println(avg(Pino.getVoti()));
        ArrayList<Double> mediaMedie=new ArrayList<>();
        mediaMedie.add(avg(Paolo.getVoti()));
        mediaMedie.add(avg(Gino.getVoti()));
        mediaMedie.add(avg(Pino.getVoti()));
        System.out.println(avg(mediaMedie));
    }
    public static double avg(ArrayList<Double> votiStudente){
        double somma=0;
        for(Double voto: votiStudente ){
            somma=somma+voto;
        }//end foreach
        double media=somma/votiStudente.size();
        return media;
    }
}
