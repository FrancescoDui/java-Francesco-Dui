package esercitazione.lezione4;
/** @author Francesco Dui
 * In questa lezione andremo a mostrare il funzionamento delle funzioni
 * vedendo la dichiarazione (signature) di esse,assieme alla lista di
 * parametri passabili all'interno di esse etc.*/
public class EsFunzioni {
    public static void main(String[] args){
        int primoNumero=6;
        int secondoNumero=10;
        int risultato=eseguiSomma(primoNumero,secondoNumero);
        System.out.println("La somma è: "+risultato);
    }//end main
    /**Questa funzione esegue la somma di due numeri interi,restituendo il risultato:
     primoNumero primo addendo intero passato come parametro
     secondoNumero second oaddendo intero passato come parametro
     risultato restituito
    * */
    public static int eseguiSomma(int primoNumero,int secondoNumero){
        int risultato=primoNumero+secondoNumero;
        return risultato;
    }//end somma
}//end EsFunzioni
