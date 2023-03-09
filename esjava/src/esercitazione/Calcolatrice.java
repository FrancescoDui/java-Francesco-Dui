/*
* @author Francesco Dui
* In questa classe implementero una clacloatrice scientifica,con tutte le normali operazioni come
* somma,sottrazione,divisione e prodotto e inoltre aggiungero l'operazione di radice quadrata e potenza e il coseno.
* Lo user inserirà i valori numerici da tastiera.
* */
package esercitazione;
import java.util.Scanner;
public class Calcolatrice {
    public static void main(String[] args) {
        double primoNumero;
        double secondoNumero;
        int sceltaOperazione;
        double risultato=0;
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Che operazione vuoi fare? \n1) Addizione\n 2) Sottrazione\n 3) Prodotto\n 4) Divisione\n" +
                "5) Poenza/Radice 6) SENO\n 7) COSENO\n--------\n");
        sceltaOperazione = tastiera.nextInt();
        switch (sceltaOperazione){
            case 1:
                System.out.println("Inserire il primo numero:");
                primoNumero = tastiera.nextInt();
                System.out.println("Inserire il secondo numero:");
                secondoNumero = tastiera.nextInt();
                risultato=primoNumero+secondoNumero;
                break;
            case 2:
                System.out.println("Inserire il primo numero:");
                primoNumero = tastiera.nextInt();
                System.out.println("Inserire il secondo numero:");
                secondoNumero = tastiera.nextInt();
                risultato=primoNumero-secondoNumero;
                break;
            case 3:
                System.out.println("Inserire il primo numero:");
                primoNumero = tastiera.nextInt();
                System.out.println("Inserire il secondo numero:");
                secondoNumero = tastiera.nextInt();
                risultato=primoNumero*secondoNumero;
                break;
            case 4:
                System.out.println("Inserire il primo numero:");
                primoNumero = tastiera.nextInt();
                System.out.println("Inserire il secondo numero:");
                secondoNumero = tastiera.nextInt();
                if(secondoNumero!=0){
                risultato=primoNumero/secondoNumero;}
                else {
                    System.out.println("Errore");
                }
                break;
            case 5:
                System.out.println("Cosa vuoi svolgere:\n 1)Radice\n 2)Potenza");
                sceltaOperazione = tastiera.nextInt();
                switch(sceltaOperazione){
                    case 1:
                        System.out.println("Inserire il numero: ");
                        primoNumero = tastiera.nextInt();
                        if(primoNumero<0)
                            System.out.println("Errore");
                        else {
                            System.out.println("Inserire il valore della Radice:");
                            secondoNumero = tastiera.nextInt();
                            risultato = Math.pow(primoNumero, secondoNumero);
                        }
                        break;
                    case 2:
                        System.out.println("Inserire il numero: ");
                        primoNumero = tastiera.nextInt();
                        System.out.println("Inserire il valore della Potenza:");
                        secondoNumero = tastiera.nextInt();
                        risultato = Math.pow(primoNumero, secondoNumero);
                        break;
                    default:
                        System.out.println("Errore");
                        break;
                }
                break;
            case 6:
                System.out.println("Inserire l'angolo in gradi: ");
                primoNumero=tastiera.nextInt();
                risultato = Math.sin(Math.toRadians(primoNumero));
                break;
            case 7:
                System.out.println("Inserire l'angolo in gradi: ");
                primoNumero=tastiera.nextInt();
                risultato = Math.cos(Math.toRadians(primoNumero));
                break;
            default:
                System.out.println("Errore");
                break;
        }
        //if(risultato)
            System.out.println("Il risultato è:"+risultato);
    }
}
