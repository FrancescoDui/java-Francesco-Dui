package esercitazione.lezione2;
/*
* @author Francesco Dui
* In questa classe si costruira un programma che serva per esercitarsi utilizzando
* varie applicazioni di cilci.
*
* */
import java.util.Scanner;

public class Cicli {
    public static void main(String[] args) {
        Scanner tastiera=new Scanner(System.in);//oggetto per inserire da tastiera
        int numero=tastiera.nextInt();
        do
        {
            System.out.println("Inserire un numero: ");
        }while (numero%2==0);//end while
    }//end main
}//end class
