package esercitazione.lezione4;

import java.util.Arrays;

/** @author Francesco Dui
 * Questo programma implementa una funzione che esegua l'ordinamento di un array il cui tipo è a scelta*/
public class OrdinaArray {
    public static void main(String[] args) {
        int[] arrayInteri={5,2,3,4,1};
        int[] arrayOrdinato = Arrays.copyOf(arrayInteri, arrayInteri.length);
        //solitamente le variabili temporanee si chiamano tmp
        int intermezzo=0;
        //ordine può avere i seguenti valori "cres" e "decr"
        String ordine="decr";
        switch(ordine){
            case "cres":
                for(int i=0;i<arrayOrdinato.length;i++){
                        for (int j = i + 1; j < arrayOrdinato.length; j++) {
                            if (arrayOrdinato[i] > arrayOrdinato[j]){
                                intermezzo=arrayOrdinato[i];
                                arrayOrdinato[i] = arrayOrdinato[j];
                                arrayOrdinato[j]=intermezzo;
                            }//end if
                        }//end for
                    System.out.println(arrayOrdinato[i]);
                }//end for
                break;
            case "decr":
                for(int i=0;i<arrayOrdinato.length;i++){
                    for (int j = i + 1; j < arrayOrdinato.length; j++) {
                        if (arrayOrdinato[i] < arrayOrdinato[j]){
                            intermezzo=arrayOrdinato[i];
                            arrayOrdinato[i] = arrayOrdinato[j];
                            arrayOrdinato[j]=intermezzo;
                        }//end if
                    }//end for
                    System.out.println(arrayOrdinato[i]);
                }//end for
                break;
            default:
                System.out.println("Ordine non disponibile");
                break;
        }//end switch
    }//end main
}//end OrdinaArray