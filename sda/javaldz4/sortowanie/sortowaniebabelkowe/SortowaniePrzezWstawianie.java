package com.sda.javaldz4.sortowanie.sortowaniebabelkowe;

import com.sda.javaldz4.biblioteka.Porzadek;
import com.sda.javaldz4.sortowanie.Sortowanie;

import java.util.ArrayList;
import java.util.List;

public class SortowaniePrzezWstawianie implements Sortowanie {
    public static List <Integer> sortuj2(List <Integer> lista, Porzadek porzadek) {
        int[]array=new int[lista.size()];
        List <Integer> wynik = new ArrayList <>();
        wynik.add(lista.get(0));
        for (int i = 1; i < lista.size(); i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(i) < wynik.get(j)) {
                    wynik.add(j,lista.get(i));
                    break;

                } else if(j==wynik.size()-1){
                    wynik.add(lista.get(i));
                    break;
                }
            }



        } return wynik;



    }


    @Override
    public int[] sortuj(int[] tablicaElementow, Porzadek porzadek) {
        return new int[0];
    }
}
