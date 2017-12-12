package com.sda.javaldz4.zbiory;

import com.sda.javaldz4.biblioteka.*;
import com.sda.javaldz4.dodatkowy.Narzedzia;
import sun.reflect.generics.tree.Tree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ZbiorCwiczenia {
    public static void main(String[] args) {
        Set<Ksiazka> hashSet=new HashSet<>();
       // TreeSet treeSet=new TreeSet<>(new PorownywarkaKsiazek(Kryterium.TYTUL, Porzadek.ROSNACO));
        TreeSet treeSet=new TreeSet<>();

        Ksiazka ksiazka= Narzedzia.utworzKsiazke("Adam", "Mickiewicz", 219,"Pan Tadeusz","12345677899",300,
                Kategoria.EPOPEJA, 1980);
        Ksiazka ksiazka2= Narzedzia.utworzKsiazke("Adam", "Mickiewicz", 219,"Dziedy","12345677899",300,
                Kategoria.EPOPEJA, 1960);
        Ksiazka ksiazka3= Narzedzia.utworzKsiazke("Dan", "Brown",50, "Inferno", "83545453454", 500, Kategoria.SCIFI, 1909);
        Ksiazka ksiazka4= Narzedzia.utworzKsiazke("Cay","Horstman", 45, "Java Technika Zawansowama", "1234566778", 944,Kategoria.IT, 985);
        Ksiazka ksiazka5=Narzedzia.utworzKsiazke("George", "Martin", 50, "Gra o Tron", "6767676767676", 600, Kategoria.DRAMAT, 19876);


        System.out.println(ksiazka.equals(ksiazka2));
        hashSet.add(ksiazka);
        treeSet.add(ksiazka);
        hashSet.add(ksiazka2);// wysyoluje metodę equals która zwraca fals
        treeSet.add(ksiazka2);
        hashSet.add(ksiazka3);
        treeSet.add(ksiazka3);
        hashSet.add(ksiazka4);// wysyoluje metodę equals która zwraca fals
        treeSet.add(ksiazka4);
        hashSet.add(ksiazka5);
        treeSet.add(ksiazka5);

        //for(Ksiazka ks: hashSet){
            //System.out.println("Iteracja po tablicy: "+ks);
        //}

        Iterator<Ksiazka> iterator=hashSet.iterator();
        while(iterator.hasNext()){
            Ksiazka ks=iterator.next();
            System.out.println("Iteracja hashnext to tablicy"+ ks);
        }

        hashSet.remove(ksiazka);


        System.out.println(hashSet);
        System.out.println(treeSet);

    }
}
