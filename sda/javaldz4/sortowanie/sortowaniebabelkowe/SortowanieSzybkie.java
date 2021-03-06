package com.sda.javaldz4.sortowanie.sortowaniebabelkowe;

import com.sda.javaldz4.biblioteka.Porzadek;
import com.sda.javaldz4.sortowanie.Sortowanie;

import java.util.ArrayList;
import java.util.List;

public class SortowanieSzybkie implements Sortowanie {//wyznaczamy środkowy element tablicy i tworzymy dwie tablice, jdena mniejsze
    //niz środkowe druga większa niż środkowe
    @Override
    public int[] sortuj(int[] tablicaElementow, Porzadek porzadek) {
        List<Integer> listaElemwntow=new ArrayList <>();
        for(int eleme: tablicaElementow){
            listaElemwntow.add(eleme);
        }
        AlgorytmSzybkiWyniki wyniki=sortujRekurencyjnie(listaElemwntow);
        for(int i=0; i<tablicaElementow.length;i++){
            tablicaElementow[i]=wyniki.getSrodek().get(i);
        }


        return tablicaElementow;
    }
    private  AlgorytmSzybkiWyniki sortujRekurencyjnie(List<Integer> lista){
        List<Integer> mniejsze=new ArrayList <>();
        List<Integer>wieksze=new ArrayList <>();
        List<Integer> srodek=new ArrayList <>();
        if(lista.size()<2){
            if(!lista.isEmpty()){
                srodek.add(lista.get(0));
            }
            AlgorytmSzybkiWyniki wyniki=new AlgorytmSzybkiWyniki(mniejsze, srodek, wieksze);
            return wyniki;
        }
        int srodkowyIndeks=lista.size()/2;

        srodek.add(lista.get(srodkowyIndeks));
        for(int i=0; i<lista.size();i++){
            if(i!=srodkowyIndeks){
                if(lista.get(i)<=lista.get(srodkowyIndeks)){
                    mniejsze.add(lista.get(i));}
                    else{
                    wieksze.add(lista.get(i));
                }
            }
        }
        AlgorytmSzybkiWyniki wynikiMniejsze=sortujRekurencyjnie(mniejsze);
        AlgorytmSzybkiWyniki wynikiSordkowe=sortujRekurencyjnie(srodek);
        AlgorytmSzybkiWyniki wynikiWieksze=sortujRekurencyjnie(wieksze);
        List<Integer> wyniki=new ArrayList <>();
        wyniki.addAll(wynikiMniejsze.getMniejsze());
        wyniki.addAll(wynikiMniejsze.getSrodek());
        wyniki.addAll(wynikiMniejsze.getWieksze());
        wyniki.addAll(wynikiSordkowe.getSrodek());
        wyniki.addAll(wynikiWieksze.getMniejsze());
        wyniki.addAll(wynikiWieksze.getSrodek());
        wyniki.addAll(wynikiWieksze.getWieksze());
        return new AlgorytmSzybkiWyniki(new ArrayList <>(),wyniki, new ArrayList <>());

    }
}
