package com.sda.javaldz4.parzystosc;

import java.util.Scanner;

/** Klasa do spraedzenie czy liczba jest parzysta
 *
 */

public class Parzystosc {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        String liczbaUzytkownika=scanner.nextLine();//zamienia string na liczbę
        try {
            Integer liczba = Integer.parseInt(liczbaUzytkownika);
            // działanie modulo sprawdzamy czy jest reszta
            if (liczba % 2 == 0) {
                System.out.println("podałeś liczbę parzystą");
            } else System.out.println("podałeś liczbę nieparzystą");
        } catch (NumberFormatException  e) {
            System.out.println("Podałeś ciąg znaków niebędacych liczbą ");
        }
        }

    }

