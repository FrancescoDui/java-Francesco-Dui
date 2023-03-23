package lezione9;
import lezione6.classi.Bottiglia;
public class Main {
    public static void main(String[] args) {
        Bottiglia b=new BottigliaConTappo(1500);
        System.out.println(b);
        b.riempi(1300);
        BottigliaConTappo bt= (BottigliaConTappo)b;
        bt.apri();
        System.out.println(b);
        System.out.println(bt);

    }
}
