package esercitazione.lezione9.heshmap;

import java.util.ArrayList;
import java.util.HashMap;

public class testStudente {
    public static void main(String[] args) {
        Studente s=new Studente();
        s.setNome("Pino");
        s.setCognome("Lordi");
        ArrayList<Double> voti = new ArrayList<>();
        voti.add(7.5);
        voti.add(5.0);
        voti.add(8.25);
        voti.add(9.0);
        voti.add(2.0);
        ArrayList<Double> voti1 = new ArrayList<>();
        voti1.add(1.0);
        voti1.add(5.0);
        voti1.add(2.5);
        voti1.add(5.0);
        voti1.add(4.0);
        HashMap<String,ArrayList<Double>> pg=new HashMap<>();
        pg.put("Informatica",voti);
        pg.put("Storia",voti1);
        s.setPagella(pg);
        for (String materia : pg.keySet())
            System.out.println("I voti di "+materia+" : "+pg.get(materia));
        s.calcolaMediaVotiPerMAteria();

    }
}
