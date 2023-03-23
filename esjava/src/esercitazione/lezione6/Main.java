package esercitazione.lezione6;

public class Main {
    public static void main(String[] args) {
        Rettangolo tr1=new Rettangolo(12.0,15.0,95.0);
        System.out.println("--------------------------------------------------------------triangolo rettangolo");
        System.out.println("il perimetro è: "+tr1.calcolaPerimetro());
        System.out.println("L'area è : "+tr1.calcolaArea());
        Isoscele ti2=new Isoscele(20,89,10);
        System.out.println("---------------------------------------------------------------triangolo isoscele");
        System.out.println("il perimetro è: "+ti2.calcolaPerimetro());
        System.out.println("L'area è : "+ti2.calcolaArea());
        Scaleno ts3=new Scaleno(5,7,6,9);
        System.out.println("---------------------------------------------------------------triangolo scaleno");
        System.out.println("il perimetro è: "+ts3.calcolaPerimetro());
        System.out.println("L'area è : "+ts3.calcolaArea());
        
    }
}
