package lezione8.esercizi;

public class RicorsioneEsercizi {
    public static int somma(int[] array,int indice){
        System.out.println("indice "+indice);
        if(indice==array.length-1)
        {
            System.out.println("indice "+indice);
            System.out.println("numero "+array[indice]);
            return array[indice];
        }
            System.out.println("totale "+array[indice]);
          return array[indice]+somma(array,indice+1);
    }//end somma
}
