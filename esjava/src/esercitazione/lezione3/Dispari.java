package esercitazione.lezione2;

import java.util.Scanner;
/*
 * @author Francesco Dui
 * In questa classe si costruira un programma che serva per sommare tutti i numeri dispari utilizzand oun cilco do-while
 * */
public class Dispari {
    public static void main(String[] args) {
        Scanner tastiera=new Scanner(System.in);//oggetto per inserire da tastiera
        int numero=0;
        int somma=0;
        do
        {
            System.out.println("Inserire un numero: ");
            numero=tastiera.nextInt();
            if(numero%2!=0)
                somma=numero+somma;
            System.out.println("la somma è: "+somma);
        }while (numero%2!=0);//end while
    }//end main
}
