package esercitazione.lezione4;
/** @author Francesco Dui
 * Questo programma controlla se ci sono righe uguali
 *  all'interno di una matrice*/
import java.util.Scanner;

public class RigaUgualeMatrice {
    public static void main(String[] args) {
        Scanner tastiera=new Scanner(System.in);
        int [][] matrice={{1,2,3},{1,2,3}};
        int numeroRigheUguali=0;
        for(int i=0;i<matrice.length;i++){
            boolean uguali=true;
            for(int j=0;j<matrice[i].length;j++){
                if(i+1<matrice.length){
                    if(matrice[i][j]==matrice[i+1][j])
                        uguali=uguali && true;
                    else
                        uguali=uguali && false;
                }//end if
            }//end for
            if(uguali)
                numeroRigheUguali+=1;
        }//end for
        System.out.println("Ci sono "+numeroRigheUguali+" righe uguali nella matrice");
    }//end main
}//end RigaUgualeMatrice
