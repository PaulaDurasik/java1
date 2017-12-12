package ZadaniaDomowe;

import java.util.ArrayList;
import java.util.Collections;

public class Zadwrzesientrzynasty {
    public static void main(String[]args){

        ArrayList<String> lista=new ArrayList<>();
        ArrayList wspak=new ArrayList();
        ArrayList zmieszana=new ArrayList();
        lista.add("Paula");
        lista.add("Maria");
        lista.add("Durasik");
        System.out.println("Lista:"+lista.toString()+"\n" );
        wspak=(ArrayList)lista.clone();
        Collections.reverse(wspak);
        System.out.println("Lista wspak:"+wspak.toString()+"\n");
        zmieszana=(ArrayList)lista.clone();
        Collections.shuffle(zmieszana);
        System.out.println("Lista zmieszana:"+zmieszana.toString()+"\n");

    }
}
