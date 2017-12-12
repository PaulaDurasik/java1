package com.sda.javaldz4.parzystosc;
import java.util.Scanner;

public class Wielokrotnosc {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");

        String liczbaUzytkow1=scanner.nextLine();

        try {
            Integer liczba1 = Integer.parseInt(liczbaUzytkow1);
            System.out.println("podaj drugą liczbę");
            String liczbaUzytkow2=scanner.nextLine();
            Integer liczba2 = Integer.parseInt(liczbaUzytkow2);
            if (liczba2 > 0) {
                Integer wynik = liczba1 * liczba2;
                System.out.println(wynik);
            } else System.out.println("podaj liczbę większą od 0");
        } catch (NumberFormatException e){
            System.out.println("Podałeś liczbę niebędącą ciągiem znaków ");
        }
        }

    }

