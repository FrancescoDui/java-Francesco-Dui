package esercitazione.lezione9.heshmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class testRegione {
    public static void main(String[] args) {
        ArrayList<String> comuni=new ArrayList<>();
        comuni.add("torino");
        comuni.add("moncalieri");
        comuni.add("settimo");
        HashMap<String, ArrayList<String>> provincia =new HashMap<>();
        provincia.put("torino",comuni);
        provincia.put("biella",new ArrayList<>(Arrays.asList("biella","benna","caprile")));
        ArrayList< HashMap<String, ArrayList<String>>> piemonte=new ArrayList<>();
        piemonte.add(provincia);
        for (int i=0;i<piemonte.size();i++) {
            System.out.println("piemonte:");
            for (ArrayList<String> comune : provincia.values())
                System.out.println(provincia.keySet()+" "+comune);
        }

    }
}
