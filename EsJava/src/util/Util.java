package util;

import java.util.Scanner;

public class Util {
    public  static void riempi(int[] array){
        Scanner tastiera=new Scanner(System.in);
        for(int i=0;i<array.length;i++){
            System.out.println("Inserisci un numero: ");
            array[i]=Integer.parseInt(tastiera.nextLine());
        }
    }
    public static int[] crea(int n){
        int[] array=new int[n];
        riempi(array);
        return array;
    }
    public  static void stampa(int[] a){
        Scanner tastiera=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            System.out.println("N°"+i+"->"+a[i]);
        }
    }
    public  static int minimo(int[] a){
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>min)
                min=a[i];
        }
        return min;
    }
    public  static int indiceMinimo(int[] a){
        int min=a[0];
        int ind=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
                ind=i;
            }

        }
        return ind;
    }
}
