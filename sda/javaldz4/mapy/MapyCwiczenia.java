package com.sda.javaldz4.mapy;

import com.sda.javaldz4.biblioteka.Ksiazka;
import com.sda.javaldz4.biblioteka.Kategoria;
import com.sda.javaldz4.dodatkowy.Narzedzia;

import java.util.HashMap;
import java.util.Map;

public class MapyCwiczenia {
    public static void main(String[] args) {
        Map<String, Ksiazka> mapa= new HashMap<>();
        Ksiazka ksiazka1=Narzedzia.utworzKsiazke("Adam", "Mickiewicz", 300,"Pan Tadeusz","12345577", 300, Kategoria.EPOPEJA, 1980);
        Ksiazka ksiazka2=Narzedzia.utworzKsiazke("Adam", "Mickiewicz", 300,"Pan Tadeusz","12345577", 300, Kategoria.EPOPEJA,1980);
        mapa.put("1", ksiazka1);
        mapa.put("2",ksiazka2);
        //Ksiazka poprzednia=mapa.put("1", ksiazka2);
        mapa.remove("1");
        //wyświetla wszystie klucze;
        for (String key: mapa.keySet()){
            System.out.println(key);
        }
        // wyświetl wszystkie wartosci;
        for (Ksiazka ksiazka: mapa.values()){
            System.out.println(ksiazka);
        }

        for(Map.Entry<String, Ksiazka> entry: mapa.entrySet()){
            System.out.println("Klucz"+ entry.getKey());
            System.out.println("Wartość"+entry.getValue());
        }

        //Ksiazka ksiazkaPod1=mapa.get("1");// pobieranie wartości książki
        System.out.println(mapa);
        System.out.println(ksiazka1);

    }
}

