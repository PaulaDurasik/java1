package com.sda.javaldz4.sortowanie.sortowaniebabelkowe;

import com.sda.javaldz4.biblioteka.Porzadek;
import com.sda.javaldz4.sortowanie.Sortowanie;

import java.util.ArrayList;
import java.util.List;

public class SortowaniePrzezZliczanie implements Sortowanie {
    @Override
    public int[] sortuj(int[] tablicaElementow, Porzadek porzadek) {
        int max=0;
        for(int i=0; i<tablicaElementow.length; i++){
            if(tablicaElementow[i]>max){
                max=tablicaElementow[i];
            }
        }
        int[]zlicznaieElementow=new int[max+1];// maksymalna wartość
        for(int i=0;i<tablicaElementow.length;i++){// zlicza po kolei ile mamy wartości w danym indeksie
            int liczba=tablicaElementow[i];
            zlicznaieElementow[liczba]+=1;
        }
        List<Integer>list=new ArrayList <>();
        for(int i=0; i<zlicznaieElementow.length;i++){// zmieniamy na liste
            for(int j=0;j<zlicznaieElementow[i];j++){
                list.add(i);
            }
        }
        for(int i=0;i<list.size();i++){
            tablicaElementow[i]=list.get(i);//zmieniamy na tablicę
        }
        return tablicaElementow;
    }
}
