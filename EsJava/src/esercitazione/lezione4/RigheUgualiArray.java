package esercitazione.lezione4;
/* @author Francesco Dui
* Questo programma controlla se esistono delle righe uguali tra due array*/
import java.util.Scanner;

public class RigheUgualiArray {
    public static void main(String[] args) {
        Scanner tastiera=new Scanner(System.in);
        int [][] primaMatrice={{1,2,3},{1,2,3}};
        int [][] secondaMatrice={{1,2,3},{1,2,3}};
        int numeroRigheUguali=0;
        for(int i=0;i<primaMatrice.length;i++){
            boolean uguali=true;
            for(int j=0;j<primaMatrice[i].length;j++){
                if(i+1<primaMatrice.length){
                    if(primaMatrice[i][j]==secondaMatrice[i][j])
                        uguali=uguali && true;
                    else
                        uguali=uguali && false;
                }//end if
            }//end for
            if(uguali)
                numeroRigheUguali+=1;
        }//end for
        System.out.println("Le Matrici hanno "+numeroRigheUguali+" righe uguali");
    }//end main
}//end RigheUgualiArray
