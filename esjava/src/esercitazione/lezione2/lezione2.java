package esercitazione.lezione2;

import java.util.Scanner;

public class lezione2 {
    public static void main(String[] args) {
        Scanner tastiera=new Scanner(System.in);//oggetto per inserire da tastiera
        System.out.println("Inserisci il nome del tuo animale domestico : ");
        String nomeAnimale=tastiera.nextLine();
        System.out.println("Il nome del mio animale domestico è: "+nomeAnimale);

    }
}
