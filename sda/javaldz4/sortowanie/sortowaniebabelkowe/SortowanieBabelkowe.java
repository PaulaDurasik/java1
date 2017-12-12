package com.sda.javaldz4.sortowanie.sortowaniebabelkowe;

import com.sda.javaldz4.biblioteka.Porzadek;
import com.sda.javaldz4.sortowanie.Sortowanie;
import com.sda.javaldz4.sortowanie.SortowanieUI;

public class SortowanieBabelkowe implements Sortowanie {
    @Override
    public int[] sortuj(int[] tablicaElementow, Porzadek porzadek) {
        int iloscOperacji=0;
        for(int i=0; i<tablicaElementow.length;i++){
            System.out.println("biore i-ty element tablicy "+ i+"jest to livzba"+tablicaElementow[i]);
            for(int j=i+1; j<tablicaElementow.length; j++){
                System.out.println("biorę j-ty element tab"+ j+"jest to liczba"+tablicaElementow[j]);
                iloscOperacji++;
                if(i!=j){
                    switch(porzadek){
                        case ROSNACO:
                            System.out.println(String.format("Porównujeczy liczba %d<%d" +tablicaElementow[j]+tablicaElementow[i]
                                    ));
                            if(tablicaElementow[j]<tablicaElementow[i]){
                                //Zamień miejsce wartosci w tablicy;
                                int tmp=tablicaElementow[i];
                                tablicaElementow[i]=tablicaElementow[j];
                                tablicaElementow[j]=tmp;
                            }
                            break;
                        case MALEJACO:
                            if(tablicaElementow[j]>tablicaElementow[i]){
                                //Zamień miejsce wartosci w tablicy;
                                int tmp=tablicaElementow[i];
                                tablicaElementow[i]=tablicaElementow[j];
                                tablicaElementow[j]=tmp;
                            }
                            break;
                            //Nie chcemy porównywać tego samego elementu

                    }
                }
            }
            SortowanieUI.wystwietlTablice(tablicaElementow);
        }
        SortowanieUI.wystwietlTablice(tablicaElementow);
        System.out.println("ILOŚĆ OPERACJI :"+ iloscOperacji);
        return tablicaElementow;
    }
}
