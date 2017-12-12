package com.sda.javaldz4.parzystosc;

public class Tab2 {
    public static void main(String[] args) {

        int[] Tabliczka = new int[10];

        for (int i = 0; i < 10; i++) {
            Tabliczka[i] = i + 1;
        }
        for (int i = 2; i < 10; i = i + 3) {
            Tabliczka[i] += Tabliczka[i - 1];
        }
        wyswietlListe(Tabliczka);
        for (int i = 0; i < 10; i++) {
            if (Tabliczka[i] % 2 == 0) {
                Tabliczka[i] = Tabliczka[i] / 2;
            }


        }
        wyswietlListe(Tabliczka);
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            suma = Tabliczka[i] + suma;
        }
        System.out.println("Suma:" + suma);

        int przedostatnia = 0;
        int ostatnia = 0;

        for (int i = 0; i < Tabliczka.length; i++) {
            if ((i == 0) || (i == 1)) {
                System.out.println(String.format("%d element ciągu = %d", i, 1));
            } else {
                int posr = ostatnia + przedostatnia;
                przedostatnia = ostatnia;
                ostatnia = posr;
                Tabliczka[i] = Tabliczka[i];
            }

        }
    }


    private static void wyswietlListe(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println("\n ======================");
    }

}
