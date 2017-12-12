package com.sda.javaldz4.sortowanie;

import com.sda.javaldz4.biblioteka.Porzadek;
import com.sda.javaldz4.sortowanie.sortowaniebabelkowe.SortowanieBabelkowe;
import com.sda.javaldz4.sortowanie.sortowaniebabelkowe.SortowaniePrzezWstawianie;
import com.sda.javaldz4.sortowanie.sortowaniebabelkowe.SortowaniePrzezybor;
import com.sda.javaldz4.sortowanie.sortowaniebabelkowe.SortowanieSzybkie;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortowanieUI {
    private static List<Integer> sortuj2;

    public static void main(String[] args) {
        int [] tablica=new int[]{2,8,5,9,6,8,5,7,5,1,8,4,6,2};
        Sortowanie [] sortowanie1=new Sortowanie[5];
        sortowanie1 [0]=new SortowanieBabelkowe();
        sortowanie1 [1]=new SortowaniePrzezybor();
        

        //Sortowanie sortowanie=new SortowaniePrzezybor();

      //  System.out.println("Lista"+lista);
       // System.out.println("Lista posortowana"+ SortowaniePrzezWstawianie.sortuj2(lista, Porzadek.ROSNACO));
      //  wystwietlTablice(tablica);
        //Sortowanie sortowanie=new SortowanieBabelkowe();
       // Sortowanie sortowanie= new SortowanieSzybkie();
        //tablica=sortowanie.sortuj(tablica, Porzadek.MALEJACO);

      //  wystwietlTablice(tablica);
    }

    public static void wystwietlTablice(int[] tablica){
        for(int elem: tablica){
            System.out.print(elem+" ");

        }
        System.out.println( );
    }
}
