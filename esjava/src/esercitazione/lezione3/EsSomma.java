package esercitazione.lezione2;

import java.util.Scanner;

/*
 * @author Francesco Dui
 * In questa classe implementero una somma di un numero ed in base a tale,iterare ed eseguire la somma di due numeri,
 * tenendo il valore della somma ,stampando poi il valore della somma corrente ed il risultato finale.
 * */
public class EsSomma {
    public static void main(String[] args) {
        Scanner tastiera=new Scanner(System.in);
        boolean notstop=true;
        int somma=0;
        do {
            System.out.println("Inserisci un numero:");
            int numero=tastiera.nextInt();
            tastiera.nextLine();
            somma=somma+numero;
            System.out.println("la somma è: "+somma);
            System.out.println("vuoi continuare y/n?");
            String continua=tastiera.nextLine();
            if(continua.equalsIgnoreCase("y"))
            {
                notstop=true;
            }
            else
            {
                notstop=false;
            }//end if
        }while (notstop);
        notstop=true;
        somma=0;
        while (notstop){
            System.out.println("Inserisci un numero:");
            int numero=tastiera.nextInt();
            tastiera.nextLine();
            somma=somma+numero;
            System.out.println("la somma è: "+somma);
            System.out.println("vuoi continuare y/n?");
            String continua=tastiera.nextLine();
            if(continua.equalsIgnoreCase("y"))
            {
                notstop=true;
            }
            else
            {
                notstop=false;
            }//end if
        }//end while
        somma=0;
        for(int i=1;0<i;i++){
            System.out.println("Inserisci un numero:");
            int numero=tastiera.nextInt();
            tastiera.nextLine();
            somma=somma+numero;
            System.out.println("la somma è: "+somma);
            System.out.println("vuoi continuare y/n?");
            String continua=tastiera.nextLine();
            if(!continua.equalsIgnoreCase("y"))
            {
                break;
            }//end if
        }//end for
    }//end main
}//end class
