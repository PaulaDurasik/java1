package com.sda.javaldz4.sortowanie.sortowaniebabelkowe;

import com.sda.javaldz4.biblioteka.Porzadek;
import com.sda.javaldz4.sortowanie.Sortowanie;

import java.util.ArrayList;
import java.util.List;

public class SortPrzezWstawWitek implements Sortowanie {
    @Override
    public int[] sortuj(int[] tablicaElementow, Porzadek porzadek) {

        List<Integer> wynik=new ArrayList<>();
        for(int i=0;i<tablicaElementow.length; i++){
            if(wynik.isEmpty()){
                wynik.add(tablicaElementow[i]);
                continue;
            }
            boolean czyDodano=false;
            for(int j=0;j<tablicaElementow.length; j++){
                if(tablicaElementow[i]<wynik.get(i)){
                    wynik.add(j,tablicaElementow[i]);
                    czyDodano=true;
                    break;
                }
            }
            if(!czyDodano){
                wynik.add(tablicaElementow[i]);
            }
        }
        for(int i=0; i<wynik.size(); i++){
            tablicaElementow[i]=wynik.get(i);
        }
        return tablicaElementow;
    }
}


