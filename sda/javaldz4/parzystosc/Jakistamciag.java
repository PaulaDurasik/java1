package com.sda.javaldz4.parzystosc;
import java.util.Scanner;

public class Jakistamciag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz liczbę elementów w ciągu:");
        String liczbaUzytkownika = scanner.nextLine();
        int ostatnia=1;
        int przedostania=1;
        try {
            Integer liczba = Integer.parseInt(liczbaUzytkownika);
            for (int i = 0; i < liczba; i++) {
                if ((i == 0) || (i == 1)) {
                    System.out.println(String.format("%d element ciągu = %d", i, 1));
                }
                else {
                    int posr=ostatnia+przedostania;
                    przedostania=ostatnia;
                    ostatnia=posr;
                    System.out.println(String.format("%d element ciągu = %d ",i, posr));
                }

            }
        } catch (NumberFormatException e) {
            System.out.println("Podałeś liczbę niebędącą ciągiem znaków ");
        }

    }
}
