package ZadaniaDomowe;

import java.util.ArrayList;

public class ZadWrzesienTrzy {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> wspak = new ArrayList<>();
        ArrayList <Integer> zmieszana = new ArrayList<>();
        lista.add(0);
        lista.add(5);
        lista.add(9);
        lista.add(1);
        lista.add(2);
        Integer dllisty = lista.size();
        for (int i = dllisty - 1; i >= 0; i--) {
            lista.add(lista.get(i));
            System.out.println(lista.get(i));
        }
        for(int i=0;i<=dllisty-1; i++){
            lista.add(lista.get(i));
            System.out.println(lista.get(i));
        }




    }
}




