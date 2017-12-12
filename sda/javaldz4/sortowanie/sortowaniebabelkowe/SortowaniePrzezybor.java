package com.sda.javaldz4.sortowanie.sortowaniebabelkowe;

import com.sda.javaldz4.biblioteka.Porzadek;
import com.sda.javaldz4.sortowanie.Sortowanie;

public class SortowaniePrzezybor implements Sortowanie {
    @Override
    public int[] sortuj(int[] tablicaElementow, Porzadek porzadek) {
        for(int i=0; i<tablicaElementow.length; i++){
            int min=tablicaElementow[i];
            int indeksmin=i;
            for(int j=i+1;j<tablicaElementow.length;j++){
                //szukamy najmniejszego elementu w tablicy
                if(tablicaElementow[j]<min){
                    min=tablicaElementow[j];
                    indeksmin=j;
                }

            }
            tablicaElementow[indeksmin]=tablicaElementow[i];
            tablicaElementow[i]=min;
        }
        return tablicaElementow;
    }
}
