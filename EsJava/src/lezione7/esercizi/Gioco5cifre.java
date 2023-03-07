package lezione7.esercizi;
import util.Util;
import java.util.Random;
import java.util.Scanner;

public class Gioco5cifre {
    public static void main(String[] args) {
        Random casuale=new Random();
        Scanner tastiera=new Scanner(System.in);
        int dimensione=2;
        int[] codiceSegreto=new int[dimensione];
        String codiceSegretoStringa="";
        for(int i=0;i<codiceSegreto.length;i++){
            codiceSegreto[i]=casuale.nextInt(10);
            codiceSegretoStringa+=codiceSegreto[i];
        }//end for
        System.out.println(codiceSegretoStringa);
        System.out.println("Inserisci un numero di "+ dimensione +" cifre : ");
        String codiceGiocatore=tastiera.nextLine();
        System.out.println(codiceGiocatore);
    }//end main
}//end Gioco5cifre
