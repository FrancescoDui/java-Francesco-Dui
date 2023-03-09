package esercitazione.lezione2;
/*
 * @author Francesco Dui
 * In questa classe implementero una media di un array.
 * */
public class EsMedia {
    public static void main(String[] args) {
        int [] array={10,10};
        double media=0;
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
            System.out.println(array.length);
            System.out.println(media+array[i]);
            media=(media+array[i])/array.length;
        }
        System.out.println("La media è: "+media);
    }//end main
}//end class
