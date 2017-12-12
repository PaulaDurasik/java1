package com.sda.javaldz4.parzystosc;

public class Tablice {
    public static void main(String[] args) {

        wstawianiePobieranieWartosci();


    }

    private static void wstawianiePobieranieWartosci(){
        int[] liczbyCalkowite=new int[10];
        liczbyCalkowite[1]=20;
        liczbyCalkowite[5]=-23;
        liczbyCalkowite[0]=liczbyCalkowite[1]+liczbyCalkowite[5];
        wyswietlListe(liczbyCalkowite);
        int tmp=liczbyCalkowite[1];
        liczbyCalkowite[1]=liczbyCalkowite[5];
        liczbyCalkowite[5]=tmp;


}
    private static void przekladDeklaracjiTablic() {
        int[] liczbyCalkowite = new int[10];
        int[] liczbyCalkowite2 = {1, 2, 3, 4, 5, 6};
        int[] liczbyCalkowie3 = new int[]{1, 2, 3, 4, 5, 6, 7};
        wyswietlListe(liczbyCalkowite);
        for (int i = 0; i < liczbyCalkowite2.length; i++) {
            System.out.print(liczbyCalkowite2[i] + " ");
        }
        System.out.println("=======================");
        for (int i = 0; i < liczbyCalkowie3.length; i++) {
            System.out.print(liczbyCalkowie3[i] + " ");
        }
    }

    private static void wyswietlListe(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println("\n ======================");
    }
}