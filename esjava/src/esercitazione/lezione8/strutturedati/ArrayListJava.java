package esercitazione.lezione8.strutturedati;

import java.util.ArrayList;
import java.util.List;
public class ArrayListJava {
    public static void main(String[] args) {
        List<Double> votiInfromatica = new ArrayList<>();
        votiInfromatica.add(6.5);
        votiInfromatica.add(7.0);
        votiInfromatica.add(9.0);
        votiInfromatica.add(2,3.5);
        for(int i=0;i<votiInfromatica.size();i++){
            System.out.println("I miei voti di informatica sono: "+ votiInfromatica.get(i));
        }//end for
        votiInfromatica.remove(2);
        votiInfromatica.set(0,8.25);
        for(Double voto: votiInfromatica){
            System.out.println("\nI miei voti aggiornati sono: "+voto);
        }//end foreach
    }//end main
}//end ArrayList
