package esercitazione.lezione2;

import java.util.logging.SocketHandler;

/*
 * @author Francesco Dui
 * In questa classe implementero una media di un array.
 * */
public class EsMedia {
    /**
     * Questo metodo calcola la media di un array di interi.
      * @param array contiene tutti gli interi
     * @return restituisce direttamente la media.
     */
    public static double eseguiMedia(int[] array){
      double media=0;
      int somma=0;
      for(int i=0;i<array.length;i++)
      {
          somma=somma+array[i];
      }
      media=somma/(double)array.length;
      return media;
  }//end eseguiMedia
    public static void main(String[] args) {
        int [] array={10,10};
        double media=0;
        int somma=0;
        for(int i=0;i<array.length;i++)
        {
            somma=somma+array[i];
        }
        media=somma/(double)array.length;
        System.out.println("La media è: "+media);
        System.out.println("-------------------------------------------------------");
        System.out.println("la media è: "+eseguiMedia(array));
    }//end main
}//end class
