package com.sda.javaldz4.zadaniaDomowe;

import java.util.Random;

public class ZadaniaDomoweProgramowanie {
    public static void main(String[] args) {
        int [] tab= new int[20];
        wybieranieLosowe();
        liczbaMax();
        sredniaArytmetyczna();
        rozneWarunki();

    }


     static int[] wybieranieLosowe() {
         int [] tab= new int[20];
         for (int i = 0; i < tab.length; i++) {
             Random r = new Random();
             tab[i] = r.nextInt(100);
         }
         wyswietlListe(tab);
         return tab;
     }




    static int [] liczbaMax() {
        int [] tab= new int[20];
        int max = 0;
        int zero = 0;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
            System.out.print(max + " ");

        }
        return tab;
    }

    private static void sredniaArytmetyczna() {
        int [] tab= new int[20];
        int suma = 0;
        int srednia = 0;
        for (int i = 0; i < tab.length; i++) {
            suma = tab[i] + suma;
            srednia = suma / tab.length;

        }
        System.out.println("Suma :" + suma);
        System.out.print(" \n Srednia arytmetyczna :" + srednia);
    }

    private static void rozneWarunki() {
        int [] tab=new int[20];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 20) {
                tab[i] = tab[i] * 2;
            } else if (tab[i] % 5 == 0) {
                tab[i] = tab[i] + 2;
            } else if (tab[i] == 50) {
                tab[i] = tab[i] * tab[i];
            } else if (tab[i] > 80) {
                tab[i] = tab[i] - tab[0];
            }


        }
        wyswietlListe(tab);
    }


    private static void wyswietlListe(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println("\n ======================");
    }

}