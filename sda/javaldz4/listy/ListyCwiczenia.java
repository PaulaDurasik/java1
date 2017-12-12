package com.sda.javaldz4.listy;

import java.util.*;

public class ListyCwiczenia {
    public static void main(String[] args) {
        tworzenieListy();
        dodawanieElementowList();
        zamianaMiejscnaLiscie();
        iterowaniepoLiscie();
    }

    public static void zamianaMiejscnaLiscie() {
        List<Integer> listaLiczby = new ArrayList<>();
        for (int i = 20; i > 10; i--) {
            listaLiczby.add(i);
        }
        System.out.println(listaLiczby);// podmieniamy liczby
        int liczba13 = listaLiczby.get(7);
        int liczba18 = listaLiczby.get(2);
        listaLiczby.remove(2);
        listaLiczby.remove(7);
        listaLiczby.add(2, liczba13);
        listaLiczby.add(7, liczba18);
        System.out.println(listaLiczby);

    }

    public static void dodawanieElementowList() {
        List<Integer> listaliczb = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int liczba = random.nextInt(200);
            listaliczb.add(liczba);
        }
        System.out.println(listaliczb);
        listaliczb.add(5, 500);
        List<Integer> drugaLista = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            int liczba = random.nextInt(10);
            drugaLista.add(liczba);
        }
        System.out.println("druga Lista");
        System.out.println(drugaLista);
        drugaLista.addAll(listaliczb);// dodawanie list do siebue
        System.out.println("Połącz listy");
        System.out.println(drugaLista);

    }

    public static void tworzenieListy() {
        List<Integer> lista1 = new ArrayList<>();// używamy tego sposobu implememntacji sty bo możemy zmienić rozdzaj na Linkedlist np.
        ArrayList<Integer> lista2 = new ArrayList<>();

        List lista3 = new ArrayList();
        lista1 = new LinkedList<>();
    }

    public static void iterowaniepoLiscie() {
        List<Integer> listaliczb = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int liczba = random.nextInt(200);
            listaliczb.add(liczba);

        }

        for(int i=0; i<listaliczb.size();i++){
            System.out.println(String.format("%d element listy %d",i, listaliczb.get(i)));//MOŻEMY POBRAĆ EMELENTY
        }

        for(Integer liczba: listaliczb){
            System.out.println(String.format("Kolejny element lissty to: %d", liczba));// pobieramy ELEMENTY
        }

        Iterator<Integer> iterator=listaliczb.iterator();// kolejny element
        while(iterator.hasNext()){
            Integer liczba=iterator.next();
            System.out.println("Wartość pobrana z iteratora:"+liczba);
        }
    }
}